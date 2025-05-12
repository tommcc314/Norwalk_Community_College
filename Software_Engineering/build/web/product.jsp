
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/connection.jspf" %>
<%  String isbn = request.getParameter("isbn");
    ResultSet rs = stmt.executeQuery("SELECT * FROM BOOKSQUERY WHERE ISBN = '" + isbn + "'");
    try {
        rs.next();

%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>

    <head>
        <title>Product</title>
    <%@include file="WEB-INF/jspf/topnav.jspf" %>
    <%@include file="WEB-INF/jspf/sidebar.jspf" %>
    <div role="main" class="col-md-9">
        <!--
            ************************
            HERE IS THE MAIN CONTENT
            ************************
        -->
        <div class="container-fluid">
            <div class="container">
                <div class="row product">
                    <div class="col-md-4 bookImage text-center">
                        <img src="<%= rs.getString("COVERPIC")%>" alt="Book_Title">

                    </div>
                    <div class="col-md-7 bookInfo text-left">
                        <h2 style="text-align: left;"><%= rs.getString("TITLE")%></h2>
                        <h6 style="text-align: left;">By <%= rs.getString("AU_FIRSTNAME")%> <%= rs.getString("AU_LASTNAME")%></h6>                       
                    </div>
                </div>
                <div class="row desc">
                    <p style="text-align: left;"><%= rs.getString("DESCRIPTION")%>
                    </p>
                    <p style="text-align: left;">ISBN: <%= rs.getString("isbn")%>
                    </p>
                </div>
                <div class="row cartOption text-right">
                    <div class="container col-md-4 text-right">
                        <h5>$<%= rs.getString("PRICE")%></h5>
                    </div>
                    <div class="container col-md-4 text-right">
                        <a href="cart.jsp?isbn=<%= rs.getString("isbn") %>"><button type="button" style="width: 100%" class="btn btn-primary">Add to Cart</button></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

<%        } catch (Exception e) {

    }
%>

<%@include file="WEB-INF/jspf/footer.jspf" %>
<%@include file="WEB-INF/jspf/close.jspf" %>