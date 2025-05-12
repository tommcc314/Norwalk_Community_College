
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Sign In</title>        
    <%@include file="WEB-INF/jspf/topnav.jspf" %>
    <div class="container-fluid text-center justify-content-center" id="contactus" style="padding-top: 20px;">
        <h1>Hi! We'd love to hear from you.</h1>
        <div class="container text-center">
            <h2 style="font-size: 35px;">Phone</h2>
            <p style="font-size: 20px;">(203) 123-4567</p>
            <h2 style="font-size: 35px;">Email</h2>
            <p style="font-size: 20px;">bookStore@gmail.com</p>
        </div>
        <div class="container text-center">
            <h2 style="font-size: 35px;">Location</h2>
            <p style="font-size: 20px;">### Random Ave. City, State, Zip</p>
            <iframe
                src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12025.844723189468!2d-73.45904873284523!3d41.10261802156402!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89e81e0e4aefe2f3%3A0x6c4ef84993e5df95!2s188%20Richards%20Ave%2C%20Norwalk%2C%20CT%2006854!5e0!3m2!1sen!2sus!4v1602777947519!5m2!1sen!2sus"
                width="600" height="450" frameborder="0" style="border:0; display: block; margin: auto;" allowfullscreen="" aria-hidden="false"
                tabindex="0"></iframe>
        </div>
    </div>
    
    <%@include file="WEB-INF/jspf/footer.jspf" %>