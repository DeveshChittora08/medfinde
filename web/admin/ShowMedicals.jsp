<%@include file="a1.jsp"%>
<%@page import="java.sql.*"%>

<h1> Medical Store</h1>
  <p><a href="AdminHome.jsp">Back</a></p>
<% 
  Class.forName("com.mysql.jdbc.Driver");
  //creat connection
  String dbpath="jdbc:mysql://localhost:3306/mad_find_db";
  String dbuser="root";
  String dbpass="";
  Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
  String sql="select * from medicaldata";
  PreparedStatement p1=cn.prepareStatement(sql);
  ResultSet r1=p1.executeQuery();
  
  while(r1.next())
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
                <table>
                    <tr>
                        <td>
                            <form action="EditMedical.jsp" method="post">
                                <input type="hidden" name="H1" value="<%= g %>"/>
                                <input type="submit" value="Edit" name="B1"/>
                            </form>
                        </td>
                            <td>
                            <form action="DeleteMedical.jsp" method="post">
                                <input type="hidden" name="H1" value="<%= g %>"/>
                                <input type="submit" value="Delete" name="B1"/>
                            </form>
                        </td>
                    </tr>
                </table>     
                                <%
  }
                                
                       %>
<%@include file="a2.jsp"%>
                    
 
