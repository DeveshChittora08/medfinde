<%@include file="a1.jsp"%>
  <style>
    .txt{
       
        margin: 10px 0px 10px 5px;
    }
   
    #Txt6{
        margin-right: 66px;
    }
    #Txt3{
        margin-right: 39px;
    }
    #Txt4{
        margin-right: 10px;
    }
     #Txt5{
        margin-right: 5px;
    }
     #Txt6{
        margin-right: 22px;
    }
     #Txt8{
        margin-right: 22px;
    }
     #Txt9{
        margin-right: 77px;
    }
    </style>
<html>
    <body>
        <h1>MedicalReg</h1>
        <p><a href="AdminHome.jsp">Back</a></p>
        <form method="post" action="MedicalReg1.jsp">
            <p>Name:<input type="text" name="T1" id="Txt1" class="txt" /></p>
            <p>Owner:<input type="text" name="T2" id="Txt2"class="txt"/></p>
          <p>Lincense.No:<input type="text" name="T3" id="Txt3"class="txt"/></p>
            <p>Address:<input type="text" name="T4" id="Txt4"class="txt"/></p>
            <p>Contact:<input type="text" name="T5" id="Txt5"class="txt"/></p>
            <p>LandMark:<input type="text" name="T6" id="Txt6"class="txt"/></p>
            <p>Email:<input type="text" name="T7" id="Txt7"class="txt"/></p>
            <p>Password:<input type="text" name="T8" id="Txt8"class="txt"/></p>
            <p>Confirm Password:<input type="text" name="T9" id="Txt9"class="txt"/></p>
            <p><input type="submit" name="B1" id="Btn1" value="Add"/></p>       
        </form>
    
 
    </body>
</html>
<%@include file="a2.jsp"%>
       