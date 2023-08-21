<%@include file="c1.jsp" %>

<%
    //check existance of session
    session=request.getSession(false); //false->use only existing session
    if(session==null)
    {
        response.sendRedirect("index.jsp");
    }
    else
    {
        try
        {
            //remove parameters of session
            session.removeAttribute("email");
            session.removeAttribute("usertype");
            //remove session
            session.invalidate();
            response.sendRedirect("index.jsp");
        }
        catch(NullPointerException e)
        {
            response.sendRedirect("index.jsp");
        }
    }
%>

<%@include file="c2.jsp" %>