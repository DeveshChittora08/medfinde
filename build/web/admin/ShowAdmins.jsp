<%@page import="vgt.java10.medfinder.MyLib"%>
<%@include file="a1.jsp"%>
<%@page import="java.sql.*"%>

<h1> Medical Store</h1>
  <p><a href="AdminHome.jsp">Back</a></p>
<% 
  Connection cn=new MyLib().getConnection();
  String sql="select * from admindata";
  PreparedStatement p1=cn.prepareStatement(sql);
  ResultSet r1=p1.executeQuery();
  
  while(r1.next())
  {
      String a,b,c,d;
      a=r1.getString("name");
      b=r1.getString("address");
      c=r1.getString("contact");
      d=r1.getString("email");
      
  
 %>
       <h3><%= a %></h3>
                <p>
                    Address : <%= b %><br/>
                    Contact : <%= c %><br/>
                    Email : <%= d %><br/>
                    
                </p>
            
                                <%
  }
                                
                       %>
<%@include file="a2.jsp"%>
                    
 
