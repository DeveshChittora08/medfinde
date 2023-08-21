<%@include file="b1.jsp" %>
<style>
    table{
        display: flex;
    justify-content: center;
    }
  
    
</style>
<h1>MedicalReg</h1>
        <p><a href="MedicalHome.jsp">Back</a></p>
        <table>
            <form method="post" action="AddMedicine_1.jsp">
                <tr>
                <td class="txt">Name:</td>
                <td><input type="text" name="T1" id="Txt1" class="txt"/></td>
                </tr>
                <tr>
                <td>Company:</td>
                <td><input type="text" name="T2" id="Txt2"/></td>
                </tr>
                <tr>
                <td>Type:</td>
                <td><input type="text" name="T3" id="Txt3"/></td>
                </tr>
                <td>Description:</td>
                <td><input type="text" name="T4" id="Txt4"/></td>
                </tr>
                </tr>
                <td>Description:</td>
                <td><input type="text" name="T4" id="Txt4"/></td>
                </tr>
               </tr>
                <td>Unit Price:</td>
                <td><input type="text" name="T5" id="Txt5"/></td>
                </tr>
                </tr>
                <td><input type="submit" value="add" name="B1"></td>
                </tr>
        </form>

        </table>
                <%@include file="b2.jsp" %>