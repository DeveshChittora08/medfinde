<%@include file="a1.jsp"%>
<%@page import="java.sql.*" %>

        <h1>Medical Registration</h1>
        
        <%
            //Receive form data
            String name,address,contact,email,password,confirm;
            name=request.getParameter("T1");
            String owner=request.getParameter("T2");
            String lno =request.getParameter("T3");
            address=request.getParameter("T4");
            contact=request.getParameter("T5");
            String landmark=request.getParameter("T6");
            email=request.getParameter("T7");
            password=request.getParameter("T8");
            confirm=request.getParameter("T9");
            String usertype="medical";
            
            String msg="";
            if(name.trim().equals(""))
            {
                msg="Enter name";
            }
            else if(owner.trim().equals(""))
            {
                msg="Enter owner";
            }
            else if(lno.trim().equals(""))
            {
                msg="Enter License No.";
            }
            else if(address.trim().equals(""))
            {
                msg="Enter address";
            }
            else if(contact.trim().equals(""))
            {
                msg="Enter contact";
            }
            else if(landmark.trim().equals(""))
            {
                msg="Enter landmark";
            }
            else if(email.trim().equals(""))
            {
                msg="Enter Email";
            }
            else if(password.trim().equals(""))
            {
                msg="Enter password";
            }
            else if(confirm.trim().equals(""))
            {
                msg="Enter confirm";
            }
            else if(password.equals(confirm)==false)
            {
                msg="Password not matched";
            }
            else
            {
                //Load mysql java connector driver
                Class.forName("com.mysql.jdbc.Driver");
                //Create connection
                String dbpath="jdbc:mysql://localhost:3306/mad_find_db";
                String dbuser="root";
                String dbpass="";
                Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
                //Create valid dynamic sql commands
                String s1="insert into medicaldata values(?,?,?,?,?,?,?)";
                String s2="insert into logindata values(?,?,?)";
                //Create statements
                PreparedStatement p1=cn.prepareStatement(s1);
                PreparedStatement p2=cn.prepareStatement(s2);
                //Set data in place of ?
                p1.setString(1, name);
                p1.setString(2, owner);
                p1.setString(3, lno);
                p1.setString(4, address);
                p1.setString(5, contact);
                p1.setString(6, landmark);
                p1.setString(7, email);
                
                p2.setString(1, email);
                p2.setString(2, password);
                p2.setString(3, usertype);
                
                //send data to tables
                int a=p1.executeUpdate();
                int b=p2.executeUpdate();
                
                //check response
                if(a==1 && b==1)
                {
                    msg="Data is saved and login is created";
                }
                else if(a==1)
                {
                    msg="Only data is saved";
                }
                else if(b==1)
                {
                    msg="Only login is created";
                }
                else
                {
                    msg="No data saved and no login created";
                }
            }
        %>
        
        
        <h2><%= msg %></h2>
        <h3>
            <a href="MedicalReg.jsp">Continue</a>
        </h3>
        

