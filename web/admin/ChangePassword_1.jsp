
<%@page import="java.sql.*"%>
<%@page import="vgt.java10.medfinder.MyLib"%>
<%@include file="a1.jsp" %>
<%
   String new_pass, old_pass, confirm_pass;
   old_pass=request.getParameter("T1");
   new_pass=request.getParameter("T2");
   confirm_pass=request.getParameter("T3");
   
   Connection cn=new MyLib().getConnection();
   String sql="update logindata set password=? where email=? and password=?";
   PreparedStatement P1=cn.prepareStatement(sql);
   P1.setString(1,new_pass);
   P1.setString(2,e1);
   P1.setString(3,old_pass);
   int a=P1.executeUpdate();
   String msg="";
   if(a==1)
   {
       msg="Password is changed";
   }
   else
   {
       msg="Confirm Password is not match";
   }
%>
<h2><%=msg%></h2>
<h3>
    <a href="AdminHome.jsp">Back</a>
</h3>
<%@include file="a2.jsp" %>
