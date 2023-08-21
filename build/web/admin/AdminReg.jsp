

<%@include file="a1.jsp"%>
<head>
    <style>
    .txt{
       
        margin: 10px 0px 10px 5px;
    }
   
    #Txt6{
        margin-right: 66px;
    }
    #Txt2{
        margin-right: 13px;
    }
    #Txt4{
        margin-right: -5px;
    }
     #Txt5{
        margin-right: 13px;
    }
</style>
</head>
<html>
  
    <body>
        <h1>Admin Registration</h1>
        <form method="post" action="AdminReg1.jsp">
            <p>Name:<input type="text" name="T1" id="Txt1" class="txt" /></p>
            <p>Address:<input type="text" name="T2" id="Txt2" class="txt"/></p>
            <p>contact:<input type="text" name="T3" id="Txt3" class="txt"/></p>
            <p>Email:<input type="text" name="T4" id="Txt4" class="txt"/></p>
            <p>Password:<input type="text" name="T5" id="Txt5" class="txt"/></p>
         <p>Confirm Password:<input type="text" name="T6" id="Txt6" class="txt"/></p>
           
            <button>Submit</button>
            
            
        </form>
    </body>
</html>
<%@include file="a2.jsp"%>
