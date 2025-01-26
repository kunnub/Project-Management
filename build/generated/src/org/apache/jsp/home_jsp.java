package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Projects;
import java.util.List;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\"/>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("        <title>Project and Client Management System</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./home.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Header Section -->\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"navbar\">\r\n");
      out.write("                <img src=\"./assets/images/logo.svg\" alt=\"Logo\" class=\"logo\" width=\"5%\"/>\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <a href=\"#\" class=\"links\">Home</a>\r\n");
      out.write("                    <a href=\"#about\" class=\"links\">About</a>\r\n");
      out.write("                    <a href=\"#projects\" class=\"links\">Our Projects</a>\r\n");
      out.write("                    <a href=\"#clients\" class=\"links\">Happy Clients</a>\r\n");
      out.write("                    <a href=\"#contact-form\" class=\"links\">Contact</a>\r\n");
      out.write("                </nav>\r\n");
      out.write("                ");

                    if (session.getAttribute("email") != null) {
      out.write("\r\n");
      out.write("                <button  id=\"signOut-btn\" onclick=\"location.href = 'LogOut.jsp'\"><b>Log Out</b></a>\r\n");
      out.write("                </button>\r\n");
      out.write("\r\n");
      out.write("                ");
 } else {
      out.write("\r\n");
      out.write("                <button  id=\"signUp-btn\" onclick=\"location.href = 'registration.html'\"><b>Sign Up</b></a>\r\n");
      out.write("                </button>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"text-section\">\r\n");
      out.write("                Consultation,<br/>\r\n");
      out.write("                Design<br/>\r\n");
      out.write("                & Marketing\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"contact-form\" id=\"contact-form\">\r\n");
      out.write("                <h1>Get a Free <br>Consultation</h1>\r\n");
      out.write("                <form action=\"AddContact\" method=\"post\">\r\n");
      out.write("                    <input type=\"text\" name=\"name\" placeholder=\"Full Name\" required>\r\n");
      out.write("                    <input type=\"email\" name=\"email\" placeholder=\"Enter Email Address\" required>\r\n");
      out.write("                    <input type=\"tel\" name=\"mobile\" placeholder=\"Mobile Number\" required>\r\n");
      out.write("                    <input type=\"text\" name=\"query\" placeholder=\"Enter your query or concern\" required>\r\n");
      out.write("                    <input type=\"text\" name=\"address\" placeholder=\"Area, City\" required>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn\">Contact Us</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Stable Container Section -->\r\n");
      out.write("        <div class=\"stable-container\">\r\n");
      out.write("            <div class=\"side-header\">\r\n");
      out.write("                <h2><b>Not Your Average Realtor</b></h2>\r\n");
      out.write("                <p>Real estate is my life, but it's not my entire life. <br>I am a real person, just like you.<br> Let's work together to make your real estate dreams a reality.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"image-container\">\r\n");
      out.write("                <img id=\"img1\" src=\"./assets/images/Ellipse11.svg\" alt=\"Realtor smiling and holding a key\" height=\"300px\" width=\"150\"/>\r\n");
      out.write("                <img id=\"img2\" src=\"./assets/images/Ellipse12.svg\" alt=\"Realtor with a family\" height=\"290px\" width=\"150\"/>\r\n");
      out.write("                <img id=\"img3\" src=\"./assets/images/Ellipse13.svg\" alt=\"Realtor with a client\" height=\"290px\" width=\"150\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Why Choose Us Section -->\r\n");
      out.write("        <div class=\"why-choose-us\" id=\"why-choose-us\">\r\n");
      out.write("            <h2>Why Choose Us?</h2>\r\n");
      out.write("            <div class=\"underline\"></div>\r\n");
      out.write("            <div class=\"features\">\r\n");
      out.write("                <div class=\"feature\">\r\n");
      out.write("                    <div class=\"feature-content\">\r\n");
      out.write("                        <img src=\"./assets/shapes/Ellipse1.svg\" class=\"background-shape\" alt=\"Feature Background Shape 1\">\r\n");
      out.write("                        <img src=\"./assets/icons/home.svg\" alt=\"Home Icon\" class=\"icon\">\r\n");
      out.write("                        <h3>Potential ROI</h3>\r\n");
      out.write("                        <p>Unlock the door to amazing ROI by working with us.<br> We ensure you get the best value for your property.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"feature\">\r\n");
      out.write("                    <div class=\"feature-content\">\r\n");
      out.write("                        <img src=\"./assets/shapes/Ellipse1.svg\" class=\"background-shape\" alt=\"Feature Background Shape 2\">\r\n");
      out.write("                        <img src=\"./assets/icons/paintbrush-2.svg\" alt=\"Paintbrush Icon\" class=\"icon\">\r\n");
      out.write("                        <h3>Design</h3>\r\n");
      out.write("                        <p>Our design team ensures your property stands out.<br> We help you make a lasting impression.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"feature\">\r\n");
      out.write("                    <div class=\"feature-content\">\r\n");
      out.write("                        <img src=\"./assets/shapes/Ellipse1.svg\" class=\"background-shape\" alt=\"Feature Background Shape 3\">\r\n");
      out.write("                        <img src=\"./assets/icons/circle-dollar-sign.svg\" alt=\"Dollar Sign Icon\" class=\"icon\">\r\n");
      out.write("                        <h3>Marketing</h3>\r\n");
      out.write("                        <p>Engaging marketing strategies ensure your property gets the attention it deserves.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"gallery\">\r\n");
      out.write("            <div class=\"gallery-item\">\r\n");
      out.write("                <img id=\"background-img1\" alt=\"none\" src=\"./assets/shapes/Subtract-2.svg\"/>\r\n");
      out.write("                <img id=\"gallery-img1\" alt=\"Realtor showing a house to a client\"  width=\"210\" src=\"./assets/images/pexels-andres-ayrton-6578391.svg\" width=\"200\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"gallery-item\">\r\n");
      out.write("                <img id=\"gallery-img3\" alt=\"Realtor with a happy family\" height=\"250\" src=\"./assets/images/pexels-brett-sayles-2881232-1.svg\" width=\"300\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img id=\"background-img2\" alt=\"none\" src=\"./assets/shapes/Rectangle57.svg\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"gallery-item\">\r\n");
      out.write("                <img id=\"gallery-img2\" alt=\"Realtor discussing with clients\" height=\"200\" src=\"./assets/images/pexels-brett-sayles-2881232-2.svg\" width=\"250\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <img id=\"background-img5\" alt=\"none\" src=\"./assets/shapes/Subtract-5.svg\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"about-us\" id=\"about\">\r\n");
      out.write("            <h2>About Us</h2>\r\n");
      out.write("            <div class=\"underline\"></div>\r\n");
      out.write("            <p>Fifteen years of experience in real estate, excellent customer service and a commitment to work hard, listen and follow through. We provide quality service to build relationships with clients and more importantly, maintain those relationships by communicating effectively.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Our Project Section -->\r\n");
      out.write("        <section id=\"projects\">\r\n");
      out.write("            <h2><b>Our Projects</b></h2>\r\n");
      out.write("            <p>We know what buyers are looking for and suggest the best projects that will bring clients top dollar for the sale of their homes</p>\r\n");
      out.write("            <div class=\"project-container\">\r\n");
      out.write("                ");

                    List<model.Projects> projects = (List<model.Projects>) request.getAttribute("projectData");
                    System.out.println(projects);
                    if (projects != null) {
                        for (Projects project : projects) {
                            System.out.println("project name is " + project.getName());
                            System.out.println("project image is  " + project.getImage());
                
      out.write("\r\n");
      out.write("                <div class=\"project\">\r\n");
      out.write("                    ");
 String imageName = project.getImage();
      out.write("\r\n");
      out.write("                    ");
String imagePath = "ImgDirectory/" + imageName;
      out.write("\r\n");
      out.write("                    <img src=\"");
      out.print(imagePath);
      out.write("\" alt=\"");
      out.print(imageName);
      out.write(" \" height=\"45% />\"\r\n");
      out.write("                    <h3>");
      out.print( project.getName());
      out.write("</h3>\r\n");
      out.write("                    <p>");
      out.print( project.getDesc());
      out.write("</p>\r\n");
      out.write("                    <button>Read More</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                        }
                    } else {
                        out.println("No projects available.");
                    }
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Happy Clients Section -->\r\n");
      out.write("            <section id=\"clients\">\r\n");
      out.write("                <h2>Happy Clients</h2>\r\n");
      out.write("                <div class=\"client-container\">\r\n");
      out.write("                    <div class=\"client\">\r\n");
      out.write("                        <img src=\"./assets/images/Ellipse28.svg\" alt=\"Client 1\" />\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum\r\n");
      out.write("                            delectus praesentium id vero sit veniam temporibus quaerat,\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <h3>Client Name 1</h3>\r\n");
      out.write("                        <p>CEO, Company 1</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"client\">\r\n");
      out.write("                        <img src=\"./assets/images/Ellipse29.svg\" alt=\"Client 2\" />\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum\r\n");
      out.write("                            delectus praesentium id vero sit veniam temporibus quaerat\r\n");
      out.write("                        </p>\r\n");
      out.write("\r\n");
      out.write("                        <h3>Client Name 2</h3>\r\n");
      out.write("                        <p>Web Developer, Company 2</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"client\">\r\n");
      out.write("                        <img src=\"./assets/images/Ellipse31.svg\" alt=\"Client 3\" />\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum\r\n");
      out.write("                            delectus praesentium id vero sit veniam temporibus quaerat,\r\n");
      out.write("                        </p>\r\n");
      out.write("\r\n");
      out.write("                        <h3>Client Name 3</h3>\r\n");
      out.write("                        <p>Designer, Company 3</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"client\">\r\n");
      out.write("                        <img src=\"./assets/images/Ellipse33.svg\" alt=\"Client 4\" />\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum\r\n");
      out.write("                            delectus praesentium id vero sit veniam temporibus quaerat,\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <h3>Client Name 4</h3>\r\n");
      out.write("                        <p>Designer, Company 4</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"client\">\r\n");
      out.write("                        <img src=\"./assets/images/Ellipse35.svg\" alt=\"Client 5\" />\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum\r\n");
      out.write("                            delectus praesentium id vero sit veniam temporibus quaerat,\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <h3>Client Name 5</h3>\r\n");
      out.write("                        <p>Designer, Company 5</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer Section -->\r\n");
      out.write("            <footer>\r\n");
      out.write("                <div class=\"footer-hero\">\r\n");
      out.write("                    <img src=\"./assets/images/Rectangle.svg\" alt=\"Footer Background Image\" class=\"footer-background\"/>\r\n");
      out.write("                    <div class=\"overlay-text\">\r\n");
      out.write("                        <h2 style=\"color: white\">Learn more about our listing process, as well as our additional staging and design work.</h2>\r\n");
      out.write("                        <button class=\"learn-more-btn\">Learn More</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-content\">\r\n");
      out.write("                    <div class=\"footer-links\">\r\n");
      out.write("                        <a href=\"#\">Home</a>\r\n");
      out.write("                        <a href=\"#why-choose-us\">Services</a>\r\n");
      out.write("                        <a href=\"#projects\">Projects</a>\r\n");
      out.write("                        <a href=\"#clients\">Testimonials</a>\r\n");
      out.write("                        <a href=\"#contact-form\">Contact</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"subscribe\">\r\n");
      out.write("                        <form action=\"AddSubscription\" method=\"post\">\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <input type=\"email\" name=\"email\" placeholder=\"Enter Email Address\" required />\r\n");
      out.write("                                <button type=\"submit\" style=\"font-size: medium;\">Subscribe</button>\r\n");
      out.write("                            </td>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-bottom\">\r\n");
      out.write("                    <p>© All Rights Reserved 2023</p>\r\n");
      out.write("                    <div class=\"footer-brand\">\r\n");
      out.write("                        <img src=\"./assets/images/logo.svg\" alt=\"RealTrust Logo\" class=\"brand-logo\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"social-icons\">\r\n");
      out.write("                        <a href=\"#\"><img src=\"./assets/icons/Group-1.svg\" alt=\"Facebook Icon\"/></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"./assets/icons/Group.svg\" alt=\"Twitter Icon\"/></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"./assets/icons/Frame.svg\" alt=\"Instagram Icon\"/></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"./assets/icons/Linkedin.svg\" alt=\"LinkedIn Icon\"/></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
