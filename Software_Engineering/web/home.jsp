
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/connection.jspf" %>
<%    ResultSet rs = stmt.executeQuery("SELECT * FROM books");

%>
<!DOCTYPE html>
<html>
    <head>
        <title>Home</title>
        <%@include file="WEB-INF/jspf/topnav.jspf" %>

        <!--End of search header-->
    <div class="fluid-container body">

        <div class="fluid-container mainImg">
            <a href="onsale.jsp">
                <img src="images/Sale Image.jpg" alt="" id="sale" />
            </a>
        </div>

        <div class="container bookWeek">
            <div class="row">
                <div class="container col-md-9">
                    <%                        rs.next();
                    %>
                    <h1 id="BOTW">Book of the week!</h1>
                    <a href="product.jsp?isbn=<%= rs.getString("ISBN")%>" class="justify-content-center"><h2><b><%= rs.getString("TITLE")%></b>
                            <h3><i>By <%= rs.getString("CATEGORY")%></i></h3>
                        </h2></a>
                    <p style="text-align: left;"><%= rs.getString("DESCRIPTION")%></p>
                    <div class="row">
                        <a style="margin-bottom: 10px;"> <img src="images/stars.png" alt="" id="stars"/>
                        </a>
                        <h2 id="price" style="margin-left: 20px; text-align: left;"><b>$<%= rs.getString("PRICE")%></b></h2>
                        <div class="container text-left">
                            <a href="cart.jsp?isbn=<%= rs.getString("isbn")%>"><button type="button" class="btn btn-primary">Add to Cart</button></a>
                        </div>

                    </div>
                </div>
                <div class="container col-md-3 col-xs-12 col-sm-12">
                    <div class="container text-center">
                        <a href="product.jsp?isbn=<%= rs.getString("ISBN")%>" class="justify-content-center">
                            <img src="<%= rs.getString("COVERPIC")%>" alt="" class="blurbimage"/>
                        </a>
                    </div>
                </div>

            </div>
            <div class="container text-center">
                <div class="row justify-content-center">
                    <h1><b>Top Sellers!</b></h1>
                </div>
                <div class="row topsellers">
                    <%@include file="WEB-INF/jspf/homesellersDSK.jspf" %>                
                </div>
            </div>
            <div class="container col-md-12 text-center" style="padding-top: 150px; margin-top: 50px;">
                <a href="topsellers.jsp">
                    <h3>View the Rest of our Catalog!</h3>
                    <i class="material-icons md-48">arrow_right_alt</i>
                </a>
            </div>
            <div style="padding-top: 20px;">

            </div>    

        </div>

    </div>

    <%@include file="WEB-INF/jspf/footer.jspf" %>
    <%@include file="WEB-INF/jspf/close.jspf" %>