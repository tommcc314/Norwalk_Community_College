
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/connection.jspf" %>
<%  
    ResultSet rs = stmt.executeQuery("SELECT * FROM books RIGHT OUTER JOIN BOOKSQUERY "
            + "ON books.ISBN = BOOKSQUERY.ISBN WHERE SPECIAL = 1");

%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>

    <head>
        <title>Top Sellers</title>
    <%@include file="WEB-INF/jspf/topnav.jspf" %>
    <%@include file="WEB-INF/jspf/sidebar.jspf" %>
    <div role="main" class="col-md-9">
        <!--
            ************************
            HERE IS THE MAIN CONTENT
            ************************
        -->
        <div class="container-fluid resultSet">
            <div class="container text-center">
                <h1>Top Sellers!</h1>
            </div>
            <div class="container results">
                <%@include file="WEB-INF/jspf/output.jspf" %>

            </div>
        </div>
    </div>
</div>
</div>

<%@include file="WEB-INF/jspf/footer.jspf" %>
<%@include file="WEB-INF/jspf/close.jspf" %>