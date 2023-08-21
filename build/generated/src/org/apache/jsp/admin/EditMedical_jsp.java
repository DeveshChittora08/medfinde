package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class EditMedical_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h1>Edit medical & Save</h1>\n");

    //recive  hidden files
    String med_email=request.getParameter("H1");
    if(med_email==null)
    {
        
      out.write("\n");
      out.write("        <h3> <a href=\"showMedicals.jsp\">Select medicals</a></h3>\n");
      out.write("        ");

        
    }
    else
    {
        Class.forName("com.mysql.jdbc.Driver");
        
        //creat connection
        String dbpath="jdbc:mysql://localhost:3306/mad_find_db";
        String dbuser="root";
        String dbpass="";
        
        Connection cn=DriverManager.getConnection(dbpath,dbuser,dbpass);
        String sql="select * from medicaldata where email=?";
        PreparedStatement p1=cn.prepareStatement(sql);
        p1.setString(1,med_email);
        
        ResultSet r1=p1.executeQuery();
        
        //fatch rows one by one from result set
        
        if(r1.next())
        {
            String a,b,c,d,e,f,g;
            a=r1.getString("name");
            b=r1.getString("owner");
            c=r1.getString("lno");
            d=r1.getString("address");
            e=r1.getString("contact");
            f=r1.getString("landmark");
            g=r1.getString("email");
           
            
      out.write("\n");
      out.write("            <form action=\"EditMedical_1.jsp\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" name=\"H1\" value=\"");
      out.print(g);
      out.write("\">\n");
      out.write("                <p>Name:<input type=\"text\" value=\"");
      out.print( a );
      out.write("\"name=\"T1\" id=\"text1\"></p>\n");
      out.write("                <p>owner:<input type=\"text\" value=\"");
      out.print( b );
      out.write("\"name=\"T2\" id=\"text2\"></p>\n");
      out.write("                <p>License:<input type=\"text\" value=\"");
      out.print( c );
      out.write("\"name=\"T3\" id=\"text3\"></p>\n");
      out.write("                <p>Address:<input type=\"text\" value=\"");
      out.print( d );
      out.write("\"name=\"T4\" id=\"text4\"></p>\n");
      out.write("                <p>Contact<input type=\"text\" value=\"");
      out.print( e );
      out.write("\"name=\"T5\" id=\"text5\"></p>\n");
      out.write("                <p> Landmark:<input type=\"text\" value=\"");
      out.print( f );
      out.write("\"name=\"T6\" id=\"text6\"></p>\n");
      out.write("                 <input type=\"submit\" value=\"Save Changes\" name=\"B1\" />\n");
      out.write("            </form>\n");
      out.write("                ");

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
