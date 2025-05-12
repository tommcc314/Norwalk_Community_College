package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import org.apache.derby.jdbc.*;

public final class onsale_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/WEB-INF/jspf/connection.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/topnav.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/sidebar.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/output.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/close.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    String dbURI = "jdbc:derby://localhost:1527/bookstore";
    DriverManager.registerDriver(new ClientDriver());
    Connection con = DriverManager.getConnection(dbURI);
    Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

      out.write('\n');
      out.write('\n');
    
    ResultSet rs = stmt.executeQuery("SELECT * FROM books RIGHT OUTER JOIN BOOKSQUERY "
            + "ON books.ISBN = BOOKSQUERY.ISBN WHERE SPECIALPRICE IS NOT NULL");


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>On Sale</title>\n");
      out.write("    ");
      out.write("\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<script src=\"js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\n");
      out.write("<script src=\"js/mainCode.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\"\n");
      out.write("      crossorigin=\"anonymous\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\" />   \n");
      out.write("</head>\n");
      out.write("<body style=\"height: 100%;\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Material+Icons|Material+Icons+Outlined|Material+Icons+Two+Tone|Material+Icons+Round|Material+Icons+Sharp\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <div class=\"topnav container-fluid\" id=\"myTopnav\">\n");
      out.write("        <div class=\"row justify-content-center text-center\">\n");
      out.write("            <a href=\"home.jsp\" id=\"logo-link\"><img id=\"logo\" src=\"images/logo.PNG\" alt=\"logo\" /></a>\n");
      out.write("            <a href=\"home.jsp\" class=\"button\">Home</a>\n");
      out.write("            <a href=\"aboutus.jsp\" class=\"button\">About Us</a>\n");
      out.write("            <a href=\"topsellers.jsp\" class=\"button\">Top Sellers</a>\n");
      out.write("            <a href=\"onsale.jsp\" class=\"button\">On Sale</a>\n");
      out.write("            <a href=\"contact.jsp\" class=\"button\">Contact Us</a>\n");
      out.write("            <a href=\"Signup.jsp\" class=\"button\">Sign Up</a>\n");
      out.write("            <a href=\"signin.jsp\" class=\"button\">Sign In</a>\n");
      out.write("            <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"topNav()\">\n");
      out.write("                <i class=\"fa fa-bars\"></i>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"cart.jsp\" class=\"button\" id=\"cart\"><i class=\"material-icons\" style=\"font-size: 48px; margin-top: 0px; margin-left: 10px;\">shopping_cart</i></a> \n");
      out.write("        </div>\n");
      out.write("        <div class=\"row justify-content-center text-center\">\n");
      out.write("            <form action=\"searchResults.jsp\" method=\"get\" id=\"dropdown\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <select name=\"ctgry\" id=\"myList\">\n");
      out.write("                        <option value=\"\">All</option>\n");
      out.write("                        <option value=\"database\">Database</option>\n");
      out.write("                        <option value=\"web\">Web Development</option>\n");
      out.write("                        <option value=\"graphics\">Graphic Design</option>\n");
      out.write("                        <option value=\"JavaScript\">JavaScript</option>\n");
      out.write("                        <option value=\"programming\">Programming</option>\n");
      out.write("                        <option value=\"HTML\">HTML</option>\n");
      out.write("                    </select>\n");
      out.write("                </fieldset>\n");
      out.write("           \n");
      out.write("                <input class=\"searchBar\" type=\"text\" placeholder=\"Search..\" name=\"search\">\n");
      out.write("                <button type=\"submit\" id=\"searchbutton\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>");
      out.write("\n");
      out.write("    ");
      out.write("<a href=\"javascript:void(0);\" class=\"icon\" onclick=\"sideBar()\" id=\"sidebar-toggle\">\n");
      out.write("        <i class=\"fa fa-bars\"></i>\n");
      out.write("    </a>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <nav id=\"sidebar\" class=\"links\">\n");
      out.write("            <h6>MAIN LINKS</h6>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"topsellers.jsp\">Top Sellers</a></li>\n");
      out.write("                <li><a href=\"onsale.jsp\">On Sale</a></li>\n");
      out.write("                <li><a href=\"#\">Highest Reviewed</a></li>\n");
      out.write("                <li><a href=\"product.jsp?isbn=0-07-882122-3\">Book of the Week!</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <h6>Popular Categories</h6>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"searchResults.jsp?ctgry=database&search=\">Database</a></li>\n");
      out.write("                <li><a href=\"searchResults.jsp?ctgry=web&search=\">Web Development</a></li>\n");
      out.write("                <li><a href=\"searchResults.jsp?ctgry=graphics&search=\">Graphic Design</a></li>\n");
      out.write("                <li><a href=\"searchResults.jsp?ctgry=JavaScript&search=\">JavaScript</a></li>\n");
      out.write("                <li><a href=\"searchResults.jsp?ctgry=programming&search=\">Programming</a></li>\n");
      out.write("                <li><a href=\"searchResults.jsp?ctgry=HTML&search=\">HTML</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("    <div role=\"main\" class=\"col-md-9\">\n");
      out.write("        <!--\n");
      out.write("                ************************\n");
      out.write("                HERE IS THE MAIN CONTENT\n");
      out.write("                ************************\n");
      out.write("        -->\n");
      out.write("        <div class=\"container-fluid resultSet\">\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <h1>On Sale!</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container results\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");


    rs.last();
    int bookCount = rs.getRow();
    rs.first();
    if (bookCount == 0) {

      out.write("  \n");
      out.write("<div class=\"row\">\n");
      out.write("    <h2>Hmmm... There currently seems to be no matches found</h2>\n");
      out.write("</div>\n");

    }
    for (int i = 0; i < bookCount; i++) {

      out.write(" \n");
      out.write("<div class=\"row itemOutput\">\n");
      out.write("    <div class=\"col-md-2 bookImage\">\n");
      out.write("        <a href=\"product.jsp?isbn=");
      out.print( rs.getString("ISBN"));
      out.write("\"><img src=\"");
      out.print( rs.getString("COVERPIC"));
      out.write("\" alt=\"Book_Title\"></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-6 bookInfo text-left\">\n");
      out.write("        <a href=\"product.jsp?isbn=");
      out.print( rs.getString("ISBN"));
      out.write("\"> \n");
      out.write("            <h5>");
      out.print( rs.getString("TITLE"));
      out.write("</h5>\n");
      out.write("        </a>\n");
      out.write("        <h6>By ");
      out.print( rs.getString("AU_FIRSTNAME"));
      out.write(' ');
      out.print( rs.getString("AU_LASTNAME"));
      out.write("</h6>\n");
      out.write("        <p>");
      out.print( rs.getString("DESCRIPTION"));
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-2 addCart\">\n");
      out.write("        <h5>$");
      out.print( rs.getString("PRICE"));
      out.write("</h5>\n");
      out.write("        <a href=\"cart.jsp?isbn=");
      out.print( rs.getString("isbn") );
      out.write("\"><button type=\"button\" style=\"width: 100%\" class=\"btn btn-primary\">Add to Cart</button></a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");

    rs.next();}

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"site-footer\" style=\"width:100%;\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6 col-md-3\" id=\"tinyLogo\">\n");
      out.write("                <h6>For Your Service</h6>\n");
      out.write("                <img src=\"images/logo.PNG\" alt=\"BookLogo\" style=\"width: 100%; height: auto;\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-xs-6 col-md-6 aboutUs\">\n");
      out.write("                <h6>About Us</h6>\n");
      out.write("                <p>We are dedicated to fulfill all your book needs!\n");
      out.write("                    <br>Visit or contact us for any questions or concerns you might have!\n");
      out.write("                </p>\n");
      out.write("                <p><em>Phone:</em> (203) 123-4567</p>\n");
      out.write("                <p><em>E-Mail:</em> bookStore@gmail.com</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-xs-6 col-md-3\">\n");
      out.write("                <h6>Quick Links</h6>\n");
      out.write("                <ul class=\"footer-links\">\n");
      out.write("                    <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                    <li><a href=\"tposellers.jsp\">Top Sellers</a></li>\n");
      out.write("                    <li><a href=\"onsale.jsp\">On Sale</a></li>\n");
      out.write("                    <li><a href=\"signin.jsp\">Sign In</a></li>\n");
      out.write("                    <li><a href=\"Signup.jsp\">Sign Up</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8 col-sm-6 col-xs-12\">\n");
      out.write("                <p class=\"copyright-text\">Copyright &copy; 2020 All Rights Reserved by\n");
      out.write("                    <a href=\"Home.jsp\">BookStore LLC</a>.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/vendor/jquery-1.11.2.min.js\"><\\/script>');</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
      out.write('\n');

    try{
        con.close();
    }catch(Exception e){
        
    }

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
