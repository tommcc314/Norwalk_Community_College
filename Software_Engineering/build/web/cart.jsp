
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bookstoreUtils.*, java.util.*"%>
<%
    String itemParam = request.getParameter("isbn");
    String clearParam = request.getParameter("clear");
    ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
    if (itemParam != null) {
        Item item = new Item(itemParam);
        //Adding an item
        if (cart != null) {
            //cart exists
            if (cart.addItem(item)) {
                session.setAttribute("cart", cart);
            }
        } else {
            //First item
            cart = new ShoppingCart();
            cart.addItem(item);
            session.setAttribute("cart", cart);
        }
    } else if (clearParam != null) {
        if (cart != null) {
            cart.clearCart();
            session.setAttribute("cart", cart);
        }
    }
    //refresh the cart
    cart = (ShoppingCart) session.getAttribute("cart");
%>
<!doctype html>


    <head>
        <title>Cart</title>
        <script src="js/mainCode.js"></script>
        <%@include file="WEB-INF/jspf/topnav.jspf" %>
        <%@include file="WEB-INF/jspf/sidebar.jspf" %>
    <div role="main" class="col-md-9">
        <!--
            ************************
            HERE IS THE MAIN CONTENT
            ************************
        -->
        <div class="row">
            <div class="container">
                <%
                    if (cart == null) {
                %>
                <h4>Shopping Cart is Empty</h4>   
            </div>         
        </div>
    </div>
    <div class="check-footer" style="width: 100%;">
        <div class="container">
            <div class="row checkOut">
                <a href="topsellers.jsp" style="margin-left:50px;">Continue Shopping</a>
                <h3 style="margin-left: 100px;"><b>Total: $0.00</b></h3>
            </div>
        </div>
    </div>
    <%
    } else {
    %>

    <form name="cartAdd" id="cartAdd" action="UpdateCartServlet" method="post" onsubmit="return false;" >
        <%
            ArrayList items = cart.getCart();
            int itemCount = items.size();
            if (itemCount == 0) {
        %>
        <h3>Shopping Cart is Empty</h3>
        </div>         
    </div>
</div>

        <div class="container-fluid check-footer" style="width: 100%;">
            <div class="container">
                <div class="row checkOut justify-content-center text-center"> 
                    <a href="topsellers.jsp" style="margin-left:50px;">Continue Shopping</a>
                    <h3 style="margin-left: 100px;"><b>Total: $0.00</b></h3>
                </div>
            </div>
        </div>
    
        <%
        } else {
        %>
        <h3>Shopping Cart</h3>
        <%
            
            for (int i = 0; i < itemCount; i++) {
                Item item = (Item) items.get(i);
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
                <i class="material-icons-outlined button" onClick="increaseQuant('item<%= i%>')" style="cursor: pointer; float: left; padding: 10px;">add_circle_outline</i>
                <input type="number" min="1" size="2" name="item<%= i%>" id="item<%= i%>" value="<%= item.getQuantity()%>" style="padding: 5px; width: 100px; float: left;" readonly="readonly" />
                <i class="material-icons-outlined button" onClick="decreaseQuant('item<%= i%>')" style="cursor: pointer; float: left; padding: 10px;">remove_circle_outline</i>
                <button type="button" style="width: 100%" class="btn btn-danger" onclick="removeItem('item<%= i%>')">Remove</button>
            </div>
        </div>


        <%
            }
        
        %>  
        <div class="container-fluid check-footer" style="width: 100%;">
            <div class="container">
                <div class="row checkOut justify-content-center text-center">
                    <a href="cart.jsp?clear=true">Clear Cart</a> 
                    <a href="topsellers.jsp" style="margin-left:50px;">Continue Shopping</a>
                    <h3 style="margin-left: 100px;"><b>Total: </b><%= cart.getStringTotal()%></h3>
                    <a href="checkout.jsp" style="margin-left: 100px;" type="button" class="checkOut btn btn-primary">Check Out</a>
                </div>
            </div>
        </div>
    </form>
</div>         
</div>
</div>


<%
    }
}
%>



<%@include file="WEB-INF/jspf/footer.jspf" %>