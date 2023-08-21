<%@include file="b1.jsp" %>
<%@page import="java.sql.*"%>
<%@page import="vgt.java10.medfinder.MyLib"%>

<h1>Medical Block</h1>

<%
    Connection cn=new MyLib().getConnection();
    String sql="select * from medicaldata where email=?";
    PreparedStatement p1=cn.prepareStatement(sql);
    p1.setString(1,e1); //get email of logged in user from session
    ResultSet r1=p1.executeQuery();
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
        <h3><%= a %></h3>
        <p>
            Owner : <%= b %><br/>
            License No : <%= c %><br/>
            Address : <%= d %><br/>
            Contact : <%= e %><br/>
            Landmark : <%= f %><br/>
            Email : <%= g %>

        </p>
        <a href="EditProfile.jsp"><button>Edit</button></a>
        <%
    }
    else
    {
        %>
        <h3>No profile found</h3>
        <%
    }
%>

<%@include file="b2.jsp" %>