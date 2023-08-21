package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/c1.jsp");
    _jspx_dependants.add("/c2.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Tamplete</title>\r\n");
      out.write("<style>\r\n");
      out.write("  .main\r\n");
      out.write("  {\r\n");
      out.write("\t  width:100%;\r\n");
      out.write("\t  height:auto;\r\n");
      out.write("\t  margin:0 auto; \r\n");
      out.write("  }\r\n");
      out.write("  .wrepper\r\n");
      out.write("  {\r\n");
      out.write("\t  width:100%;\r\n");
      out.write("\t  height:auto;\r\n");
      out.write("\t  float:left;\r\n");
      out.write("\t  box-shadow:0px 0px 9px #555;\r\n");
      out.write("\t  border:1px  solid #000;\r\n");
      out.write("\t  border-radius:5px;\r\n");
      out.write("  }\r\n");
      out.write("  .banner\r\n");
      out.write("  {\r\n");
      out.write("\t  width:100%;\r\n");
      out.write("\t  height:100px;\r\n");
      out.write("\t  background-color:#99C;\r\n");
      out.write("          color: #fff;\r\n");
      out.write("          text-align: center;\r\n");
      out.write("          font-size: 69px;\r\n");
      out.write("  }\r\n");
      out.write("  .menue\r\n");
      out.write("  {\r\n");
      out.write("\t  width:100%;\r\n");
      out.write("\t  height:35px;\r\n");
      out.write("\t  background-color:#06C;\r\n");
      out.write("  }\r\n");
      out.write("  .menue a\r\n");
      out.write("  {\r\n");
      out.write("\t color:#FFF;\r\n");
      out.write("\t text-decoration:none;\r\n");
      out.write("      margin:8px;\r\n");
      out.write("\t  float:left;\r\n");
      out.write("\t \r\n");
      out.write("  }\r\n");
      out.write("  .menue a:hover\r\n");
      out.write("  {\r\n");
      out.write("\t  background-color:#069;\r\n");
      out.write("  }\r\n");
      out.write("  .middle\r\n");
      out.write("  {\r\n");
      out.write("\t  width:1100px;\r\n");
      out.write("\t  height:450px;\r\n");
      out.write("\t  \r\n");
      out.write("  }\r\n");
      out.write("  #middle #content\r\n");
      out.write("  {\r\n");
      out.write("\twidth:783px;\r\n");
      out.write("\tmin-height:400px;\r\n");
      out.write("\tborder:1px #FF0000 solid;\r\n");
      out.write("        margin: 10px 0 10px 10px;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  .footer\r\n");
      out.write("  {\r\n");
      out.write("\t  width:100%;\r\n");
      out.write("\t  height:170px;\r\n");
      out.write("\t  background-color:#CCC;\r\n");
      out.write("\t  float:left;\r\n");
      out.write("\t  text-align:center;\r\n");
      out.write("  }\r\n");
      out.write("  .footer a\r\n");
      out.write("  {\r\n");
      out.write("\t  text-decoration:none;\r\n");
      out.write("\t  font-family:Verdana, Geneva, sans-serif;\r\n");
      out.write("\t  color:#FFF;\r\n");
      out.write("  }\r\n");
      out.write("  .footer p\r\n");
      out.write("  {\r\n");
      out.write("\t  font-family:\"Courier New\", Courier, monospace;\r\n");
      out.write("\t  color:#FFF;\r\n");
      out.write("\t  margin-right:10px;\r\n");
      out.write("  }\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("    <div class=\"wrepper\">\r\n");
      out.write("        <div class=\"banner\">\r\n");
      out.write("           Medicine Finder  \r\n");
      out.write("        </div><!--end of banner-->\r\n");
      out.write("       <div class=\"menue\">\r\n");
      out.write("       <a href=\"index.jsp\">Home</a>\r\n");
      out.write("       <a href=\"Login.jsp\">Sign in</a>\r\n");
      out.write("       </div><!--end of menue--> \r\n");
      out.write("       \r\n");
      out.write("       <div id=\"middle\">\r\n");
      out.write("       \r\n");
      out.write("           <div id=\"content\">");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function findmed(str)\n");
      out.write(" {\n");
      out.write("      var xmlhttp;\n");
      out.write("    if(str.length==0)\n");
      out.write("    {\n");
      out.write("        document.getElementById(\"s1\").innerHTML=\"\";\n");
      out.write("        return;\n");
      out.write("    }\n");
      out.write("    if(window.XMLHttpRequest)\n");
      out.write("    {\n");
      out.write("        xmlhttp=new XMLHttpRequest();\n");
      out.write("    }\n");
      out.write("    else\n");
      out.write("    {\n");
      out.write("        xmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("    }\n");
      out.write("    xmlhttp.onreadystatechange=function()\n");
      out.write("    {\n");
      out.write("        if(xmlhttp.readyState==4 && xmlhttp.status==200)\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"s1\").innerHTML=xmlhttp.responseText;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    xmlhttp.open(\"GET\",\"fetchmed.jsp?q=\"+str,true);\n");
      out.write("    xmlhttp.send();   \n");
      out.write(" }\n");
      out.write("</script>\n");
      out.write("<h1>Welcome to Medicine Finder</h1>\n");
      out.write("\n");
      out.write("<p>Medicine Name:<input type=\"text\" onkeyup=\"findmed(this.value)\" name=\"T1\" ></p>\n");
      out.write(" <span id=\"s1\"></span>\n");
      out.write(" ");
      out.write(" </div>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       </div><!--end of middle--> \n");
      out.write("       \n");
      out.write("       <div class=\"footer\">\n");
      out.write("       <p> \n");
      out.write("       <a href=\"#\"> Terms & Condition</a>\n");
      out.write("       <a href=\"#\">Contect Us</a>\n");
      out.write("       </p>\n");
      out.write("       \n");
      out.write("       <p>\n");
      out.write("       Copyright &copy; 200-2022; All rights reserved\n");
      out.write("       </p>\n");
      out.write("       \n");
      out.write("       </div> <!--Footer-->\n");
      out.write("    \n");
      out.write("    </div><!--ennd of wrepper-->\n");
      out.write("</div><!--end of main-->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write(' ');
      out.write(' ');
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
}
