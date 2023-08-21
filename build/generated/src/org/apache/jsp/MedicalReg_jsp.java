package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MedicalReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <h1>MedicalReg</h1>\n");
      out.write("        <form method=\"post\" action=\"MedicalReg1.jsp\">\n");
      out.write("            <p>Name:<input type=\"text\" name=\"T1\" id=\"Txt1\"/></p>\n");
      out.write("            <p>Owner:<input type=\"text\" name=\"T2\" id=\"Txt2\"/></p>\n");
      out.write("             <p>Lincense.No:<input type=\"text\" name=\"T3\" id=\"Txt3\"/></p>\n");
      out.write("            <p>Address:<input type=\"text\" name=\"T4\" id=\"Txt4\"/></p>\n");
      out.write("            <p>Contact:<input type=\"text\" name=\"T5\" id=\"Txt5\"/></p>\n");
      out.write("            <p>LandMark:<input type=\"text\" name=\"T6\" id=\"Txt6\"/></p>\n");
      out.write("            <p>Email:<input type=\"text\" name=\"T7\" id=\"Txt7\"/></p>\n");
      out.write("            <p>Password:<input type=\"text\" name=\"T8\" id=\"Txt8\"/></p>\n");
      out.write("            <p>Confirm Password:<input type=\"text\" name=\"T9\" id=\"Txt9\"/></p>\n");
      out.write("            <p><input type=\"submit\" name=\"B1\" id=\"Btn1\" value=\"Add\"/></p>       \n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write(" \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("       ");
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
