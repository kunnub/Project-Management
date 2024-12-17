package org.apache.jsp.assets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Projects;
import java.util.*;

public final class editProjects_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Edit Project</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Edit Project</h1>\n");
      out.write("        ");

            Projects project = (Projects) request.getAttribute("project");
        
      out.write("\n");
      out.write("        <form action=\"UpdateProjectServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.print( project.getId() );
      out.write("\">\n");
      out.write("            <label for=\"name\">Project Name:</label>\n");
      out.write("            <input type=\"text\" id=\"name\" name=\"name\" value=\"");
      out.print( project.getName() );
      out.write("\"><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"description\">Description:</label>\n");
      out.write("            <textarea id=\"description\" name=\"description\">");
      out.print( project.getDesc() );
      out.write("</textarea><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"status\">Status:</label>\n");
      out.write("            <select id=\"status\" name=\"status\">\n");
      out.write("                <option value=\"Active\" ");
      out.print( project.getStatus().equals("Active") ? "selected" : "" );
      out.write(">Active</option>\n");
      out.write("                <option value=\"Inactive\" ");
      out.print( project.getStatus().equals("Inactive") ? "selected" : "" );
      out.write(">Inactive</option>\n");
      out.write("            </select><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"image\">Image:</label>\n");
      out.write("            <input type=\"file\" id=\"image\" name=\"image\"><br><br>\n");
      out.write("\n");
      out.write("            <button type=\"submit\">Update</button>\n");
      out.write("        </form>\n");
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
