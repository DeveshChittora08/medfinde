<%@page import="java.sql.*"%>
<%@page import="vgt.java10.medfinder.MyLib"%>

<%
    String med_name=request.getParameter("q");
    MyLib obj=new MyLib();
    Connection cn=obj.getConnection();
    String sql="select * from medicine_medical where med_name LIKE '%"+med_name+"%'";
    PreparedStatement p1=cn.prepareStatement(sql);
    //Fetch records from table 
    ResultSet r1 =p1.executeQuery();
    //fetch rows one by one from result set
    %>
    <table width="100%">

    <%
    while(r1.next())
    {
        //fetch column of current row
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
                <h3> Medicine Name:<%=mname%></h3>
                <p>

                    Company:<%= company %> </br>
                    Description:<%= des %> </br>
                    Unit Price:<%= price %></br>


                </p>
            </td>
            <td>
                Medical Name : <%= medical %><br/>
                Contact Person : <%= owner %><br/>
                Address : <%= address %><br/>
                Contact : <%= contact %><br/>
                Landmark : <%= landmark %>
            </td>
        <%
    }
    %>
    </table
    