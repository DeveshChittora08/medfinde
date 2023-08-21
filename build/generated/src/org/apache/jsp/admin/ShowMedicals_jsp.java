package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ShowMedicals_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
    
  String ut="",e1="";
  session=request.getSession(false);
 if(session==null)
{
response.sendRedirect("../Authorization.jsp");

}
else
{
try
  {
  ut=session.getAttribute("usertype").toString();
  e1=session.getAttribute("email").toString();
  if(ut.equalsIgnoreCase("admin")==false)
  {
      response.sendRedirect("..AuthoriZationError.jsp") ;
  }
  }
catch(NullPointerException e)
{
     response.sendRedirect("../AuthorizationError.jsp") ;
}
        
}

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write(".main\r\n");
      out.write("{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:auto;\r\n");
      out.write("}\r\n");
      out.write(".wrepper\r\n");
      out.write("{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:auto;\r\n");
      out.write("\tbox-shadow:#999 0 0 10px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".header\r\n");
      out.write("{\r\n");
      out.write("\tbackground-color:#F77;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logout\r\n");
      out.write("{\r\n");
      out.write("\tfloat:right;\r\n");
      out.write("\tbackground-color:#000;\r\n");
      out.write("\tfont-size:16px;\r\n");
      out.write("\tfont-family:Georgia, \"Times New Roman\", Times, serif;\r\n");
      out.write("\tcolor:#FFF;\r\n");
      out.write("\tmargin:-20px 20px;\r\n");
      out.write("}\r\n");
      out.write(".nav\r\n");
      out.write("{\r\n");
      out.write("     padding:15px;\r\n");
      out.write("     \r\n");
      out.write("}\r\n");
      out.write(".nav,a\r\n");
      out.write("{\r\n");
      out.write("\tpadding-right:10px;\r\n");
      out.write("\tcolor:#FFF;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("\tfont-family:\"Courier New\", Courier, monospace;\r\n");
      out.write("\tmargin-bottom:0px;\r\n");
      out.write("}\r\n");
      out.write(".drop_bar\r\n");
      out.write("{\r\n");
      out.write("\tfont:\"Courier New\", Courier, monospace;\r\n");
      out.write("\t background-color:#F77;\r\n");
      out.write("\t color:#FFF;\r\n");
      out.write("\t border:none;\r\n");
      out.write("}\r\n");
      out.write(" .middle\r\n");
      out.write(" {\r\n");
      out.write("\t width:100%;\r\n");
      out.write("\t min-height:600px;\t\t \r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .bottom\r\n");
      out.write(" {\r\n");
      out.write("\t width:100%;\r\n");
      out.write("\t height:100px;\r\n");
      out.write("\t   background-color:#000;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write(" }\r\n");
      out.write(" .bottom p\r\n");
      out.write(" {\r\n");
      out.write("\t\r\n");
      out.write("\t font-size:20px;\r\n");
      out.write("\t color:#fff;\r\n");
      out.write("\t     margin-top: 0;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("\t\r\n");
      out.write("\t  \r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("<div class=\"wrepper\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("      <ul class=\"nav\">\r\n");
      out.write("        <td><a href=\"#\">Home</a></td>\r\n");
      out.write("        <td><a href=\"#\">\r\n");
      out.write("        <select class=\"drop_bar\">\r\n");
      out.write("        <option>Admin</option>\r\n");
      out.write("        <option>Add</option>\r\n");
      out.write("        <option>Show</option>\r\n");
      out.write("        </select></a></td>\r\n");
      out.write("        <td><a href=\"#\">\r\n");
      out.write("        <select class=\"drop_bar\">\r\n");
      out.write("        <option>Medical</option>\r\n");
      out.write("        <option>Add</option>\r\n");
      out.write("        <option>Manage</option>\r\n");
      out.write("        </select></a></td>\r\n");
      out.write("        <div><button class=\"logout\">logout</button></div>\r\n");
      out.write("      </ul><!--end of nav-->  \r\n");
      out.write(" \r\n");
      out.write("  </div><!--end of Header-->\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"middle\">\r\n");
      out.write("  \r\n");
      out.write("       <div class=\"contant\"> \r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h1> Medical Store</h1>\n");
      out.write("  <p><a href=\"AdminHome.jsp\">Back</a></p>\n");
 
  Class.forName("com.mysql.jdbc.Driver");
  //creat connection
  String dbpath="jdbc:mysql://localhost:3306/mad_find_db";
  String dbuser="root";
  String dbpass="";
  Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
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
      out.write("                </table>     \n");
      out.write("                                ");

  }
                                
                       
      out.write('\n');
      out.write("  </div>\n");
      out.write("    </div><!--middle-->\n");
      out.write("    \n");
      out.write("    <div class=\"bottom\">\n");
      out.write("          <p>Copyright @ By Devesh<br>\n");
      out.write("          2022-2023</p>\n");
      out.write("          \n");
      out.write("    </div>\n");
      out.write("</div><!--End of wrepper-->\n");
      out.write("</div><!--End of Main-->\n");
      out.write("</body>\n");
      out.write("</html>");
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
