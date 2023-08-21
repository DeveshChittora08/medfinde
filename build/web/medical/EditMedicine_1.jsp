<%@include file="b1.jsp" %>
<%@page import="vgt.java10.medfinder.MyLib"%>
<%@page import="java.sql.*"%>
<h1>Edit Medicine</h1>
<%
  String med_name,company,med_type,description,price;
  med_name=request.getParameter("T1");
  company=request.getParameter("T2");
  med_type=request.getParameter("T3");
  description=request.getParameter("T4");
  price=request.getParameter("T5"); 
 String med_id=request.getParameter("H1");
   

 Connection cn= new MyLib().getConnection();
  
  String sql="update medicinedata set med_name=?,company=?,med_type=?,description=?,price=? where med_id=?";
  PreparedStatement p1=cn.prepareStatement(sql);
  
  p1.setString(1,med_name);
  p1.setString(2,company);  
  p1.setString(3,med_type); 
  p1.setString(4,description); 
  p1.setString(5,price); 
  p1.setString(6,med_id );
  
    
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
<h2><a href="ShowMedicine.jsp">continue</a></h2>
<%@include file="b2.jsp" %>