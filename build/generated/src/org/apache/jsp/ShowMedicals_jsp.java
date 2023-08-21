package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ShowMedicals_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<h1> Medical Store</h1>\n");
 
  Class.forName("com.mysql.jdbc.Driver");
  //creat connection
  String dbpath="jdbc:mysql://localhpost:3306/mad_find_db";
  String dbuser="root";
  String dbpass="";
  Connection cn=DriverManager.getConnection(dbpath,dbuser,dbpass);
  String sql="select * from medicaldata";
  PreparedStatement p1=cn.prepareStatement(sql);
  ResultSet r1=p1.executeQuery();
  
  while(r1.next())
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
      out.write("       <h3>");
      out.print( a );
      out.write("</h3>\n");
      out.write("                <p>\n");
      out.write("                    Owner : ");
      out.print( b );
      out.write("<br/>\n");
      out.write("                    License No : ");
      out.print( c );
      out.write("<br/>\n");
      out.write("                    Address : ");
      out.print( d );
      out.write("<br/>\n");
      out.write("                    Contact : ");
      out.print( e );
      out.write("<br/>\n");
      out.write("                    Landmark : ");
      out.print( f );
      out.write("<br/>\n");
      out.write("                    Email : ");
      out.print( g );
      out.write("\n");
      out.write("                </p>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <form action=\"EditMedical.jsp\" method=\"post\">\n");
      out.write("                                <input type=\"hidden\" name=\"H1\" value=\"");
      out.print( g );
      out.write("\"/>\n");
      out.write("                                <input type=\"submit\" value=\"Edit\" name=\"B1\"/>\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                            <td>\n");
      out.write("                            <form action=\"DeleteMedical.jsp\" method=\"post\">\n");
      out.write("                                <input type=\"hidden\" name=\"H1\" value=\"");
      out.print( g );
      out.write("\"/>\n");
      out.write("                                <input type=\"submit\" value=\"Delete\" name=\"B1\"/>\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                                ");

  }
                                
                       
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write(" \n");
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
