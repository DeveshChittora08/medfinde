package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class MedicalReg1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write(" </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Medical Registration</h1>\n");
      out.write("        ");

             String name,address,contact,email,password,confirm;
            name=request.getParameter("T1");
            String owner=request.getParameter("T2");
            String lno=request.getParameter("T3");
            address=request.getParameter("T4");
            contact=request.getParameter("T5");
            String landmark=request.getParameter("T6");
            email=request.getParameter("T7");
            password=request.getParameter("T8");
            confirm=request.getParameter("T9");
            String usertype="Medical";
            String msg="";
            
            if(name.trim().equals(""))
            {
               msg="enter name";
            }
            else if(owner.trim().equals(""))
            {
               msg="enter Owner";
            }
            else if(lno.trim().equals(""))
            {
               msg="enter Lincense";
            }
            else if(address.trim().equals(""))
            {
               msg="enter Address";
            }
            else if(contact.trim().equals(""))
            {
               msg="enter contact";
            }
             else if(landmark.trim().equals(""))
            {
               msg="enter landmark";
            }
              else if(email.trim().equals(""))
            {
               msg="enter email";
            }
               else if(password.trim().equals(""))
            {
               msg="enter password";
            }
            else if(confirm.trim().equals(""))
            {
               msg="enter confirm Password";
            }
             else if(password.equals(confirm)==false)
            {
                msg="Password not matched";
            }
            //Load Mysql java connection drive
            else
            {
                Class.forName("com.mysql.jdbc.Driver");
            }
            //creat connection
            String dbpath="jdbc:mysql://localhost:3306/mad_find_db";
            String dbuser="root";
            String dbpass="";
            
            Connection cn=DriverManager.getConnection(dbpath,dbuser,dbpass);
            
            //creat valid dynamic sql commands;
            
            String s1="insert into medicaldata values(?,?,?,?,?,?,?)";
            String s2="insert into logindata values(?,?,?)";
            
            PreparedStatement p1=cn.prepareStatement(s1);
            PreparedStatement p2=cn.prepareStatement(s2);
            
            //set data in place of?
            
            p1.setString(1, name);
            p1.setString(2, owner);
            p1.setString(3, lno);
            p1.setString(4, address);
            p1.setString(5, contact);
            p1.setString(6, landmark);
            p1.setString(7, email);
           
            p2.setString(1, email);
            p2.setString(2, password);
            p2.setString(3, usertype);
            
            //send data to table
            int a=p1.executeUpdate();
            int b=p2.executeUpdate();
            
            //check response
            
            if(a==1 && b==1)
            {
                msg="Data is saved and Login is created";
            }
            else if(a==1)
            {
                msg="Only data Saved";
            }
            else if(b==1)
            {
                msg="only login is created";
                        
            }
            else
            {
                msg="No data saved and no login created";
            }
            
      out.write("\n");
      out.write("            <h2> ");
      out.print(msg);
      out.write(" </h2>\n");
      out.write("            <h3>\n");
      out.write("                <a href=\"MedicalReg.jsp\">continue</a>\n");
      out.write("            </h3>\n");
      out.write("           \n");
      out.write("    </body>\n");
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
