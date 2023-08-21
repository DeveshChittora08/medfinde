<%@include file="b1.jsp" %>
<%@page import="vgt.java10.medfinder.MyLib"%>
<%@page import="java.sql.*"%>
<h1>Edit Medicine</h1>
<%
 
 
 String med_id=request.getParameter("H1");
   

  Connection cn= new MyLib().getConnection();
  
  String s1="Delete from medicinedata where med_id=?";
  PreparedStatement p1=cn.prepareStatement(s1);
  

  p1.setString(1,med_id );
  
  int a=p1.executeUpdate();
  String msg="";
  if(a==1)
  {
      msg="medicine data is Delete";
  }
  else
  {
      msg="Error->Medicine is not Delete";
  }
%>
<h1><%=msg%></h1>
<h2><a href="ShowMedicine.jsp">continue</a></h2>
<%@include file="b2.jsp" %>