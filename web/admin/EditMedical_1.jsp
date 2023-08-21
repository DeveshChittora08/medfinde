<%@include file="a1.jsp"%>
<%@page import="java.sql.*"%>
<h1>Edit & Save</h1>
<%
    String name,address,contact,email;
    name=request.getParameter("T1");
    String owner=request.getParameter("T2");
    String lno=request.getParameter("T3");
    address=request.getParameter("T4");
    contact=request.getParameter("T5");
    String landmark=request.getParameter("T6");
    email=request.getParameter("H1");
    
    //load mysql.java connection driver
    Class.forName("com.mysql.jdbc.Driver");
    // creat connection
   String dbpath="jdbc:mysql://localhost:3306/mad_find_db";
   String dbuser="root";
   String dbpass="";
   Connection cn=DriverManager.getConnection(dbpath,dbuser,dbpass);
   //creat valid dynamic sql commands
   
    String s1="update medicaldata set name=?,owner=?,lno=?,address=?,contact=?,landmark=? where email=?";
     // creat statments
    
    PreparedStatement p1=cn.prepareStatement(s1);
    //set data in place of ?
    
    p1.setString(1,name);
    p1.setString(2,owner);
    p1.setString(3,lno);
    p1.setString(4,address);
    p1.setString(5,contact);
    p1.setString(6,landmark);
    p1.setString(7,email);
    //send data to table
    int a=p1.executeUpdate();
    //check response
    
    String msg="";
    
    if(a==1)
    {
        msg="Data Changes are Saved Sucessfully";
    }
    else
    {
        msg="Error: No data Changes are saved";
    }
    %>
    <h2><%=msg%></h2>
    <h3><a href="ShowMedicals.jsp">Continue</a>
    </h3>
    <%@include file="a2.jsp"%>