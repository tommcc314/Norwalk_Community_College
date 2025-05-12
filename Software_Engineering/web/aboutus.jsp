<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>

    <head>
        <title>About Us</title>

    <%@include file="WEB-INF/jspf/topnav.jspf" %>

    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3 text-center">
                <img src="images/storeinterior.jpg" alt="store" class="insideImg">
            </div>
            <div class="col-md-6 text-center">
                <h1><b>The Norwalk Bookstore</b></h1>
                <p style="font-family: rubik;font-size: 20px; text-align: left; margin-left: 15px;">Here at the Norwalk Bookstore, we dedicate
                ourselves in bringing the best variety of books one could offer. With such a wide selection, our staff are here to help you find 
                the best books that fit your taste and provide the best answers for any questions you might have. We hope to see you soon!</p>
            </div>
            <div class="col-md-3 text-center">
                <img src="images/storeinterior2.jpg" alt="storeinterior" class="insideImg">
            </div>
            <div class="container text-center">
                <div class="row">
                    <div class="col-md-7 DSK">
                        <iframe
                            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12025.844723189468!2d-73.45904873284523!3d41.10261802156402!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89e81e0e4aefe2f3%3A0x6c4ef84993e5df95!2s188%20Richards%20Ave%2C%20Norwalk%2C%20CT%2006854!5e0!3m2!1sen!2sus!4v1602777947519!5m2!1sen!2sus"
                            width="500" height="450" frameborder="0" style="border:0;" allowfullscreen=""
                            aria-hidden="false" tabindex="0"></iframe>
                    </div>

                    <div class="col-md-4 MOB">
                        <iframe
                            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12025.844723189468!2d-73.45904873284523!3d41.10261802156402!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89e81e0e4aefe2f3%3A0x6c4ef84993e5df95!2s188%20Richards%20Ave%2C%20Norwalk%2C%20CT%2006854!5e0!3m2!1sen!2sus!4v1602777947519!5m2!1sen!2sus"
                            width="400" height="450" frameborder="0" style="border:0;" allowfullscreen=""
                            aria-hidden="false" tabindex="0"></iframe>
                    </div>

                    <div class="col-md-3" id="locationInfo">
                        <h2>Location</h2>
                        <p>### Random Ave. City, State,
                            Zip
                        </p>
                        <p><i class="material-icons">call</i>
                            <b>Phone:</b> (203) 123-4567
                        </p>
                        <p><i class="material-icons">email</i>
                            <b>Email:</b> Bookstore@gmail.com
                        </p>
                    </div>
                </div>
            </div>
        </div>

    </div>

</div>

<!--
<img src="storeinterior.jpg" alt="storeinterior" height="220" width="300" style="float: left;">
<div id="aboutus">
    <h1>The Norwalk Book Store</h1>
    <p style="font-family: rubik;font-size: 20px; text-align: left; margin-left: 15px;">Lorem ipsum dolor sit amet,
        fugit quodsi adversarium ex cum, wisi intellegam adversarium ex mel. Affert mollis scaevola eu eos,
        intellegat temporibus te nam. Ne quas liber maiestatis quo, eos recusabo nominati ea, sed id timeam
        conclusionemque. An oratio ignota platonem nam, cu nisl equidem omnesque mea. Quo quis lorem sonet ea. Eam
        eu nullam noluisse, postea pericula eu mel. Cu minimum interpretaris quo, no est falli zril recusabo, wisi
        dignissim pri te.

    <h2 style="text-align: left; margin-left: 100px; font-size: 30px; font-family: helvetica; margin-top: 80px;">
        Location</h2>
    <p style="font-size: 18px; text-align: left; margin-left: 100px;">### Random Ave. City, State, Zip</p>
    <iframe
        src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12025.844723189468!2d-73.45904873284523!3d41.10261802156402!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89e81e0e4aefe2f3%3A0x6c4ef84993e5df95!2s188%20Richards%20Ave%2C%20Norwalk%2C%20CT%2006854!5e0!3m2!1sen!2sus!4v1602777947519!5m2!1sen!2sus"
        width="600" height="450" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false"
        tabindex="0"></iframe>
</div>
<img src="storeinterior2.jpg" alt="storeinterior" height="220" width="300" style="float: left; margin-left: 30px;">
<div class="bottomnav" style="margin-top: 100px;">
    <p style="float:none;">&#169 The Norwalk Book Store</p>
</div>
-->

<%@include file="WEB-INF/jspf/footer.jspf" %>
