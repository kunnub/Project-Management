package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Subscriber;
import java.util.List;

public final class subscription_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Subscription Management</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/subscription.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Subscription Management</h1>\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Subscriber ID</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Subscription Date</th>\n");
      out.write("                        <th>Actions</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        System.out.println("program starteed....");
                        List<model.Subscriber> jspsubscribers = (List<model.Subscriber>) request.getAttribute("subscribers");
                        System.out.println("hellooooo");
//                        if (subscribers == null) {
//                            out.println("Subscriber list is null.");
//                        } else {
//                            out.println("Subscriber list size: " + subscribers.size());
//                        }
//                        for (Subscriber subscriber:subscribers) {
////                            System.out.println(subscribers.get(i));
//                            System.out.println("hello .......");
//                        }
                        if (jspsubscribers != null && !jspsubscribers.isEmpty()) {
                            System.out.println("if statement called");
                            for (model.Subscriber subscriber : jspsubscribers) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( subscriber.getId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( subscriber.getEmail());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( subscriber.getSubscriptiondate());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <form action=\"DeleteSubscriptions\" method=\"post\">\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
      out.print( subscriber.getId());
      out.write("\">\n");
      out.write("                                <input type=\"submit\" class=\"delete-btn\" value=\"Delete\">\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    } else {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"4\" class=\"no-records\">No records found</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
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
