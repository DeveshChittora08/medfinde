<%@include file="c1.jsp" %>
<%@page import="vgt.java10.medfinder.MyLib"%>
<%@page import="java.sql.*"%>

<%
    Connection cn=new MyLib().getConnection();
    String emai,pass;
    emai=request.getParameter("T1");
    pass=request.getParameter("T2");
    String sql="select * from logindata where email=? and password=?";
    PreparedStatement p1=cn.prepareStatement(sql);
    p1.setString(1, emai);
    p1.setString(2,pass);
    ResultSet r1=p1.executeQuery();
    if(r1.next()) //Correct email and password
    {
        //fetch usertype
        String ut=r1.getString("usertype");
        //create session
        session=request.getSession(true); //true->create new session 
        //if does not exist otherwise open existing session
        session.setAttribute("email", emai);
        session.setAttribute("usertype", ut);
        
        //send to page
        if(ut.equalsIgnoreCase("admin"))
        {
            response.sendRedirect("admin/AdminHome.jsp");
        }
        else if(ut.equalsIgnoreCase("medical"))
        {
            response.sendRedirect("medical/MedicalHome.jsp");
        }
        else
        {
            out.println("Contact to admin");
        }
    }
    else
    {
        response.sendRedirect("LoginError.jsp");
    }
%>
<%@include file="c2.jsp" %>