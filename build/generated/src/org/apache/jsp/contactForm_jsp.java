package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ContactDetails;
import java.util.List;

public final class contactForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Contact Form Submissions</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/admin.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Contact Form Submissions</h1>\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Id</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Email</th>\n");
      out.write("                    <th>Phone_no</th>\n");
      out.write("                    <th>Address</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                \n");
      out.write("                ");

                    List<model.ContactDetails> jspcontactList = (List<model.ContactDetails>) request.getAttribute("contacts");
                    System.out.println("contact list created");
                    
                     if (jspcontactList != null) {
        System.out.println("Contacts list size: " + jspcontactList.size());
    } else {
        System.out.println("Contacts attribute is null.");
    }
                    
                    
                    if (jspcontactList != null && !jspcontactList.isEmpty()) {
                        System.out.println(jspcontactList.size());
                        for (ContactDetails contact : jspcontactList) {

                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(contact.getId());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( contact.getName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( contact.getEmail());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( contact.getPhone_no());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( contact.getAddress());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");


                    }
                } else {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan='4' class=\"no-records\">No Records Found</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
