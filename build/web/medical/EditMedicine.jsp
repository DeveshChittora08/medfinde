<%@include file="b1.jsp" %>
<%@page import="vgt.java10.medfinder.MyLib"%>
<%@page import="java.sql.*"%>

<h1>Edit & Saved</h1>
<%
    String med_id=request.getParameter("H1");

    Connection cn= new MyLib().getConnection();
    String sql="select * from medicinedata where med_id=?";
    PreparedStatement p1=cn.prepareStatement(sql);
    p1.setString(1,med_id);
    ResultSet r1=p1.executeQuery();
    
    if(r1.next())
    {
        
      String a,b,c,d,e,f;
        
        a=r1.getString("med_name");
        b=r1.getString("company");
        c=r1.getString("med_type");
        d=r1.getString("description");
        e=r1.getString("price");
        f=r1.getString("med_id");
        %>
        
          <p><a href="MedicalHome.jsp">Back</a></p>
        <form method="post" action="EditMedicine_1.jsp">
            <p>Med_id:<input type="text" name="H1" value="<%=f%>"/></p>  
            <p>Name:<input type="text" name="T1" value="<%=a%>"/></p>
            <p>Company:<input type="text" name="T2" id="Txt2" value="<%=b%>"/></p>
             <p>Type:<input type="text" name="T3" id="Txt3" value="<%=c%>"/></p>
            <p>Description:<input type="text" name="T4" id="Txt4" value="<%=d%>"/></p>
            <p>Unit Price:<input type="text" name="T5" id="Txt5" value="<%=e%>"/></p>
            <p><input type="submit" value="Edit" name="B1"></p>
        </form>
     <%
   
    }

%>
<%@include file="b2.jsp" %>