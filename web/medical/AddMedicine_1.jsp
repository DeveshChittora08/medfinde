<%@include file="b1.jsp" %>
<%@page import="vgt.java10.medfinder.MyLib"%>
<%@page import="java.sql.*"%>
<h1>Medicine Data</h1>
<%
  String name,company,type,desc,unt_p;
  name=request.getParameter("T1");
  company=request.getParameter("T2");
  type=request.getParameter("T3");
  desc=request.getParameter("T4");
  unt_p=request.getParameter("T5"); 
   

  Connection cn= new MyLib().getConnection();
  
  String s1="insert into medicinedata values(0,?,?,?,?,?,?)";
  PreparedStatement p1=cn.prepareStatement(s1);
  
  p1.setString(1,name);
  p1.setString(2,company);
  p1.setString(3,type);
  p1.setString(4,desc);
  p1.setString(5,unt_p);
  p1.setString(6,e1);
  
  int a=p1.executeUpdate();
  String msg="";
  if(a==1)
  {
      msg="medicine data is Saved";
  }
  else
  {
      msg="Error->Medicine is not saved";
  }
%>
<h1><%=msg%></h1>
<h2><a href="AddMedicine.jsp">continue</a></h2>
<%@include file="b2.jsp" %>