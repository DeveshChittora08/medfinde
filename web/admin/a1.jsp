
<html>
<head>
   <%
    //check existance of session
    String ut="",e1="";
    session=request.getSession(false);
    if(session==null)
    {
        response.sendRedirect("../AuthorizationError.jsp");
    }
    else
    {
        try
        {
            ut=session.getAttribute("usertype").toString();
            e1=session.getAttribute("email").toString();
            if(ut.equalsIgnoreCase("admin")==false)
            {
                response.sendRedirect("../AuthorizationError.jsp");
            }
        }
        catch(NullPointerException e)
        {
            response.sendRedirect("../AuthorizationError.jsp");
        }
    }
%>
<title>Tamplete</title>
<style>
  .main
  {
	  width:100%;
	  height:auto;
	  margin:0 auto; 
  }
  .wrepper
  {
	  width:100%;
	  height:auto;
	  float:left;
	  box-shadow:0px 0px 9px #555;
	  border:1px  solid #000;
	  border-radius:5px;
  }
  .banner
  {
	  width:100%;
	  height:100px;
	  background-color:#99C;
          color: #fff;
          text-align: center;
          font-size: 69px;
  }
  .menue
  {
	  width:100%;
	  height:35px;
	  background-color:#99C;
  }
  .menue a
  {
	  color:#FFF;
	  text-decoration:none;
          margin: 13px 29px -11px;
	  float:left;
          background-color: #005fc1;
          padding: 1px 12px;
	 
  }
  .menue a:hover
  {
	  background-color:#069;
  }
  .middle
  {
	  width:1100px;
	  height:450px;
         
	  
  }
  #middle #content
  {
	width:100%;
        background-color:#99c;
	min-height:400px;
	float:left;
        text-align: center;
        text-decoration: none;
        color: #fff;
        
}

  
  .footer
  {
	  width:100%;
	  height:170px;
	  background-color:#CCC;
	  float:left;
	  text-align:center;
  }
  .footer a
  {
	  text-decoration:none;
	  font-family:Verdana, Geneva, sans-serif;
	  color:#FFF;
  }
  .footer p
  {
	  font-family:"Courier New", Courier, monospace;
	  color:#FFF;
	  margin-right:10px;
  }
 


</style>
</head>

<body>
<div class="main">
    <div class="wrepper">
        <div class="banner">
           Medicine Finder  
        </div><!--end of banner-->
       <div class="menue">
       <a href="AdminHome.jsp">Home</a>
       <a href="AdminReg.jsp">Admin Registration</a>
       <a href="ShowAdmins.jsp">Show Admins</a>
       <a href="../Logout.jsp">Logout</a>
       </div><!--end of menue--> 
       
       <div id="middle">
       
           <div id="content">