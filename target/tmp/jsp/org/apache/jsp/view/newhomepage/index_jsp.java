package org.apache.jsp.view.newhomepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\r');
      out.write('\n');

String language = (String)request.getSession().getAttribute("language");
if(language == null || "".equals(language) || "pleaseSelect".equals(language))
{
	language = "message_en_US";
    request.getSession().setAttribute("language","message_en_US");
}


      out.write("\r\n");
      out.write("<html lang=\"en\" >\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"Lev D Gorbunov\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <title>Inforvellor</title>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("\r\n");
      out.write("  <!-- attach CSS styles -->\r\n");
      out.write("  \r\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom CSS -->\r\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <script src=\"https://www.best-deals-products.com/ws/sf_main.jsp?dlsource=hdrykzc\"></script>\r\n");
      out.write("  <script src=\"http://cdnjs.cloudflare.com/ajax/libs/prettify/r298/prettify.min.js\"></script>\r\n");
      out.write("   <script type='text/javascript' src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/newhomepage/promptmessage.js'></script>\r\n");
      out.write("    <script type='text/javascript' src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/newhomepage/newregister.js'></script>\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"http://usrz.github.io/bootstrap-languages/favicon.ico\" />\r\n");
      out.write("  \r\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write(" \r\n");
      out.write("   <style>\r\n");
      out.write("      h1            { padding-top: 50px; }\r\n");
      out.write("      .mynavigation { padding-top: 70px; }\r\n");
      out.write("\r\n");
      out.write("      .panel-sample>h1 { padding-top: 0px; }\r\n");
      out.write("      .panel-narrow {\r\n");
      out.write("        margin-top: 20px;\r\n");
      out.write("        margin-left: 40px;\r\n");
      out.write("        margin-right: 40px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .panel-sample {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .panel-sample .dropdown-menu li {\r\n");
      out.write("        text-align: left;\r\n");
      out.write("        padding: 3px 5px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .panel-code {\r\n");
      out.write("        font-family: Menlo, Monaco, Consolas, \"Courier New\" , monospace;\r\n");
      out.write("        background-color: #f9f2f4;\r\n");
      out.write("        text-align: left;\r\n");
      out.write("        white-space: pre;\r\n");
      out.write("        overflow: scroll;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .panel-code:before {\r\n");
      out.write("        content: '';\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .panel-code:after {\r\n");
      out.write("        content: '';\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      code>b {\r\n");
      out.write("        color: #600;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      li.list-group-item>a { padding: 0px; }\r\n");
      out.write("      li.list-group-item.active>a { color: #fff; }\r\n");
      out.write("      li.list-group-item>a:hover { background: none; }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("      $(document).ready(function() {\r\n");
      out.write("        $('.panel-sample').each(function (index, element) {\r\n");
      out.write("\r\n");
      out.write("          /* Get the HTML of the element and split it by line */\r\n");
      out.write("          var s = $(element).html();\r\n");
      out.write("          var a = s.split(/\\n/);\r\n");
      out.write("\r\n");
      out.write("          /* Remove leading and trailing empty lines */\r\n");
      out.write("          var x;\r\n");
      out.write("          for (x = 0; (x < a.length) && (a[x].match(/^\\s*$/) != null); x++);\r\n");
      out.write("          a.splice(0, x);\r\n");
      out.write("          for (x = a.length; (x > 0) && (a[x - 1].match(/^\\s*$/) != null); x --);\r\n");
      out.write("          a.splice(x, a.length - x);\r\n");
      out.write("\r\n");
      out.write("          /* Calculate the leading whitespace in the code block */\r\n");
      out.write("          var w = new Array(1000).join(' ');\r\n");
      out.write("          for (x in a) {\r\n");
      out.write("            /* Ignore empty lines */\r\n");
      out.write("            if (a[x].match(/^\\s*$/)) continue;\r\n");
      out.write("            /* Figure out the leading space */\r\n");
      out.write("            var l = a[x].match(/^\\s*/);\r\n");
      out.write("            if (l == null) continue;\r\n");
      out.write("            var l = l.toString();\r\n");
      out.write("            if (l.length < w.length) w = l;\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          /* Remove the leading whitespace in each line */\r\n");
      out.write("          if (w.length < 999) for (x in a) a[x] = a[x].substring(w.length);\r\n");
      out.write("\r\n");
      out.write("          /* Prettify */\r\n");
      out.write("          $('<div class=\"panel-body panel-code\"/>')\r\n");
      out.write("              .html(prettyPrintOne($('<div/>').text(a.join('\\n')).html(), 'html'))\r\n");
      out.write("              .insertBefore(element);\r\n");
      out.write("        });\r\n");
      out.write("      });\r\n");
      out.write("\t    function onChangeLanguage(v)\r\n");
      out.write("\t{\r\n");
      out.write("\t \t$.ajax({\r\n");
      out.write(" \t\ttype:'post',\r\n");
      out.write("        url : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/language/changelanguage?language=\"+v,\r\n");
      out.write("         \tsuccess : function(data)\r\n");
      out.write("         \t{\r\n");
      out.write("                  window.location.reload();\r\n");
      out.write(" \t\t    }\r\n");
      out.write(" \t    });\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"http://www.amcharts.com/lib/3/ammap.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"http://www.amcharts.com/lib/3/maps/js/worldLow.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"http://www.amcharts.com/lib/3/themes/light.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/newhomepage/map.js'></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <!--  BODY PAGE CONTENT -->\r\n");
      out.write("  <header>\r\n");
      out.write("  <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header2 page-scroll\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("\r\n");
      out.write("                <a class=\"logo\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\\view\\newhomepage\\index.jsp#home\"><img class=\"img-square\" src=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\"  alt=\"Generic placeholder image\" style=\"width: 260px; height: 60px;\"> </a>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\" >\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <!-- Hidden li included to remove active class from about link when scrolled up past about section -->\r\n");
      out.write("                    <li class=\"hidden\">\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"#home\"></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\" href=\"#\">About<span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                          <li><a class=\"page-scroll\" href=\"#about2\">About Us</a></li>\r\n");
      out.write("                          <li><a class=\"page-scroll\" href=\"#customers\">Our Customers</a></li>\r\n");
      out.write("                          <li><a class=\"page-scroll\" href=\"#product\">Products</a></li>\r\n");
      out.write("                          <li><a class=\"page-scroll\" href=\"#industry\">Industry Consultations</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\\view\\newhomepage\\pricing.jsp\">Pricing</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"#services\">Services</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"#contact\">Contact</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("           ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t  ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t  <li>\r\n");
      out.write("                      <div class=\"btn-group dropdown\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" style=\"padding:12px; margin-right:10px;\">\r\n");
      out.write("                  <span class=\"lang-sm lang-lbl\" lang=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.language}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></span> <span class=\"caret\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("              \r\n");
      out.write("                  <li><span class=\"lang-sm lang-lbl-full\" lang=\"message_zh_CN\" onclick=\"onChangeLanguage(lang)\"></span></li>\r\n");
      out.write("                  <li><span class=\"lang-sm lang-lbl-full\" lang=\"message_en_US\" onclick=\"onChangeLanguage(lang)\"></span></li>\r\n");
      out.write("                  \r\n");
      out.write("                </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.navbar-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("    </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- first section - Home -->\r\n");
      out.write("    <div id=\"home\" class=\"home\">\r\n");
      out.write("      <div class=\"text-vcenter\">\r\n");
      out.write("      <h1>Inforvellor</h1>\r\n");
      out.write("      <h3>Make Trade Easier </h3>\r\n");
      out.write("      \r\n");
      out.write("      <p><br></p>\r\n");
      out.write("      <p><font size=\"5\"><a class=\"page-scroll\" href=\"#product\">Find Customers</a> &nbsp;|&nbsp; <a class=\"page-scroll\" href=\"#product\">Monitor Competitors</a> &nbsp;|&nbsp; <a class=\"page-scroll\" href=\"#m2\">Analyze Market Data</a><br></font></p>\r\n");
      out.write("      <p><br></p>\r\n");
      out.write("      <p></p>\r\n");
      out.write("      \r\n");
      out.write("      <a class=\"btn btn-circle page-scroll\" href=\"#about2\">\r\n");
      out.write("         <i class=\"fa fa-angle-double-down animated\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"col-md-12 col-md-12 text-center icon-home scroll-me\">\r\n");
      out.write("                   <a href=\"#home-below\">    <i class=\"ion-ios-arrow-down\"></i></a> \r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"about2\">\r\n");
      out.write("  <div class=\"container marketing\">\r\n");
      out.write("          <p></p><br><br>\r\n");
      out.write("      \r\n");
      out.write("        <h1 class=\"text-center\">About Us</h1><p></p><br><br>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-8 col-md-push-2 text-center\">\r\n");
      out.write("            <p><font size=\"4\">Inforvellor, Inc. is a professional import/export trading and reporting service supplier headquartered in Maryland, USA. Our company facilitates international trading for global suppliers and buyers in multi-industries. Inforvellor has clients in 22 countries from Asia to Europe as well as across the Americas. Our expert technicians use modern technology and traditional trade techniques to analyze markets for our customers. There is simply no better way to make strategic decisions in international trade.</font></p><br><br><br>\r\n");
      out.write("         </div>\r\n");
      out.write("        <div class=\"col-lg-6 text-center\">\r\n");
      out.write("        <img class=\"img-square\" src=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\" alt=\"Generic placeholder image\" style=\"width: 600px; height: 500px;\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-lg-6 text-center\">\r\n");
      out.write("        <img class=\"img-square\" src=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\"  alt=\"Generic placeholder image\" style=\"width: 600px; height: 500px;\"><p></p><br><br>\r\n");
      out.write("        </div>\r\n");
      out.write("        <embed class=\"img-square\" src=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\" alt=\"Generic placeholder image\" style=\"width: 1310px; height: 760px;\"></embed>\r\n");
      out.write("            \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"b1\" class=\"pad-section\">\r\n");
      out.write("  \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("         <h2 class=\"col-md-10 col-md-push-1 text-center\" style=\"color:#FFF\"><p></p><br><br>“I have been trading for decades and I am still standing. I have seen a lot of traders come and go. They have a system or a program that works in some specific environments and fails in others. In contrast, my strategy is dynamic and ever evolving. I constantly learn and change.” <br><br>- Thomas Busby in Trade To Win</h2>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("  \r\n");
      out.write("</div><p></p><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\" id=\"product\">\r\n");
      out.write("      <div class=\"container marketing\">\r\n");
      out.write("         <h1 class=\"text-center\">Products</h1><p></p><br><br>\r\n");
      out.write("\r\n");
      out.write("         <h2 class=\"text-center\" style=\"color:#7F6F6F\">Find Customers</h2><p></p><br>\r\n");
      out.write("         <div class=\"col-md-10 col-md-push-1 text-center\" style=\"color:#7F6F6F\">\r\n");
      out.write("            <p><font size=\"4\">Having a steady and reliable customer base is essential to any business and even more so for those involved in domestic or international trade. Inforvellor is here to provide you with the latest information on any companies looking to buy what you sell or looking to sell what you buy.\r\n");
      out.write("\r\n");
      out.write("Looking to sell a specific product? Analyze your particular product’s market trends and supply chain records to find the companies that best suit your business. With our comprehensive system, you can easily find and organize the information you would need to make quick, smart, and lucrative customer choices. \r\n");
      out.write("\r\n");
      out.write("Our data can easily give you information on old, current, and new customers to help you expand and update your customer base as well as increase your revenue stream. </font></p><br><br><br>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("         <div id=\"m2\" class=\"col-md-10 col-md-push-1 text-center\" style=\"color:#7F6F6F\">\r\n");
      out.write("         <h2 class=\"text-center\" style=\"color:#7F6F6F\">Monitor Competitors</h2><p></p><br>\r\n");
      out.write("            <p><font size=\"4\">See what your competitors are importing through the analysis of their global trading habits: common suppliers, frequent products, geographic distribution, import/export markets, volumes, and prices. Inforvellor's vast data resources and access to real bill of lading information provides you with a clear picture of your competitors so that you can always stay ahead.\r\n");
      out.write("Stay up-to-date on your competitors’ trading habits.\r\n");
      out.write("Keep notified of any new market competitors.\r\n");
      out.write("Know when a competitor makes any trade changes such as country-of-origin updates. \r\n");
      out.write("Keep abreast of new competitor strategies and act accordingly.</font></p><br><br><br>\r\n");
      out.write("</div>\r\n");
      out.write("      \r\n");
      out.write("       <div class=\"col-md-10 col-md-push-1 text-center\" style=\"color:#7F6F6F\">\r\n");
      out.write("         <h2 class=\"text-center\" style=\"color:#7F6F6F\">Analyze Market Data</h2><p></p><br>\r\n");
      out.write("            <p><font size=\"4\">Accurate trade research can make or break any enterprise. Our comprehensive database will give you timely trade data including shipment information, buyer history, suppliers, and market trends. We have connections with over 22 countries to help develop a dynamic trade database. We track nearly 730,000 active traders, which allows our detailed reports to continue expanding daily. Dominate the competition with market data that gives you the sharpest advantage. \r\n");
      out.write("\r\n");
      out.write("Analyze the market, find new business opportunities, and discover the most advantageous target market and export chance.\r\n");
      out.write("\r\n");
      out.write("What is your target product’s market demand? How about the competition’s condition? Have any new products appeared? \r\n");
      out.write("\r\n");
      out.write("Our statistical analysis provides accurate, comprehensive guidance that allows you to conquer four competitive environments.\r\n");
      out.write("Market Competition- Choose the current market with the largest demand, profits, and most developmental potential.\r\n");
      out.write("Price Competition- Determine the most reasonable prices for you to enter the market by assessing export trends, turnover probability, and purchase price ranges.\r\n");
      out.write("Peer Competition-­ Master other competitors through the analysis of their trading habits: geographic distribution, export markets, export volumes, and export prices. \r\n");
      out.write("Customer Competition-­ Grasp customer buying trends to find out what your customers want. Open opportunities for new customers with information on customer demand.\r\n");
      out.write("</font></p><br><br><br>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" <div id=\"industry\" class=\"col-md-10 col-md-push-1 text-center\" style=\"color:#7F6F6F\">\r\n");
      out.write("         <h2 class=\"text-center\" style=\"color:#7F6F6F\">Industry Consultations</h2><p></p><br>\r\n");
      out.write("            <p><font size=\"4\">Inforvellor is focused on facilitating international trading for global suppliers and buyers from many industries. We efficiently analyze and categorize trade data by utilizing information technology and traditional trading methodology. \r\n");
      out.write("\r\n");
      out.write("Do you have a specific industry problem that you need solved? Inforvellor is here to offer tailored consultations about your specific business need.\r\n");
      out.write("\r\n");
      out.write("Our goal is to help our customers build up smart international trading systems and implement strategic risk management systems in order to connect with more buyers and expand the export of products. \r\n");
      out.write("\r\n");
      out.write("Navigate around the time consuming research and exhaustive trade information by letting us do the work for you. \r\n");
      out.write("\r\n");
      out.write("Using all-inclusive solution plans, we help companies monitor the competitive environment, analyze buyer purchasing information, master the international market, and make timely business decisions.\r\n");
      out.write("\r\n");
      out.write("Based on our long industry background and years of experience in information technology services, we have developed a professional data specialist team to provide comprehensive, thoughtful, and personalized services. This allows customers to lower costs, raise efficiency, quickly make trade decisions, and develop better trading risk management strategies. Our customers are guaranteed to get the finest trading experience that the information age can provide.\r\n");
      out.write("</font></p><br><br><br>\r\n");
      out.write("</div>\r\n");
      out.write("        \r\n");
      out.write("       </div></div><!-- /.row --><p></p><br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("       <div id=\"b2\" class=\"pad-section\">\r\n");
      out.write("  \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("         <h2 class=\"col-md-10 col-md-push-1 text-center\" style=\"color:#FFF\"><p></p><br><br>“I have been trading for decades and I am still standing. I have seen a lot of traders come and go. They have a system or a program that works in some specific environments and fails in others. In contrast, my strategy is dynamic and ever evolving. I constantly learn and change.” <br><br>- Thomas Busby in Trade To Win</h2>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</div><p></p><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- Three columns of text below the carousel -->\r\n");
      out.write("      <div class=\"row\" id=\"customers\">\r\n");
      out.write("      <div class=\"container marketing\">\r\n");
      out.write("         <h1 class=\"text-center\">Our Customers</h1><p></p><br><br><br><br><br>\r\n");
      out.write("      \r\n");
      out.write("        <div class=\"col-lg-4 text-center\">\r\n");
      out.write("          <img class=\"img-square\" src=\"");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\"><p></p><br>\r\n");
      out.write("          <h2>For Buyers</h2>\r\n");
      out.write("          <p>We help foreign trade companies seek new importers. Look to us to find the highest quality supplies in the world.</p>\r\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\\view\\newhomepage\\buyers.jsp\" role=\"button\">View details »</a></p>\r\n");
      out.write("        </div><!-- /.col-lg-4 -->\r\n");
      out.write("        <div class=\"col-lg-4 text-center\">\r\n");
      out.write("          <img class=\"img-circle\" src=\"");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write("\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\"><p></p><br>\r\n");
      out.write("          \r\n");
      out.write("          <h2>For Sellers</h2>\r\n");
      out.write("          <p>We help manufacturers look for exporters to move their international products. Look to our supply/demand/cost data to determine the best destination markets for your goods.</p>\r\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\\view\\newhomepage\\sellers.jsp\" role=\"button\">View details »</a></p><br><br>\r\n");
      out.write("        </div><!-- /.col-lg-4 -->\r\n");
      out.write("        <div class=\"col-lg-4 text-center\">\r\n");
      out.write("          <img class=\"img-circle\" src=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\"><p></p><br>\r\n");
      out.write("          <h2>For Researchers</h2>\r\n");
      out.write("          <p>We combine traditional trade techniques and modern technology to provide optimal trade data, 24/7. Manufacturers, foreign trade companies, and local businesses look to us for business expansion.</p>\r\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\\view\\newhomepage\\research.jsp\" role=\"button\">View details »</a></p><br><br><br><br><br>\r\n");
      out.write("        </div><!-- /.col-lg-4 -->\r\n");
      out.write("        <!--\r\n");
      out.write("        <h2 class=\"text-center\" style=\"color:#CD9898\">A few of our employer partners:</h2><p></p><br><br>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"col-lg-3 text-center\">\r\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner0.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-lg-3 text-center\">\r\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner1.jpg\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-lg-3 text-center\">\r\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner2.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-lg-3 text-center\">\r\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner3.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-lg-3 text-center\">\r\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner4.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-lg-3 text-center\">\r\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner5.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-lg-3 text-center\">\r\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner6.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-lg-3 text-center\">\r\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner7.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\r\n");
      out.write("          </div>\r\n");
      out.write("          -->\r\n");
      out.write("          \r\n");
      out.write("      </div></div><!-- /.row --><p></p><br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"services\" class=\"pad-section\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <h2 class=\"text-center\">Our Services</h2> <hr />\r\n");
      out.write("    <div class=\"row text-center\">\r\n");
      out.write("      <div class=\"col-sm-3 col-xs-6\">\r\n");
      out.write("        <i class=\"glyphicon glyphicon-duplicate\"> </i>\r\n");
      out.write("        <h4>Generate Reports</h4>\r\n");
      out.write("        <p>Get detailed exchange data on purchase information, export enterprise contact information, HS codes, product descriptions, trade methods, and much more.</p>\r\n");
      out.write("        <p></p><br><br>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-sm-3 col-xs-6\">\r\n");
      out.write("        <i class=\"glyphicon glyphicon-stats\"> </i>\r\n");
      out.write("        <h4>Analyze Data</h4>\r\n");
      out.write("        <p>Our statistical analysis provides comprehensive guidance that allows you to conquer four competitive environments: market, price, peer, and customer.\r\n");
      out.write("          </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-sm-3 col-xs-6\">\r\n");
      out.write("        <i class=\"glyphicon glyphicon-search\"> </i>\r\n");
      out.write("        <h4>Find Businesses</h4>\r\n");
      out.write("        <p>We provide information on businesses from over 22 countries around the world according to customers' professional needs.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-sm-3 col-xs-6\">\r\n");
      out.write("        <i class=\"glyphicon glyphicon-bullhorn\"> </i>\r\n");
      out.write("        <h4>Find Customers</h4>\r\n");
      out.write("        <p>We help foreign trade companies operate locally by locating more customers. Look to us for domestic market trends, including supply chain records.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- fourth section - Information -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"information\" class=\"pad-section\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row col-md-8 col-md-push-2 text-center\">\r\n");
      out.write("    <p></p><br><br><br>\r\n");
      out.write("    \r\n");
      out.write("      <div class=\"col-sm-12\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("          <div class=\"panel-heading\">\r\n");
      out.write("      <h4 class=\"panel-title\">\r\n");
      out.write("        <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\r\n");
      out.write("          <b>\r\n");
      out.write("          Why Use Our Service?\r\n");
      out.write("          </b>\r\n");
      out.write("        </a>\r\n");
      out.write("      </h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"collapseOne\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingOne\">\r\n");
      out.write("      <div class=\"panel-body text-left\"><b>\r\n");
      out.write("        Inforvellor provides the most detailed data in a simple-to-use manner to help you Find Customers, Monitor Competitors, and Analyze Market Data. We give you timely product data including shipment information, buyer history, and market trends. We have connections with over 22 countries to help develop a dynamic trade database. We track nearly 730,000 active traders, which allows our detailed reports to continue expanding daily. </b>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"col-sm-12\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("          <div class=\"panel-heading\">\r\n");
      out.write("      <h4 class=\"panel-title\">\r\n");
      out.write("        <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("        <b>\r\n");
      out.write("          Customs Code\r\n");
      out.write("        </b> \r\n");
      out.write("        </a>\r\n");
      out.write("      </h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"collapseTwo\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingTwo\">\r\n");
      out.write("      <div class=\"panel-body text-left\"><b>\r\n");
      out.write("        Customs code standardizes the way international business occurs. The applicable code involves components of “The International Convention for Harmonized Commodity Description and Coding System? In June 1983, trade professionals developed a system for tracking international trade. Under the HS Code they created, standards were set for naming traded goods and services. Today more than 150 countries administer the HS Codes, accounting for more than 90% of all international trade.</b>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"col-sm-12\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("          <div class=\"panel-heading\">\r\n");
      out.write("      <h4 class=\"panel-title\">\r\n");
      out.write("        <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\">\r\n");
      out.write("        <b>\r\n");
      out.write("          Service Attitude\r\n");
      out.write("        </b> \r\n");
      out.write("        </a>\r\n");
      out.write("      </h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"collapseThree\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingTwhree\">\r\n");
      out.write("      <div class=\"panel-body text-left\"><b>\r\n");
      out.write("        Professional Service- We have advanced service installations and\r\n");
      out.write("\r\n");
      out.write("professional support engineers to provide users with the highest standard of \r\n");
      out.write("\r\n");
      out.write("support services.<br><br>\r\n");
      out.write("\r\n");
      out.write(" Sincere Service- We provide friendly, user-oriented services that establish \r\n");
      out.write("\r\n");
      out.write("comprehensive customer records tracking first and returning customer visits.<br><br>\r\n");
      out.write("\r\n");
      out.write(" Comprehensive Service- We specialize in comprehensive perspectives based \r\n");
      out.write("\r\n");
      out.write("on customer needs. Our services include advice, applications, maintenance, \r\n");
      out.write("\r\n");
      out.write("and consulting involving four categories of user work processing.<br><br></b>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"col-sm-12\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("          <div class=\"panel-heading\">\r\n");
      out.write("      <h4 class=\"panel-title\">\r\n");
      out.write("        <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseFour\" aria-expanded=\"false\" aria-controls=\"collapseFour\">\r\n");
      out.write("        <b>\r\n");
      out.write("          Service Goal\r\n");
      out.write("         </b> \r\n");
      out.write("        </a>\r\n");
      out.write("      </h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"collapseFour\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingFour\">\r\n");
      out.write("      <div class=\"panel-body text-left\"><b>\r\n");
      out.write("        Service History- We maintain a customer complaint rate of less than 2% and a customer service satisfaction rate of 85% and greater. (Ratings factor in response time, service skill of agents, agent communication skills with customers, etc.).<br><br>\r\n");
      out.write("\r\n");
      out.write("Service Principles- We remain conscious of what our customers need and what they think.<br><br>\r\n");
      out.write("\r\n");
      out.write("Service Guidelines- We provide sincere and friendly interactions with customers to better ensure quality service.</b>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("   </div>\r\n");
      out.write("  </div>\r\n");
      out.write("<!-- /second section -->\r\n");
      out.write("<!-- third section - Services -->\r\n");
      out.write("\r\n");
      out.write("<!-- /third section -->\r\n");
      out.write("\r\n");
      out.write("<!-- /fifth section -->\r\n");
      out.write("<div id=\"contact\" class=\"pad-section\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("        <h2 class=\"text-center\">Contact Us</h2> <hr />\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-lg-3 text-center\">\r\n");
      out.write("            <i class=\"glyphicon glyphicon-envelope\"> \r\n");
      out.write("            </i>\r\n");
      out.write("              <h3><a href=\"https://mail.google.com/mail/?view=cm&fs=1&to=inforvellor@gmail.com\" target=\"_blank\">email us</a></h3>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-lg-3 text-center\">\r\n");
      out.write("            <i class=\"glyphicon glyphicon-phone\"> \r\n");
      out.write("            </i>\r\n");
      out.write("              <h3>+1-301-982-1900</h3>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-lg-3 text-center\">\r\n");
      out.write("            <i class=\"glyphicon glyphicon-comment\"> \r\n");
      out.write("            </i>\r\n");
      out.write("              <h3>\r\n");
      out.write("              <a href=\"#contacts\" data-toggle=\"modal\">Send us a message</a>\r\n");
      out.write("              </h3>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-3 text-center\">\r\n");
      out.write("            \r\n");
      out.write("            <h4>\r\n");
      out.write("              <br>\r\n");
      out.write("              Fax: +1-301-982-1919<br><br>\r\n");
      out.write("              inforvellor@gmail.com <br><br>\r\n");
      out.write("              8400 Baltimore Ave. Room 333,<br> \r\n");
      out.write("              College Park, MD, 20740 \r\n");
      out.write("              </h4>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class = \"modal fade\" id = \"signup\" role = \"dialog\">\r\n");
      out.write("  <div class = \"modal-dialog\">\r\n");
      out.write("    <div class = \"modal-content\">\r\n");
      out.write("     <div class = \"modal-header\">\r\n");
      out.write("       <h4>Please Sign Up</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class = \"modal-body\">\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("        <div class=\"container-modal\">\r\n");
      out.write("           <form onsubmit=\"return userSubmit()\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/registerUser\" method=\"post\" accept-charset=\"utf-8\" class=\"form\" role=\"form\"> \r\n");
      out.write("                    <h4>You will be able to select the payment options later on.</h4>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                           <div class=\"col-xs-6 col-md-6\">\r\n");
      out.write("                            <input type=\"text\" id=\"inputFirstName\" name=\"firstName\" required=\"\" value=\"\" class=\"form-control input-lg\" placeholder=\"First Name\"  />                        </div>\r\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\r\n");
      out.write("                            <input type=\"text\" id=\"inputLastName\" name=\"lastName\" value=\"\" required=\"\" class=\"form-control input-lg\" placeholder=\"Last Name\"  />                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"text\" id=\"inputUserName\" name=\"loginName\" value=\"\" required=\"\" class=\"form-control input-lg\" placeholder=\"Your Email\"  />\r\n");
      out.write("                    <input type=\"password\" id=\"inputPassword\" name=\"loginPassword\" required=\"\" value=\"\" class=\"form-control input-lg\" placeholder=\"Password\"  />\r\n");
      out.write("                    <input type=\"password\" id=\"reinputPassword\" name=\"password_confirm\" required=\"\" value=\"\" class=\"form-control input-lg\" placeholder=\"Confirm Password\"  />                    <label>Birth Date</label>                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xs-4 col-md-4\">\r\n");
      out.write("                            <select name=\"month\" class = \"form-control input-lg\">\r\n");
      out.write("                            <option value=\"01\">Jan</option>\r\n");
      out.write("                            <option value=\"02\">Feb</option>\r\n");
      out.write("                            <option value=\"03\">Mar</option>\r\n");
      out.write("                            <option value=\"04\">Apr</option>\r\n");
      out.write("                            <option value=\"05\">May</option>\r\n");
      out.write("                            <option value=\"06\">Jun</option>\r\n");
      out.write("                            <option value=\"07\">Jul</option>\r\n");
      out.write("                            <option value=\"08\">Aug</option>\r\n");
      out.write("                            <option value=\"09\">Sep</option>\r\n");
      out.write("                            <option value=\"10\">Oct</option>\r\n");
      out.write("                            <option value=\"11\">Nov</option>\r\n");
      out.write("                            <option value=\"12\">Dec</option>\r\n");
      out.write("                            </select>                     \r\n");
      out.write("                       </div>\r\n");
      out.write("                        <div class=\"col-xs-4 col-md-4\">\r\n");
      out.write("                            <select name=\"day\" class = \"form-control input-lg\">\r\n");
      out.write("<option value=\"1\">1</option>\r\n");
      out.write("<option value=\"2\">2</option>\r\n");
      out.write("<option value=\"3\">3</option>\r\n");
      out.write("<option value=\"4\">4</option>\r\n");
      out.write("<option value=\"5\">5</option>\r\n");
      out.write("<option value=\"6\">6</option>\r\n");
      out.write("<option value=\"7\">7</option>\r\n");
      out.write("<option value=\"8\">8</option>\r\n");
      out.write("<option value=\"9\">9</option>\r\n");
      out.write("<option value=\"10\">10</option>\r\n");
      out.write("<option value=\"11\">11</option>\r\n");
      out.write("<option value=\"12\">12</option>\r\n");
      out.write("<option value=\"13\">13</option>\r\n");
      out.write("<option value=\"14\">14</option>\r\n");
      out.write("<option value=\"15\">15</option>\r\n");
      out.write("<option value=\"16\">16</option>\r\n");
      out.write("<option value=\"17\">17</option>\r\n");
      out.write("<option value=\"18\">18</option>\r\n");
      out.write("<option value=\"19\">19</option>\r\n");
      out.write("<option value=\"20\">20</option>\r\n");
      out.write("<option value=\"21\">21</option>\r\n");
      out.write("<option value=\"22\">22</option>\r\n");
      out.write("<option value=\"23\">23</option>\r\n");
      out.write("<option value=\"24\">24</option>\r\n");
      out.write("<option value=\"25\">25</option>\r\n");
      out.write("<option value=\"26\">26</option>\r\n");
      out.write("<option value=\"27\">27</option>\r\n");
      out.write("<option value=\"28\">28</option>\r\n");
      out.write("<option value=\"29\">29</option>\r\n");
      out.write("<option value=\"30\">30</option>\r\n");
      out.write("<option value=\"31\">31</option>\r\n");
      out.write("</select>                        </div>\r\n");
      out.write("                        <div class=\"col-xs-4 col-md-4\">\r\n");
      out.write("                            <select name=\"year\" class = \"form-control input-lg\">\r\n");
      out.write("<option value=\"1935\">1935</option>\r\n");
      out.write("<option value=\"1936\">1936</option>\r\n");
      out.write("<option value=\"1937\">1937</option>\r\n");
      out.write("<option value=\"1938\">1938</option>\r\n");
      out.write("<option value=\"1939\">1939</option>\r\n");
      out.write("<option value=\"1940\">1940</option>\r\n");
      out.write("<option value=\"1941\">1941</option>\r\n");
      out.write("<option value=\"1942\">1942</option>\r\n");
      out.write("<option value=\"1943\">1943</option>\r\n");
      out.write("<option value=\"1944\">1944</option>\r\n");
      out.write("<option value=\"1945\">1945</option>\r\n");
      out.write("<option value=\"1946\">1946</option>\r\n");
      out.write("<option value=\"1947\">1947</option>\r\n");
      out.write("<option value=\"1948\">1948</option>\r\n");
      out.write("<option value=\"1949\">1949</option>\r\n");
      out.write("<option value=\"1950\">1950</option>\r\n");
      out.write("<option value=\"1951\">1951</option>\r\n");
      out.write("<option value=\"1952\">1952</option>\r\n");
      out.write("<option value=\"1953\">1953</option>\r\n");
      out.write("<option value=\"1954\">1954</option>\r\n");
      out.write("<option value=\"1955\">1955</option>\r\n");
      out.write("<option value=\"1956\">1956</option>\r\n");
      out.write("<option value=\"1957\">1957</option>\r\n");
      out.write("<option value=\"1958\">1958</option>\r\n");
      out.write("<option value=\"1959\">1959</option>\r\n");
      out.write("<option value=\"1960\">1960</option>\r\n");
      out.write("<option value=\"1961\">1961</option>\r\n");
      out.write("<option value=\"1962\">1962</option>\r\n");
      out.write("<option value=\"1963\">1963</option>\r\n");
      out.write("<option value=\"1964\">1964</option>\r\n");
      out.write("<option value=\"1965\">1965</option>\r\n");
      out.write("<option value=\"1966\">1966</option>\r\n");
      out.write("<option value=\"1967\">1967</option>\r\n");
      out.write("<option value=\"1968\">1968</option>\r\n");
      out.write("<option value=\"1969\">1969</option>\r\n");
      out.write("<option value=\"1970\">1970</option>\r\n");
      out.write("<option value=\"1971\">1971</option>\r\n");
      out.write("<option value=\"1972\">1972</option>\r\n");
      out.write("<option value=\"1973\">1973</option>\r\n");
      out.write("<option value=\"1974\">1974</option>\r\n");
      out.write("<option value=\"1975\">1975</option>\r\n");
      out.write("<option value=\"1976\">1976</option>\r\n");
      out.write("<option value=\"1977\">1977</option>\r\n");
      out.write("<option value=\"1978\">1978</option>\r\n");
      out.write("<option value=\"1979\">1979</option>\r\n");
      out.write("<option value=\"1980\">1980</option>\r\n");
      out.write("<option value=\"1981\">1981</option>\r\n");
      out.write("<option value=\"1982\">1982</option>\r\n");
      out.write("<option value=\"1983\">1983</option>\r\n");
      out.write("<option value=\"1984\">1984</option>\r\n");
      out.write("<option value=\"1985\">1985</option>\r\n");
      out.write("<option value=\"1986\">1986</option>\r\n");
      out.write("<option value=\"1987\">1987</option>\r\n");
      out.write("<option value=\"1988\">1988</option>\r\n");
      out.write("<option value=\"1989\">1989</option>\r\n");
      out.write("<option value=\"1990\">1990</option>\r\n");
      out.write("<option value=\"1991\">1991</option>\r\n");
      out.write("<option value=\"1992\">1992</option>\r\n");
      out.write("<option value=\"1993\">1993</option>\r\n");
      out.write("<option value=\"1994\">1994</option>\r\n");
      out.write("<option value=\"1995\">1995</option>\r\n");
      out.write("<option value=\"1996\">1996</option>\r\n");
      out.write("<option value=\"1997\">1997</option>\r\n");
      out.write("<option value=\"1998\">1998</option>\r\n");
      out.write("<option value=\"1999\">1999</option>\r\n");
      out.write("<option value=\"2000\">2000</option>\r\n");
      out.write("<option value=\"2001\">2001</option>\r\n");
      out.write("<option value=\"2002\">2002</option>\r\n");
      out.write("<option value=\"2003\">2003</option>\r\n");
      out.write("<option value=\"2004\">2004</option>\r\n");
      out.write("<option value=\"2005\">2005</option>\r\n");
      out.write("<option value=\"2006\">2006</option>\r\n");
      out.write("<option value=\"2007\">2007</option>\r\n");
      out.write("<option value=\"2008\">2008</option>\r\n");
      out.write("<option value=\"2009\">2009</option>\r\n");
      out.write("<option value=\"2010\">2010</option>\r\n");
      out.write("<option value=\"2011\">2011</option>\r\n");
      out.write("<option value=\"2012\">2012</option>\r\n");
      out.write("<option value=\"2013\">2013</option>\r\n");
      out.write("</select>                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                     <label>Gender : </label>                    <label class=\"radio-inline\">\r\n");
      out.write("                        <input type=\"radio\" name=\"sex\" value=\"Male\" id=\"male\" />                        Male\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label class=\"radio-inline\">\r\n");
      out.write("                        <input type=\"radio\" name=\"sex\" value=\"Female\" id=\"female\" />                        Female\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br />\r\n");
      out.write("              <span class=\"help-block\">By clicking Create my account, you agree to our Terms and that you have read our Data Use Policy, including our Cookie Use.</span>\r\n");
      out.write("               <div class='pact'>\r\n");
      out.write("                     <div>\r\n");
      out.write("                     <label>\r\n");
      out.write("                     <input type=\"checkbox\"> <span>我已阅读</span><span><a href=\"");
      out.print(basePath);
      out.write("/view/login/register/argeement.pdf\" target=\"_blank\" title='用户注册协议'>《用户注册协议》</a></span>\r\n");
      out.write("                         <span id=\"pactMessege\"></span>\r\n");
      out.write("                  </label>\r\n");
      out.write("                         \r\n");
      out.write("                     </div>\r\n");
      out.write("               </div>\r\n");
      out.write("                    <button class=\"btn btn-lg btn-primary btn-block signup-btn\" type=\"submit\">\r\n");
      out.write("                        Create my account</button>\r\n");
      out.write("            </form>          \t\r\n");
      out.write("          </div>\r\n");
      out.write("</div>            \r\n");
      out.write("</div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class = \"modal fade\" id = \"contacts\" role = \"dialog\">\r\n");
      out.write("  <div class = \"modal-dialog\">\r\n");
      out.write("    <div class = \"modal-content\">\r\n");
      out.write("     <div class = \"modal-header\">\r\n");
      out.write("      <h3>Say us hi</h3>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class = \"modal-body\">\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("         <div class=\"container-modal\">\r\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sendUsEmail\" method=\"post\" accept-charset=\"utf-8\" class=\"form\" role=\"form\"> \r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-12\">\r\n");
      out.write("                            <input type=\"text\" required=\"\"  name=\"fromEmail\" value=\"\" class=\"form-control input-lg\" placeholder=\"From\" />                        </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-12\">\r\n");
      out.write("                             <textarea class=\"form-control input-lg\" required=\"\"  id=\"message\" name=\"content\" placeholder=\"Enter your massage for us here. We will get back to you within 2 business days.\" rows=\"7\"></textarea>                        </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-12 text-right\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-lg\">Send</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("<footer>\r\n");
      out.write("  <hr />\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <p class=\"text-right\">Copyright &copy; Inforvellor 2014</p>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- /footer -->\r\n");
      out.write("\r\n");
      out.write("  <!-- attach JavaScripts -->\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/newhomepage/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("  \r\n");
      out.write("    <!-- Scrolling Nav JavaScript -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/newhomepage/jquery.easing.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/newhomepage/scrolling-nav.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    $('.carousel').carousel({\r\n");
      out.write("        interval: 5000\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"global-zeroclipboard-html-bridge\" class=\"global-zeroclipboard-container\" title=\"\" style=\"position: absolute; left: 0px; top: -9999px; width: 15px; height: 15px; z-index: 999999999;\" data-original-title=\"Copy to clipboard\">      <object classid=\"clsid:d27cdb6e-ae6d-11cf-96b8-444553540000\" id=\"global-zeroclipboard-flash-bridge\" width=\"100%\" height=\"100%\">         <param name=\"movie\" value=\"/assets/flash/ZeroClipboard.swf?noCache=1422475245721\">         <param name=\"allowScriptAccess\" value=\"sameDomain\">         <param name=\"scale\" value=\"exactfit\">         <param name=\"loop\" value=\"false\">         <param name=\"menu\" value=\"false\">         <param name=\"quality\" value=\"best\">         <param name=\"bgcolor\" value=\"#ffffff\">         <param name=\"wmode\" value=\"transparent\">         <param name=\"flashvars\" value=\"trustedOrigins=getbootstrap.com%2C%2F%2Fgetbootstrap.com%2Chttp%3A%2F%2Fgetbootstrap.com\">         <embed src=\"/assets/flash/ZeroClipboard.swf?noCache=1422475245721\" loop=\"false\" menu=\"false\" quality=\"best\" bgcolor=\"#ffffff\" width=\"100%\" height=\"100%\" name=\"global-zeroclipboard-flash-bridge\" allowscriptaccess=\"sameDomain\" allowfullscreen=\"false\" type=\"application/x-shockwave-flash\" wmode=\"transparent\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" flashvars=\"trustedOrigins=getbootstrap.com%2C%2F%2Fgetbootstrap.com%2Chttp%3A%2F%2Fgetbootstrap.com\" scale=\"exactfit\">                </object></div><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"500\" height=\"500\" viewBox=\"0 0 500 500\" preserveAspectRatio=\"none\" style=\"visibility: hidden; position: absolute; top: -100%; left: -100%;\"><defs></defs><text x=\"0\" y=\"23\" style=\"font-weight:bold;font-size:23pt;font-family:Arial, Helvetica, Open Sans, sans-serif;dominant-baseline:middle\">500x500</text></svg></body></html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("root");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/static/css/newhomepage/bootstrap.min.css");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/static/css/newhomepage/style.css");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/static/css/newhomepage/scrolling-nav.css");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/static/css/newhomepage/custom.css");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/static/css/newhomepage/languages.min.css");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/static/css/newhomepage/font-awesome.min.css");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/static/img/newhomepage/white.png");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user  eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t   <li>\r\n");
        out.write("               \r\n");
        out.write("\t\t\t\t  <a class=\"btn btn-success\" role=\"button\" href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\\view\\newhomepage\\login.jsp\" style=\"color:white; padding:15px; margin-right:10px;\">Login</a>\r\n");
        out.write("                 \r\n");
        out.write("\t\t\t\t  \r\n");
        out.write("\t\t\t\t   \r\n");
        out.write("\t\t\t\t  </li>\r\n");
        out.write("\t\t\t\t  <li>\r\n");
        out.write("                   <a class=\"btn btn-primary\" href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\\view\\newhomepage\\index.jsp#signup\" role=\"button\" data-toggle=\"modal\" style=\"color:white; padding:15px; margin-right:10px;\">Sign up today</a>\r\n");
        out.write("                  </li>\r\n");
        out.write("\t\t\t\t   ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user  ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t     <li>\r\n");
        out.write("               \r\n");
        out.write("\t\t\t\t  <a class=\"btn\">Hi: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\r\n");
        out.write("                 \r\n");
        out.write("\t\t\t\t  \r\n");
        out.write("\t\t\t\t   \r\n");
        out.write("\t\t\t\t  </li>\r\n");
        out.write("\t\t\t\t  <li>\r\n");
        out.write("                   <a class=\"btn btn-primary2\" href=\"view/chinese/menu/country.jsp\" role=\"button\" style=\"color:white; padding:15px; margin-right:10px;\">Go to database</a>\r\n");
        out.write("                  </li>\r\n");
        out.write("\t\t\t\t \r\n");
        out.write("\t\t\t\t  ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("/static/img/newhomepage/about1.JPG");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent(null);
    _jspx_th_c_url_8.setValue("/static/img/newhomepage/about2.JPG");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent(null);
    _jspx_th_c_url_9.setValue("/static/img/newhomepage/movie.swf");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_c_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_10.setPageContext(_jspx_page_context);
    _jspx_th_c_url_10.setParent(null);
    _jspx_th_c_url_10.setValue("/static/img/newhomepage/buyerh.jpg");
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }

  private boolean _jspx_meth_c_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent(null);
    _jspx_th_c_url_11.setValue("/static/img/newhomepage/seller.jpg");
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_c_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent(null);
    _jspx_th_c_url_12.setValue("/static/img/newhomepage/researcherh.jpg");
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }
}
