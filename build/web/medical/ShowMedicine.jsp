
<%@include file="b1.jsp" %>
<%@page import="vgt.java10.medfinder.MyLib"%>
<%@page import="java.sql.*"%>
<h1>Show Medicine</h1>
<%
   Connection cn= new MyLib().getConnection();
  String sql="select * from medicinedata where email_medical=?";
  PreparedStatement p1=cn.prepareStatement(sql);
  p1.setString(1,e1);
  
  ResultSet r1=p1.executeQuery();
  %>
  <table border="1px" style="display: flex;
    justify-content: center;">
      <tr>
         <td>Med_id</td>
         <td>Name</td>
         <td>Company</td>
         <td>Type</td>
         <td>Description</td>
         <td>Unit Price</td>
         <td colspan="2">Actions</td>
         </tr>
  <%
  while(r1.next())
  {
      String f,a,b,c,d,e;
        f=r1.getString("med_id");
        a=r1.getString("med_name");
        b=r1.getString("company");
        c=r1.getString("med_type");
        d=r1.getString("description");
        e=r1.getString("price");
     %>
     
     
        
         
     
         <tr>
            <td><%=f %></td>
             <td><%=a%></td>
             <td><%=b%></td>
             <td><%=c%></td>
             <td><%=d%></td>
             <td><%=e%></td>
             
             <td>
                 <form method="post" action="EditMedicine.jsp">
                     <input type="hidden" name="H1" value="<%=f %>" />
                     <input type="submit" name="B1" value="Edit" />
                 </form>
             </td>
             <td>
                 <form method="post" action="DeleteMedicine.jsp">
                     <input type="hidden" name="H1" value="<%=f %>" />
                     <input type="submit" name="B1" value="Delete" />
                 </form>
             </td>
             
         </tr>
     
         
           
       <%
  }
    %>
  </table>
  <%@include file="b2.jsp" %>