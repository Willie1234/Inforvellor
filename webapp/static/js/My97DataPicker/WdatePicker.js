/*
 * My97 DatePicker 4.8 Beta4
 * License: http://www.my97.net/dp/license.asp
 */
var $dp, WdatePicker;
(function() {
	var $ = {
	    $langList: [{
        	//英语
            name: "en",
            charset: "UTF-8"
        },
        {
        	//中文
            name: "zh-cn",
            charset: "UTF-8"
        },
        {
        	//台湾语
            name: "zh-tw",
            charset: "UTF-8"
        },
        {
        	//西班牙
        	name: "sp",
        	charset: "UTF-8"
        },
        {
        	//俄语
        	name: "ru",
        	charset: "UTF-8"
        },
        {
        	//葡萄牙语
        	name: "po",
        	charset: "UTF-8"
        },
        {
        	//韩语
        	name: "ko",
        	charset: "UTF-8"
        },
        {
        	//日语
        	name: "jp",
        	charset: "UTF-8"
        },
        {
        	//法语
            name: "fr",
            charset: "UTF-8"
        }],
		$skinList : [ {
			name : "default",
			charset : "gb2312"
		}, {
			name : "whyGreen",
			charset : "gb2312"
		}, {
			name : "blue",
			charset : "gb2312"
		}, {
			name : "green",
			charset : "gb2312"
		}, {
			name : "simple",
			charset : "gb2312"
		}, {
			name : "ext",
			charset : "gb2312"
		}, {
			name : "blueFresh",
			charset : "gb2312"
		}, {
			name : "twoer",
			charset : "gb2312"
		}, {
			name : "YcloudRed",
			charset : "gb2312"
		} ],
		$wdate : true,
		$crossFrame : true,
		$preLoad : false,
		$dpPath : "",
		doubleCalendar : false,
		enableKeyboard : true,
		enableInputMask : true,
		autoUpdateOnChanged : null,
		weekMethod : "ISO8601",
		position : {},
		lang : "auto",
		skin : "twoer",
		dateFmt : "yyyy-MM-dd",
		realDateFmt : "yyyy-MM-dd",
		realTimeFmt : "HH:mm:ss",
		realFullFmt : "%Date %Time",
		minDate : "1900-01-01 00:00:00",
		maxDate : "2099-12-31 23:59:59",
		startDate : "",
		alwaysUseStartDate : false,
		yearOffset : 1911,
		firstDayOfWeek : 0,
		isShowWeek : false,
		highLineWeekDay : true,
		isShowClear : true,
		isShowToday : true,
		isShowOK : true,
		isShowOthers : true,
		readOnly : true,
		errDealMode : 0,
		autoPickDate : null,
		qsEnabled : true,
		autoShowQS : false,
		opposite : false,
		hmsMenuCfg : {
			H : [ 1, 6 ],
			m : [ 5, 6 ],
			s : [ 15, 4 ]
		},
		opposite : false,

		specialDates : null,
		specialDays : null,
		disabledDates : null,
		disabledDays : null,
		onpicking : null,
		onpicked : null,
		onclearing : null,
		oncleared : null,
		ychanging : null,
		ychanged : null,
		Mchanging : null,
		Mchanged : null,
		dchanging : null,
		dchanged : null,
		Hchanging : null,
		Hchanged : null,
		mchanging : null,
		mchanged : null,
		schanging : null,
		schanged : null,
		eCont : null,
		vel : null,
		elProp : "",
		errMsg : "",
		quickSel : [],
		has : {},
		getRealLang : function() {
			var _ = $.$langList;
			for (var A = 0; A < _.length; A++)
				if (_[A].name == this.lang)
					return _[A];
			return _[0]
		}
	};
	WdatePicker = U;
	var Y = window, T = {
		innerHTML : ""
	}, N = "document", H = "documentElement", C = "getElementsByTagName", V, A, S, G, c, X = navigator.appName;
	if (X == "Microsoft Internet Explorer")
		S = true;
	else if (X == "Opera")
		c = true;
	else
		G = true;
	A = $.$dpPath || J();
	if ($.$wdate)
		K(A + "skin/WdatePicker.css");
	V = Y;
	if ($.$crossFrame) {
		try {
			while (V.parent != V && V.parent[N][C]("frameset").length == 0)
				V = V.parent
		} catch (O) {
		}
	}
	if (!V.$dp)
		V.$dp = {
			ff : G,
			ie : S,
			opera : c,
			status : 0,
			defMinDate : $.minDate,
			defMaxDate : $.maxDate
		};
	B();
	if ($.$preLoad && $dp.status == 0)
		E(Y, "onload", function() {
			U(null, true)
		});
	if (!Y[N].docMD) {
		E(Y[N], "onmousedown", D, true);
		Y[N].docMD = true
	}
	if (!V[N].docMD) {
		E(V[N], "onmousedown", D, true);
		V[N].docMD = true
	}
	E(Y, "onunload", function() {
		if ($dp.dd)
			P($dp.dd, "none")
	});
	function B() {
		try {
			V[N], V.$dp = V.$dp || {}
		} catch ($) {
			V = Y;
			$dp = $dp || {}
		}
		var A = {
			win : Y,
			$ : function($) {
				return (typeof $ == "string") ? Y[N].getElementById($) : $
			},
			$D : function($, _) {
				return this.$DV(this.$($).value, _)
			},
			$DV : function(_, $) {
				if (_ != "") {
					this.dt = $dp.cal.splitDate(_, $dp.cal.dateFmt);
					if ($)
						for ( var B in $)
							if (this.dt[B] === undefined)
								this.errMsg = "invalid property:" + B;
							else {
								this.dt[B] += $[B];
								if (B == "M") {
									var C = $["M"] > 0 ? 1 : 0, A = new Date(
											this.dt["y"], this.dt["M"], 0)
											.getDate();
									this.dt["d"] = Math
											.min(A + C, this.dt["d"])
								}
							}
					if (this.dt.refresh())
						return this.dt
				}
				return ""
			},
			show : function() {
				var A = V[N].getElementsByTagName("div"), $ = 100000;
				for (var B = 0; B < A.length; B++) {
					var _ = parseInt(A[B].style.zIndex);
					if (_ > $)
						$ = _
				}
				this.dd.style.zIndex = $ + 2;
				P(this.dd, "block");
				P(this.dd.firstChild, "")
			},
			unbind : function($) {
				$ = this.$($);
				if ($.initcfg) {
					L($, "onclick", function() {
						U($.initcfg)
					});
					L($, "onfocus", function() {
						U($.initcfg)
					})
				}
			},
			hide : function() {
				P(this.dd, "none")
			},
			attachEvent : E
		};
		for ( var _ in A)
			V.$dp[_] = A[_];
		$dp = V.$dp
	}
	function E(B, _, A, $) {
		if (B.addEventListener) {
			var C = _.replace(/on/, "");
			A._ieEmuEventHandler = function($) {
				return A($)
			};
			B.addEventListener(C, A._ieEmuEventHandler, $)
		} else
			B.attachEvent(_, A)
	}
	function L(A, $, _) {
		if (A.removeEventListener) {
			var B = $.replace(/on/, "");
			_._ieEmuEventHandler = function($) {
				return _($)
			};
			A.removeEventListener(B, _._ieEmuEventHandler, false)
		} else
			A.detachEvent($, _)
	}
	function a(_, $, A) {
		if (typeof _ != typeof $)
			return false;
		if (typeof _ == "object") {
			if (!A)
				for ( var B in _) {
					if (typeof $[B] == "undefined")
						return false;
					if (!a(_[B], $[B], true))
						return false
				}
			return true
		} else if (typeof _ == "function" && typeof $ == "function")
			return _.toString() == $.toString();
		else
			return _ == $
	}
	function J() {
		var _, A, $ = Y[N][C]("script");
		for (var B = 0; B < $.length; B++) {
			_ = $[B].getAttribute("src") || "";
			_ = _.substr(0, _.toLowerCase().indexOf("wdatepicker.js"));
			A = _.lastIndexOf("/");
			if (A > 0)
				_ = _.substring(0, A + 1);
			if (_)
				break
		}
		return _
	}
	function K(A, $, B) {
		var D = Y[N][C]("HEAD").item(0), _ = Y[N].createElement("link");
		if (D) {
			_.href = A;
			_.rel = "stylesheet";
			_.type = "text/css";
			if ($)
				_.title = $;
			if (B)
				_.charset = B;
			D.appendChild(_)
		}
	}
	function F($) {
		$ = $ || V;
		var A = 0, _ = 0;
		while ($ != V) {
			var D = $.parent[N][C]("iframe");
			for (var F = 0; F < D.length; F++) {
				try {
					if (D[F].contentWindow == $) {
						var E = W(D[F]);
						A += E.left;
						_ += E.top;
						break
					}
				} catch (B) {
				}
			}
			$ = $.parent
		}
		return {
			"leftM" : A,
			"topM" : _
		}
	}
	function W(G, F) {
		if (G.getBoundingClientRect)
			return G.getBoundingClientRect();
		else {
			var A = {
				ROOT_TAG : /^body|html$/i,
				OP_SCROLL : /^(?:inline|table-row)$/i
			}, E = false, I = null, _ = G.offsetTop, H = G.offsetLeft, D = G.offsetWidth, B = G.offsetHeight, C = G.offsetParent;
			if (C != G)
				while (C) {
					H += C.offsetLeft;
					_ += C.offsetTop;
					if (R(C, "position").toLowerCase() == "fixed")
						E = true;
					else if (C.tagName.toLowerCase() == "body")
						I = C.ownerDocument.defaultView;
					C = C.offsetParent
				}
			C = G.parentNode;
			while (C.tagName && !A.ROOT_TAG.test(C.tagName)) {
				if (C.scrollTop || C.scrollLeft)
					if (!A.OP_SCROLL.test(P(C)))
						if (!c || C.style.overflow !== "visible") {
							H -= C.scrollLeft;
							_ -= C.scrollTop
						}
				C = C.parentNode
			}
			if (!E) {
				var $ = b(I);
				H -= $.left;
				_ -= $.top
			}
			D += H;
			B += _;
			return {
				"left" : H,
				"top" : _,
				"right" : D,
				"bottom" : B
			}
		}
	}
	function M($) {
		$ = $ || V;
		var B = $[N], A = ($.innerWidth) ? $.innerWidth
				: (B[H] && B[H].clientWidth) ? B[H].clientWidth
						: B.body.offsetWidth, _ = ($.innerHeight) ? $.innerHeight
				: (B[H] && B[H].clientHeight) ? B[H].clientHeight
						: B.body.offsetHeight;
		return {
			"width" : A,
			"height" : _
		}
	}
	function b($) {
		$ = $ || V;
		var B = $[N], A = B[H], _ = B.body;
		B = (A && A.scrollTop != null && (A.scrollTop > _.scrollTop || A.scrollLeft > _.scrollLeft)) ? A
				: _;
		return {
			"top" : B.scrollTop,
			"left" : B.scrollLeft
		}
	}
	function D($) {
		try {
			var _ = $ ? ($.srcElement || $.target) : null;
			if ($dp.cal && !$dp.eCont && $dp.dd && _ != $dp.el
					&& $dp.dd.style.display == "block")
				$dp.cal.close()
		} catch ($) {
		}
	}
	function Z() {
		$dp.status = 2
	}
	var Q, _;
	function U(K, C) {
		if (!$dp)
			return;
		B();
		var L = {};
		for ( var H in K)
			L[H] = K[H];
		for (H in $)
			if (H.substring(0, 1) != "$" && L[H] === undefined)
				L[H] = $[H];
		if (C) {
			if (!J()) {
				_ = _ || setInterval(function() {
					if (V[N].readyState == "complete")
						clearInterval(_);
					U(null, true)
				}, 50);
				return
			}
			if ($dp.status == 0) {
				$dp.status = 1;
				L.el = T;
				I(L, true)
			} else
				return
		} else if (L.eCont) {
			L.eCont = $dp.$(L.eCont);
			L.el = T;
			L.autoPickDate = true;
			L.qsEnabled = false;
			I(L)
		} else {
			if ($.$preLoad && $dp.status != 2)
				return;
			var F = D();
			if (Y.event === F || F) {
				L.srcEl = F.srcElement || F.target;
				F.cancelBubble = true
			}
			L.el = L.el = $dp.$(L.el || L.srcEl);
			if (!L.el
					|| L.el["My97Mark"] === true
					|| L.el.disabled
					|| ($dp.dd && P($dp.dd) != "none" && $dp.dd.style.left != "-970px")) {
				try {
					if (L.el["My97Mark"])
						L.el["My97Mark"] = false
				} catch (A) {
				}
				return
			}
			if (F && L.el.nodeType == 1 && !a(L.el.initcfg, K)) {
				$dp.unbind(L.el);
				E(L.el, F.type == "focus" ? "onclick" : "onfocus", function() {
					U(K)
				});
				L.el.initcfg = K
			}
			I(L)
		}
		function J() {
			if (S && V != Y && V[N].readyState != "complete")
				return false;
			return true
		}
		function D() {
			if (G) {
				func = D.caller;
				while (func != null) {
					var $ = func.arguments[0];
					if ($ && ($ + "").indexOf("Event") >= 0)
						return $;
					func = func.caller
				}
				return null
			}
			return event
		}
	}
	function R(_, $) {
		return _.currentStyle ? _.currentStyle[$] : document.defaultView
				.getComputedStyle(_, false)[$]
	}
	function P(_, $) {
		if (_)
			if ($ != null)
				_.style.display = $;
			else
				return R(_, "display")
	}
	function I(G, _) {
		var D = G.el ? G.el.nodeName : "INPUT";
		if (_ || G.eCont || new RegExp(/input|textarea|div|span|p|a/ig).test(D))
			G.elProp = D == "INPUT" ? "value" : "innerHTML";
		else
			return;
		if (G.lang == "auto")
			G.lang = S ? navigator.browserLanguage.toLowerCase()
					: navigator.language.toLowerCase();
		if (!G.eCont)
			for ( var C in G)
				$dp[C] = G[C];
		if (!$dp.dd
				|| G.eCont
				|| ($dp.dd && (G.getRealLang().name != $dp.dd.lang || G.skin != $dp.dd.skin))) {
			if (G.eCont)
				E(G.eCont, G);
			else {
				$dp.dd = V[N].createElement("DIV");
				$dp.dd.style.cssText = "position:absolute";
				V[N].body.appendChild($dp.dd);
				E($dp.dd, G);
				if (_)
					$dp.dd.style.left = $dp.dd.style.top = "-970px";
				else {
					$dp.show();
					B($dp)
				}
			}
		} else if ($dp.cal) {
			$dp.show();
			$dp.cal.init();
			if (!$dp.eCont)
				B($dp)
		}
		function E(K, J) {
			var I = V[N].domain, F = false, G = "<iframe hideFocus=true width=9 height=7 frameborder=0 border=0 scrolling=no src=\"about:blank\"></iframe>";
			K.innerHTML = G;
			var _ = $.$langList, D = $.$skinList, H;
			try {
				H = K.lastChild.contentWindow[N]
			} catch (E) {
				F = true;
				K.removeChild(K.lastChild);
				var L = V[N].createElement("iframe");
				L.hideFocus = true;
				L.frameBorder = 0;
				L.scrolling = "no";
				L.src = "javascript:(function(){var d=document;d.open();d.domain='"
						+ I + "';})()";
				K.appendChild(L);
				setTimeout(function() {
					H = K.lastChild.contentWindow[N];
					C()
				}, 97);
				return
			}
			C();
			function C() {
				var _ = J.getRealLang();
				K.lang = _.name;
				K.skin = J.skin;
				var $ = [
						"<head><script>",
						"",
						"var doc=document, $d, $dp, $cfg=doc.cfg, $pdp = parent.$dp, $dt, $tdt, $sdt, $lastInput, $IE=$pdp.ie, $FF = $pdp.ff,$OPERA=$pdp.opera, $ny, $cMark = false;",
						"if($cfg.eCont){$dp = {};for(var p in $pdp)$dp[p]=$pdp[p];}else{$dp=$pdp;};for(var p in $cfg){$dp[p]=$cfg[p];}",
						"doc.oncontextmenu=function(){try{$c._fillQS(!$dp.has.d,1);showB($d.qsDivSel);}catch(e){};return false;};",
						"</script><script src=", A, "lang/", _.name,
						".js charset=", _.charset, "></script>" ];
				if (F)
					$[1] = "document.domain=\"" + I + "\";";
				for (var C = 0; C < D.length; C++)
					if (D[C].name == J.skin)
						$
								.push("<link rel=\"stylesheet\" type=\"text/css\" href=\""
										+ A
										+ "skin/"
										+ D[C].name
										+ "/datepicker.css\" charset=\""
										+ D[C].charset + "\"/>");
				$.push("<script src=\"" + A + "calendar.js\"></script>");
				$
						.push("</head><body leftmargin=\"0\" topmargin=\"0\" tabindex=0></body></html>");
				$
						.push("<script>var t;t=t||setInterval(function(){if(doc.ready){new My97DP();$cfg.onload();$c.autoSize();$cfg.setPos($dp);clearInterval(t);}},20);</script>");
				J.setPos = B;
				J.onload = Z;
				H.write("<html>");
				H.cfg = J;
				H.write($.join(""));
				H.close()
			}
		}
		function B(J) {
			var H = J.position.left, C = J.position.top, D = J.el;
			if (D == T)
				return;
			if (D != J.srcEl && (P(D) == "none" || D.type == "hidden"))
				D = J.srcEl;
			var I = W(D), $ = F(Y), E = M(V), B = b(V), G = $dp.dd.offsetHeight, A = $dp.dd.offsetWidth;
			if (isNaN(C))
				C = 0;
			if (($.topM + I.bottom + G > E.height) && ($.topM + I.top - G > 0))
				C += B.top + $.topM + I.top - G - 2;
			else {
				C += B.top + $.topM + I.bottom;
				var _ = C - B.top + G - E.height;
				if (_ > 0)
					C -= _
			}
			if (isNaN(H))
				H = 0;
			H += B.left + Math.min($.leftM + I.left, E.width - A - 5)
					- (S ? 2 : 0);
			J.dd.style.top = C + "px";
			J.dd.style.left = H + "px"
		}
	}
})()