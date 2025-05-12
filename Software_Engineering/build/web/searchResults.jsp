<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/connection.jspf" %>
<%  String temp = (String) request.getParameter("search");
    String ctgry = (String) request.getParameter("ctgry");
    String query = "";
    if (ctgry != "" && temp == ""){
        query = "SELECT * FROM BOOKSQUERY WHERE CATEGORY = '"+ ctgry +"'";
    } else if (ctgry != "" && temp != "") {
        query = "SELECT * FROM BOOKSQUERY WHERE KEYWORDS LIKE '%" + temp + "%' AND CATEGORY = '"+ ctgry +"'";
    } else {
        query = "SELECT * FROM BOOKSQUERY WHERE KEYWORDS LIKE '%" + temp + "%'";
    }
    ResultSet rs = stmt.executeQuery(query);

%>
<!doctype html>

    <head>
        <title>Search Results</title>
    <%@include file="WEB-INF/jspf/topnav.jspf" %>
    <%@include file="WEB-INF/jspf/sidebar.jspf" %>
    <div role="main" class="col-md-9">
        <!--
            ************************
            HERE IS THE MAIN CONTENT
            ************************
        -->
        <div class="container-fluid resultSet">
            <% 
                if (temp == "" && ctgry == ""){
            %>
            <h1>Searching All</h1>
            <% 
                } else if(temp == ""){
            %>
            <h1><b>Category:</b> <%= request.getParameter("ctgry")%></h1>
            <% 
                } else {
            %>
            <h1><b>Results for:</b> <%= temp%></h1>
            <% } %>
            <div class="container results">
                <%@include file="WEB-INF/jspf/output.jspf" %>

            </div>
        </div>
    </div>
</div>
</div>

<%@include file="WEB-INF/jspf/footer.jspf" %>
<%@include file="WEB-INF/jspf/close.jspf" %>