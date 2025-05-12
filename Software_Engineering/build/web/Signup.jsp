<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sign Up</title>
        <%@include file="WEB-INF/jspf/topnav.jspf" %>
    <div class="container-fluid text-center justify-content-center" id="signup-instructions">
        <div class="container text-center">
            <h1>Create an Account</h1>
            <h3>Fill out the fields below to create an account.</h3>
        </div>
    </div>
    <div id="signup">
        <div id="signup-labels">
            <h4>Name: <input class="signup-fields" type="text"></h4>
            <h4>Email: <input class="signup-fields" type="text"></h4>
            <h4>Password: <input class="signup-fields" type="text"></h4>
            <h4>Confirm Password: <input class="signup-fields" type="text"></h4>
        </div>
    </div>
    <button type="button" id="createaccount">Create a New Account</button>
    <p></p>
    <%@include file="WEB-INF/jspf/footer.jspf" %>

