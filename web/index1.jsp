<%@include file="c1.jsp" %>
<%@page import="java.sql.*"%>
<%@page import="vgt.java10.medfinder.MyLib"%>
<h1>Welcome to Medical finder</h1>
<%
    String med_name=request.getParameter("T1");
    %>
    <form method="post" action="index.jsp">
        Medicine Name:<input value="<%=med_name%>" type="text" name="T1"/>
        <i<nput type="submit" name="B1" value="Search">
    </form>
        <%
        if(med_name!=null)
        {
            Connection cn=new MyLib().getConnection();
            String sql="select* from medicine_medical where med_name like '%"+med_name+"%'";
            PreparedStatement p1=cn.prepareStatement(sql);
            ResultSet r1=p1.executeQuery();
         %>
         <table width="100%">
             <%
            while(r1.next())
            {
                String mname,company,des,price,medical,owner,address,contact,landmark;
                mname=r1.getString("med_name");
                company=r1.getString("company");
                des=r1.getString("description");
                price=r1.getString("price");
                medical=r1.getString("name");
                owner=r1.getString("owner");
                address=r1.getString("address");
                contact=r1.getString("contact");
                landmark=r1.getString("landmark");
                %>
                <tr>
                <td>
                    <h3>Medicine Name:<%=mname%></h3>
                    <p>
                        Company:<%=company%></b>
                        Description:<%=des%></b>
                        Unity_price:<%=company%></b>
                    </p>
                </td>
                <td>
                    <h3>Medical Name:<%=mname%></h3>
                    <p>
                        Contact Person:<%=owner%>
                        Address:<%=address%>
                        Contact:<%=contact%>
                        Landmark:<%=landmark%>
                    </p>
                </td>
                </tr>
                        <%
           }
            %>
             
         </table>
        <%
        }
            %>
        
      

  <%@include file="c2.jsp" %>