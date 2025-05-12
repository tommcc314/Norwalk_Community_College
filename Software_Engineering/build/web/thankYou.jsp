<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bookstoreUtils.*, java.util.*"%>
<%
ShoppingCart cart = (ShoppingCart)session.getAttribute("cart");
%>
<!doctype html>
    <head>
        <title>Thank You</title>
        <script src="js/mainCode.js"></script>
        <%@include file="WEB-INF/jspf/topnav.jspf" %>
       
            <h1>Thank you!</h1>
            <br>
            <h2>Your Order Has Been Submitted.</h2>
        <%
            cart.clearCart();
            session.setAttribute("cart", cart);
        %> 
        <%@include file="WEB-INF/jspf/footer.jspf" %>