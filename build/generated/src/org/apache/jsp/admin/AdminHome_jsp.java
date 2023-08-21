package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/a1.jsp");
    _jspx_dependants.add("/admin/a2.jsp");
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
      out.write("   ");

    //check existance of session
    String ut="",e1="";
    session=request.getSession(false);
    if(session==null)
    {
        response.sendRedirect("../AuthorizationError.jsp");
    }
    else
    {
        try
        {
            ut=session.getAttribute("usertype").toString();
            e1=session.getAttribute("email").toString();
            if(ut.equalsIgnoreCase("admin")==false)
            {
                response.sendRedirect("../AuthorizationError.jsp");
            }
        }
        catch(NullPointerException e)
        {
            response.sendRedirect("../AuthorizationError.jsp");
        }
    }

      out.write("\r\n");
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
      out.write("        margin: 10px 0 10px -270px;\r\n");
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
      out.write("        \r\n");
      out.write("        </div><!--end of banner-->\r\n");
      out.write("       <div class=\"menue\">\r\n");
      out.write("       <a href=\"AdminHome.jsp\">Home</a>\r\n");
      out.write("       <a href=\"AdminReg.jsp\">Admin Registration</a>\r\n");
      out.write("       <a href=\"ShowAdmins.jsp\">Show Admins</a>\r\n");
      out.write("       <a href=\"../Logout.jsp\">Logout</a>\r\n");
      out.write("       </div><!--end of menue--> \r\n");
      out.write("       \r\n");
      out.write("       <div id=\"middle\">\r\n");
      out.write("       \r\n");
      out.write("           <div id=\"content\">");
      out.write("\n");
      out.write("<h1>Adminstration's Blocks</h1>\n");
      out.write("<p><a href=\"MedicalReg.jsp\">Add Medicals</a></p>\n");
      out.write("<p><a href=\"ShowMedicals.jsp\">Manage Medicals</a></p>\n");
      out.write("<p><a href=\"ChangePassword.jsp\">Change Password</a></p>\n");
      out.write("\n");
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
