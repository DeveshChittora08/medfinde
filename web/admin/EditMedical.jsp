<%@include file="a1.jsp"%>
<%@page import="java.sql.*"%>
<h1>Edit medical & Save</h1>
<%
    //recive  hidden files
    String med_email=request.getParameter("H1");
    if(med_email==null)
    {
        %>
        <h3> <a href="showMedicals.jsp">Select medicals</a></h3>
        <%
        
    }
    else
    {
        Class.forName("com.mysql.jdbc.Driver");
        
        //creat connection
        String dbpath="jdbc:mysql://localhost:3306/mad_find_db";
        String dbuser="root";
        String dbpass="";
        
        Connection cn=DriverManager.getConnection(dbpath,dbuser,dbpass);
        String sql="select * from medicaldata where email=?";
        PreparedStatement p1=cn.prepareStatement(sql);
        p1.setString(1,med_email);
        
        ResultSet r1=p1.executeQuery();
        
        //fatch rows one by one from result set
        
        if(r1.next())
        {
            String a,b,c,d,e,f,g;
            a=r1.getString("name");
            b=r1.getString("owner");
            c=r1.getString("lno");
            d=r1.getString("address");
            e=r1.getString("contact");
            f=r1.getString("landmark");
            g=r1.getString("email");
           
            %>
            <form action="EditMedical_1.jsp" method="post">
                <input type="hidden" name="H1" value="<%=g%>">
                <p>Name:<input type="text" value="<%= a %>"name="T1" id="text1"></p>
                <p>owner:<input type="text" value="<%= b %>"name="T2" id="text2"></p>
                <p>License:<input type="text" value="<%= c %>"name="T3" id="text3"></p>
                <p>Address:<input type="text" value="<%= d %>"name="T4" id="text4"></p>
                <p>Contact<input type="text" value="<%= e %>"name="T5" id="text5"></p>
                <p> Landmark:<input type="text" value="<%= f %>"name="T6" id="text6"></p>
                 <input type="submit" value="Save Changes" name="B1" />
            </form>
                <%
        }
                
    }
    %>
    <%@include file="a2.jsp"%>