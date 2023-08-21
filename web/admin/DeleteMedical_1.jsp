<%@include file="a1.jsp"%>
<%@page import="java.sql.*"%>
<h1>Delete Medical</h1>
<%
    String name,address,contact,email;
    email=request.getParameter("H1");
    Class.forName("com.mysql.jdbc.Driver");
    //creat connection
    String dbpath="jdbc:mysql://localhost:3306/mad_find_db";
    String dbuser="root";
    String dbpass="";
    
    Connection cn=DriverManager.getConnection(dbpath,dbuser,dbpass);
    
    String s1="DELETE FROM medicaldata WHERE email=?";
    String s2="DELETE FROM logindata Where email=?";
       
    PreparedStatement p1=cn.prepareStatement(s1);
    PreparedStatement p2=cn.prepareStatement(s2);
    
    p1.setString(1,email);
    p2.setString(1,email);
    
    //send data to table
    int a=p1.executeUpdate();
    int b=p2.executeUpdate();
    String msg="";
    if(a==1 && b==1)
    {
        msg="Data Deleted Sucessfully";
    }
    else
    {
        msg="Error: No Data Deleted";
    }
    %>
    <h2><%=msg%></h2>
    <h3>
        <a href="ShowMedicals.jsp">Continue</a>
    </h3>
    <%@include file="a2.jsp"%>