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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <title>Project and Client Management System</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./home.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Header Section -->\n");
      out.write("        <header>\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <img src=\"./assets/images/logo.svg\" alt=\"Logo\" class=\"logo\" width=\"5%\"/>\n");
      out.write("                <nav>\n");
      out.write("                    <a href=\"#\" class=\"links\">Home</a>\n");
      out.write("                    <a href=\"#about\" class=\"links\">About</a>\n");
      out.write("                    <a href=\"#projects\" class=\"links\">Our Projects</a>\n");
      out.write("                    <a href=\"#clients\" class=\"links\">Happy Clients</a>\n");
      out.write("                    <a href=\"#contact-form\" class=\"links\">Contact</a>\n");
      out.write("                </nav>\n");
      out.write("                ");

                    if (session.getAttribute("email") != null) {
      out.write("\n");
      out.write("                <button  id=\"signOut-btn\" onclick=\"location.href = 'LogOut.jsp'\"><b>Log Out</b></a>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                ");
 } else {
      out.write("\n");
      out.write("                <button  id=\"signUp-btn\" onclick=\"location.href = 'registration.html'\"><b>Sign Up</b></a>\n");
      out.write("                </button>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-section\">\n");
      out.write("                Consultation,<br/>\n");
      out.write("                Design<br/>\n");
      out.write("                & Marketing\n");
      out.write("            </div>\n");
      out.write("            <div class=\"contact-form\" id=\"contact-form\">\n");
      out.write("                <h1>Get a Free Consultation</h1>\n");
      out.write("                <form action=\"AddContact\" method=\"post\">\n");
      out.write("                    <input type=\"text\" name=\"name\" placeholder=\"Full Name\" required>\n");
      out.write("                    <input type=\"email\" name=\"email\" placeholder=\"Enter Email Address\" required>\n");
      out.write("                    <input type=\"tel\" name=\"mobile\" placeholder=\"Mobile Number\" required>\n");
      out.write("                    <input type=\"text\" name=\"address\" placeholder=\"Area, City\" required>\n");
      out.write("                    <button type=\"submit\" class=\"btn\">Get Quick Quote</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Stable Container Section -->\n");
      out.write("        <div class=\"stable-container\">\n");
      out.write("            <div class=\"side-header\">\n");
      out.write("                <h2>Not Your Average Realtor</h2>\n");
      out.write("                <p>Real estate is my life, but it's not my entire life. I am a real person, just like you. Let's work together to make your real estate dreams a reality.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"image-container\">\n");
      out.write("                <img id=\"img1\" src=\"./assets/images/Ellipse11.svg\" alt=\"Realtor smiling and holding a key\" height=\"300px\" width=\"150\"/>\n");
      out.write("                <img id=\"img2\" src=\"./assets/images/Ellipse12.svg\" alt=\"Realtor with a family\" height=\"290px\" width=\"150\"/>\n");
      out.write("                <img id=\"img3\" src=\"./assets/images/Ellipse13.svg\" alt=\"Realtor with a client\" height=\"290px\" width=\"150\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Why Choose Us Section -->\n");
      out.write("        <div class=\"why-choose-us\" id=\"why-choose-us\">\n");
      out.write("            <h2>Why Choose Us?</h2>\n");
      out.write("            <div class=\"underline\"></div>\n");
      out.write("            <div class=\"features\">\n");
      out.write("                <div class=\"feature\">\n");
      out.write("                    <div class=\"feature-content\">\n");
      out.write("                        <img src=\"./assets/shapes/Ellipse1.svg\" class=\"background-shape\" alt=\"Feature Background Shape 1\">\n");
      out.write("                        <img src=\"./assets/icons/home.svg\" alt=\"Home Icon\" class=\"icon\">\n");
      out.write("                        <h3>Potential ROI</h3>\n");
      out.write("                        <p>Unlock the door to amazing ROI by working with us. We ensure you get the best value for your property.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"feature\">\n");
      out.write("                    <div class=\"feature-content\">\n");
      out.write("                        <img src=\"./assets/shapes/Ellipse1.svg\" class=\"background-shape\" alt=\"Feature Background Shape 2\">\n");
      out.write("                        <img src=\"./assets/icons/paintbrush-2.svg\" alt=\"Paintbrush Icon\" class=\"icon\">\n");
      out.write("                        <h3>Design</h3>\n");
      out.write("                        <p>Our design team ensures your property stands out. We help you make a lasting impression.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"feature\">\n");
      out.write("                    <div class=\"feature-content\">\n");
      out.write("                        <img src=\"./assets/shapes/Ellipse1.svg\" class=\"background-shape\" alt=\"Feature Background Shape 3\">\n");
      out.write("                        <img src=\"./assets/icons/circle-dollar-sign.svg\" alt=\"Dollar Sign Icon\" class=\"icon\">\n");
      out.write("                        <h3>Marketing</h3>\n");
      out.write("                        <p>Engaging marketing strategies ensure your property gets the attention it deserves.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--        <div class=\"gallery\">\n");
      out.write("                    <img src=\"./assets/shapes/Rectangle55.svg\" class=\"shape shape1\" alt=\"Gallery Shape 1\">\n");
      out.write("                    <img src=\"./assets/shapes/Rectangle54.svg\" class=\"shape shape2\" alt=\"Gallery Shape 2\">\n");
      out.write("                    <img src=\"./assets/shapes/Rectangle58.svg\" class=\"shape shape3\" alt=\"Gallery Shape 3\">\n");
      out.write("                    <img src=\"./assets/shapes/Ellipse24-1.svg\" class=\"shape shape4\" alt=\"Gallery Shape 4\">\n");
      out.write("                    <div class=\"gallery-item\">\n");
      out.write("                        <img src=\"./assets/shapes/Subtract-5.svg\" class=\"bg-shape\" alt=\"Foreground Shape 1\">\n");
      out.write("                        <img id=\"gallery-img1\" alt=\"Realtor showing a house to a client\" height=\"150\" src=\"./assets/images/pexels-andres-ayrton-6578391.svg\" width=\"200\"/>\n");
      out.write("        \n");
      out.write("                        <img src=\"./assets/shapes/Group-1000001645.svg\" class=\"bg-shape\" alt=\"Foreground Shape 2\">\n");
      out.write("                    </div>\n");
      out.write("        \n");
      out.write("                    <div class=\"gallery-item\">\n");
      out.write("                        <img id=\"gallery-img3\" alt=\"Realtor with a happy family\" height=\"250\" src=\"./assets/images/pexels-brett-sayles-2881232-1.svg\" width=\"300\"/>\n");
      out.write("                        <img src=\"./assets/shapes/Rectangle58.svg\" class=\"bg-shape\" alt=\"Foreground Shape 5\" >\n");
      out.write("                         <img src=\"./assests/shapes/Subtract-3.svg\" class=\"foreground-shape\" alt=\"Foreground Shape 6\"> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"gallery-item\">\n");
      out.write("                        <img id=\"gallery-img2\" alt=\"Realtor discussing with clients\" height=\"200\" src=\"./assets/images/pexels-brett-sayles-2881232-2.svg\" width=\"250\"/>\n");
      out.write("                        <img src=\"./assets/shapes/Ellipse10.svg\" class=\"foreground-shape\" alt=\"Foreground Shape 3\">\n");
      out.write("                        <img src=\"./assets/shapes/Group-1000001645.svg\" class=\"bg-shape\" alt=\"background Shape 4\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"./assets/shapes/Group1.svg\" class=\"foreground-shape\" alt=\"Foreground Shape 6\">-->\n");
      out.write("\n");
      out.write("        <div class=\"about-us\" id=\"about\">\n");
      out.write("            <h2>About Us</h2>\n");
      out.write("            <div class=\"underline\"></div>\n");
      out.write("            <p>Fifteen years of experience in real estate, excellent customer service and a commitment to work hard, listen and follow through. We provide quality service to build relationships with clients and more importantly, maintain those relationships by communicating effectively.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Our Project Section -->\n");
      out.write("        <section id=\"projects\">\n");
      out.write("            <h2><b>Our Projects</b></h2>\n");
      out.write("            <p>We know what buyers are looking for and suggest the best projects that will bring clients top dollar for the sale of their homes</p>\n");
      out.write("            <div class=\"project-container\">\n");
      out.write("                ");

                    List<model.Projects> projects = (List<model.Projects>) request.getAttribute("projectData");
                    System.out.println(projects);
                    if (projects != null) {
                        for (Projects project : projects) {
                            System.out.println("project name is " + project.getName());
                
      out.write("\n");
      out.write("                <div class=\"project\">\n");
      out.write("                    <img src=\"./assets/images/pexels-fauels-3182834.svg\" alt=\"");
      out.print( project.getName());
      out.write("\" />\n");
      out.write("                    <h3>");
      out.print( project.getName());
      out.write("</h3>\n");
      out.write("                    <p>");
      out.print( project.getDesc());
      out.write("</p>\n");
      out.write("                    <button>Read More</button>\n");
      out.write("                </div>\n");
      out.write("                ");

                        }
                    } else {
                        out.println("No projects available.");
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Happy Clients Section -->\n");
      out.write("            <section id=\"clients\">\n");
      out.write("                <h2>Happy Clients</h2>\n");
      out.write("                <div class=\"client-container\">\n");
      out.write("                    <div class=\"client\">\n");
      out.write("                        <img src=\"./assets/images/Ellipse28.svg\" alt=\"Client 1\" />\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum\n");
      out.write("                            delectus praesentium id vero sit veniam temporibus quaerat,\n");
      out.write("                        </p>\n");
      out.write("                        <h3>Client Name 1</h3>\n");
      out.write("                        <p>CEO, Company 1</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"client\">\n");
      out.write("                        <img src=\"./assets/images/Ellipse29.svg\" alt=\"Client 2\" />\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum\n");
      out.write("                            delectus praesentium id vero sit veniam temporibus quaerat\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <h3>Client Name 2</h3>\n");
      out.write("                        <p>Web Developer, Company 2</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"client\">\n");
      out.write("                        <img src=\"./assets/images/Ellipse31.svg\" alt=\"Client 3\" />\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum\n");
      out.write("                            delectus praesentium id vero sit veniam temporibus quaerat,\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <h3>Client Name 3</h3>\n");
      out.write("                        <p>Designer, Company 3</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"client\">\n");
      out.write("                        <img src=\"./assets/images/Ellipse33.svg\" alt=\"Client 4\" />\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum\n");
      out.write("                            delectus praesentium id vero sit veniam temporibus quaerat,\n");
      out.write("                        </p>\n");
      out.write("                        <h3>Client Name 4</h3>\n");
      out.write("                        <p>Designer, Company 4</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"client\">\n");
      out.write("                        <img src=\"./assets/images/Ellipse35.svg\" alt=\"Client 5\" />\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum\n");
      out.write("                            delectus praesentium id vero sit veniam temporibus quaerat,\n");
      out.write("                        </p>\n");
      out.write("                        <h3>Client Name 5</h3>\n");
      out.write("                        <p>Designer, Company 5</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <!-- Footer Section -->\n");
      out.write("            <footer>\n");
      out.write("                <div class=\"footer-hero\">\n");
      out.write("                    <img src=\"./assets/images/Rectangle.svg\" alt=\"Footer Background Image\" class=\"footer-background\"/>\n");
      out.write("                    <div class=\"overlay-text\">\n");
      out.write("                        <h2>Learn more about our listing process, as well as our additional staging and design work.</h2>\n");
      out.write("                        <button class=\"learn-more-btn\">Learn More</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-content\">\n");
      out.write("                    <div class=\"footer-links\">\n");
      out.write("                        <a href=\"#\">Home</a>\n");
      out.write("                        <a href=\"#why-choose-us\">Services</a>\n");
      out.write("                        <a href=\"#projects\">Projects</a>\n");
      out.write("                        <a href=\"#clients\">Testimonials</a>\n");
      out.write("                        <a href=\"#contact-form\">Contact</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"subscribe\">\n");
      out.write("                        <form action=\"AddSubscription\" method=\"post\">\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"email\" name=\"email\" placeholder=\"Enter Email Address\" required />\n");
      out.write("                                <button type=\"submit\" style=\"font-size: medium;\">Subscribe</button>\n");
      out.write("                            </td>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-bottom\">\n");
      out.write("                    <p>© All Rights Reserved 2023</p>\n");
      out.write("                    <div class=\"footer-brand\">\n");
      out.write("                        <img src=\"./assets/images/logo.svg\" alt=\"RealTrust Logo\" class=\"brand-logo\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"social-icons\">\n");
      out.write("                        <a href=\"#\"><img src=\"./assets/icons/Group-1.svg\" alt=\"Facebook Icon\"/></a>\n");
      out.write("                        <a href=\"#\"><img src=\"./assets/icons/Group.svg\" alt=\"Twitter Icon\"/></a>\n");
      out.write("                        <a href=\"#\"><img src=\"./assets/icons/Frame.svg\" alt=\"Instagram Icon\"/></a>\n");
      out.write("                        <a href=\"#\"><img src=\"./assets/icons/Linkedin.svg\" alt=\"LinkedIn Icon\"/></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
