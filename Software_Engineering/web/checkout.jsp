
<%
ShoppingCart cart = (ShoppingCart)session.getAttribute("cart");
//must re-direct before <html> is encountered
if(cart==null||cart.getCart().size()==0){
    response.sendRedirect("cart.jsp");
}else{
    String payment = (String) request.getParameter("payment");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bookstoreUtils.*, java.util.*"%>
<%
    ArrayList items = cart.getCart();
    int itemCount = items.size();
%>
<!doctype html>


    <head>
        <title>Check Out</title>
        <script src="js/mainCode.js"></script>
        <%@include file="WEB-INF/jspf/topnav.jspf" %>
        <%@include file="WEB-INF/jspf/sidebar.jspf" %>
        <div role="main" class="col-md-9">
        <div class="row">
            <div class="container">
            <h1>Order Details</h1>
            
        <%
                for(int i=0; i<itemCount; i++){
                    Item item = (Item)items.get(i);
        %>
                <div class="container content">
                    <div class="bookImage col-xs-1 col-sm-2 col-md-2 text-left">
                        <img src="<%= item.getCoverpic()%>" alt="" class="bookImg">
                    </div>
                    <div class="bookDesc col-xs-7 col-sm-7 col-md-6">
                        <h2 class="bookTitle"><%= item.getTitle()%></h2>
                        <h3>$<%= item.getPrice()%></h3>
                    </div>
                <div class="quantInfo col-xs-4 col-sm-4 col-md-4 justify-content-center text-center">
                    <p>Quantity: <%= item.getQuantity() %></p>
                </div>
                </div>
        <%
            }
        %>
                <h3><b>Total: <%= cart.getStringTotal() %></b></h3>
            </div>
        </div>
    </div>
        
        <%
            if(payment==null) {
        %>
        <div class="check-footer" style="width: 100%;">
        <div class="container">
            <div class="row checkOut">
                <h3 style="margin-left: 100px;">Choose your payment system:</h3>
                <a style="margin-left: 100px; margin-right: 40px;"href="checkout.jsp?payment=creditcard"><img src="images/payment-methods.png"height="50" width="220"></a>
                <form action="https://sandbox.paypal.com/us/cgi-bin/webscr" method="post">
               <input type="hidden" name="cmd" value="_xclick">
               <input type="hidden" name="business" value="orders@bookstore.com">
               <input type="hidden" name="item_name" value="Bookstore Shopping Cart Order">
               <input type="hidden" name="currency_code" value="USD">
               <input type="hidden" name="amount" value="<%= cart.getTotal() %>">
               <input type="hidden" name="cancel_return" value="http://localhost:8080/GroupStoreProject/checkout.jsp"> 
               <input type="hidden" name="return" value="http://localhost:8080/GroupStoreProject/checkout.jsp?payment=paypal">
               <input type="image" src="https://www.paypalobjects.com/webstatic/en_US/i/buttons/checkout-logo-large.png" name="submit" alt="Make payments with PayPal - it's fast, free and secure!">
            </form>
            </div>
        </div>
        </div>
        <%
            }
        else if (payment.equals("creditcard")) {
        %>
        <div style="margin: auto;">
            <form action="SubmitOrderServlet" method="post">
            
                <h3>Billing Information</h3>
                <input type="text" name="FirstName" class="billing-field" placeholder="First Name" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="LastName" class="billing-field" placeholder="Last Name" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="BillingAddress" class="billing-field" placeholder="Billing Address" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="BillingCity" class="billing-field" placeholder="City" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="BillingRegion" class="billing-field" placeholder="State/Region" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="BillingCountry" class="billing-field" placeholder="Country" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="BillingPostalCode" class="billing-field" placeholder="Postal Code" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="CustomerEmail" class="billing-field" placeholder="Email" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <select size="1" name="CreditCardTypeID" style="margin-bottom: 5px;">
                    <option selected value="3">American Express</option>
                    <option value="2">MasterCard</option>
                    <option value="1">Visa</option>
                </select><br>
                <input type="text" name="CreditCard" class="billing-field" placeholder="Card Number" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="CardExpMo" class="billing-field" placeholder="Expiration Month (mm)" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="CardExpYr" class="billing-field" placeholder="Expiration Year (yyyy)" size="50" required="required" style="margin-bottom: 5px;" /><br>
            </form>
        </div>
        <div class="check-footer" style="width: 100%; text-align: center;">
                <a onClick="document.forms[1].submit()" class="checkOut btn btn-primary" >Submit Order</a>
        </div>
        <%
            }
        else {
        %>
        <div style="margin: auto;">
            <form action="SubmitOrderServlet" method="post">
            
                <h3>Billing Information</h3>
                <input type="text" name="FirstName" class="billing-field" placeholder="First Name" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="LastName" class="billing-field" placeholder="Last Name" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="BillingAddress" class="billing-field" placeholder="Billing Address" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="BillingCity" class="billing-field" placeholder="City" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="BillingRegion" class="billing-field" placeholder="State/Region" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="BillingCountry" class="billing-field" placeholder="Country" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="BillingPostalCode" class="billing-field" placeholder="Postal Code" size="50" required="required" style="margin-bottom: 5px;" /><br>
                <input type="text" name="CustomerEmail" class="billing-field" placeholder="Email" size="50" required="required" style="margin-bottom: 5px;" /><br>
            </form>
        </div>
        <div class="check-footer" style="width: 100%; text-align: center;">
                <a onClick="document.forms[1].submit()" class="checkOut btn btn-primary" >Submit Order</a>
        </div>
        <%
            }
        %>
<%@include file="WEB-INF/jspf/footer.jspf" %>
<%
    }
%>
