<%@include file="c1.jsp"%>
<script>
    function findmed(str)
 {
      var xmlhttp;
    if(str.length==0)
    {
        document.getElementById("s1").innerHTML="";
        return;
    }
    if(window.XMLHttpRequest)
    {
        xmlhttp=new XMLHttpRequest();
    }
    else
    {
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange=function()
    {
        if(xmlhttp.readyState==4 && xmlhttp.status==200)
        {
            document.getElementById("s1").innerHTML=xmlhttp.responseText;
        }
    }
    xmlhttp.open("GET","fetchmed.jsp?q="+str,true);
    xmlhttp.send();   
 }
</script>
<h1>Welcome to Medicine Finder</h1>

<p>Medicine Name:<input type="text" onkeyup="findmed(this.value)" name="T1" ></p>
 <span id="s1"></span>
 <%@include file="c2.jsp"%>  