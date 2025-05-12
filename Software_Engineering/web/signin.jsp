
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
    <div class="container-fluid text-center justify-content-center" id="signin-instructions">
        <div class="container text-center">
        <h1>Welcome back!</h1>
        <h3>Fill out the fields below to sign in.</h3>
        </div>
    </div>
    <div id="signin">
        <div id="signin-labels">
            <h4 style="color: black;">Email: <input class="signin-fields" type="text"></h4>
            <h4 style="color: black;">Password: <input class="signin-fields" type="text"></h4>
        </div>
    </div>
    <button type="button" id="signinbutton">Sign In</button>
    <p></p>
   <%@include file="WEB-INF/jspf/footer.jspf" %>