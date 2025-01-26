package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddBrokers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Add New Broker</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./AdminFormsCSS.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./AdminNavbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Page Title -->\n");
      out.write("        <h1 id=\"addBrokerTitle\">Add New Broker</h1>\n");
      out.write("\n");
      out.write("        <!-- Form Section -->\n");
      out.write("        <form id=\"addBrokers\" action=\"AddProjectsBroker\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <!-- Project Name Field -->\n");
      out.write("            <div class=\"form-group\" id=\"projectNameGroup\">\n");
      out.write("                <label for=\"projectNameInput\">Broker Name:</label>\n");
      out.write("                <input type=\"text\" id=\"projectNameInput\" name=\"name\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <div class=\"form-group\" id=\"projectNameGroup\">\n");
      out.write("                <label for=\"projectNameInput\">Broker Ph-No</label>\n");
      out.write("                <input type=\"text\" id=\"projectNameInput\" name=\"phNo\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <div class=\"form-group\" id=\"projectNameGroup\">\n");
      out.write("                <label for=\"projectNameInput\">Broker E-mail:</label>\n");
      out.write("                <input type=\"mail\" id=\"projectNameInput\" name=\"Mail\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <div class=\"form-group\" id=\"projectNameGroup\">\n");
      out.write("                <label for=\"projectNameInput\">Joining Date:</label>\n");
      out.write("                <input type=\"date\" id=\"projectNameInput\" name=\"date\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("<!--            Image field\n");
      out.write("            <div class=\"form-group\" id=\"projectStatusGroup\">\n");
      out.write("                <label for=\"projectImageInput\">Upload Image:</label>\n");
      out.write("                <input type=\"file\" name=\"image\" id=\"image\" accept=\"image/*\" required><br>\n");
      out.write("            </div>-->\n");
      out.write("\n");
      out.write("            <!-- Submit Button -->\n");
      out.write("            <div class=\"form-group\" id=\"submitButtonGroup\">\n");
      out.write("                <button id=\"submitProjectButton\" type=\"submit\">Add Broker</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <!-- Back to Project List Link -->\n");
      out.write("        <!--        <div id=\"backToProjectLinkContainer\">-->\n");
      out.write("        <a href=\"FetchProjectDetails\" id=\"backToBrokerDisplay\">Back</a>\n");
      out.write("        <!--</div>-->\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./AdminFooter.jsp", out, false);
      out.write("\n");
      out.write("\n");
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
