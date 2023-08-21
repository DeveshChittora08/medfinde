package org.apache.jsp.medical;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class EditMedicine_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<h1>Edit & Saved</h1>\n");

String med_id=request.getParameter("H1");
if(med_id==null)
{
    
      out.write("\n");
      out.write("    <h3><a href=\"ShowMedicine.jsp\">Select Medicine</a></h3>\n");
      out.write("    ");

}
else
{
    Class.forName("com.mysql.jdbc.Driver");
    String dbpath="jdbc:mysql://localhost:3306/mad_find_db";
    String dbuser="root";
    String dbpass="";
    Connection cn=DriverManager.getConnection(dbpath,dbuser,dbpass);
    String sql="select * from medicinedata where med_id=?";
    PreparedStatement p1=cn.prepareStatement(sql);
    p1.setString(1,med_id);
    ResultSet r1=p1.executeQuery();
    
    if(r1.next())
    {
        
      String a,b,c,d,e,f;
        
        a=r1.getString("med_name");
        b=r1.getString("company");
        c=r1.getString("med_type");
        d=r1.getString("description");
        e=r1.getString("price");
        f=r1.getString("med_id");
        
      out.write("\n");
      out.write("        \n");
      out.write("          <p><a href=\"MedicalHome.jsp\">Back</a></p>\n");
      out.write("        <form method=\"post\" action=\"EditMedicine_1.jsp\">\n");
      out.write("            <p>Med_id:<input type=\"text\" name=\"T1\" value=\"");
      out.print(f);
      out.write("\"/></p>  \n");
      out.write("            <p>Name:<input type=\"text\" name=\"T1\" value=\"");
      out.print(a);
      out.write("\"/></p>\n");
      out.write("            <p>Company:<input type=\"text\" name=\"T2\" id=\"Txt2\" value=\"");
      out.print(b);
      out.write("\"/></p>\n");
      out.write("             <p>Type:<input type=\"text\" name=\"T3\" id=\"Txt3\" value=\"");
      out.print(c);
      out.write("\"/></p>\n");
      out.write("            <p>Description:<input type=\"text\" name=\"T4\" id=\"Txt4\" value=\"");
      out.print(d);
      out.write("\"/></p>\n");
      out.write("            <p>Unit Price:<input type=\"text\" name=\"T5\" id=\"Txt5\" value=\"");
      out.print(e);
      out.write("\"/></p>\n");
      out.write("            <p><input type=\"submit\" value=\"Edit\" name=\"B1\"></p>\n");
      out.write("        </form>\n");
      out.write("     ");

    }
    
}

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
