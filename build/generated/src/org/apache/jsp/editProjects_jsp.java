package org.apache.jsp;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Edit Project</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./AdminFormsCSS.css\"/>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>       \r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./AdminNavbar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
System.out.println("inside edit projects.jsp ");
      out.write("\r\n");
      out.write("        <h1>Edit Project</h1>\r\n");
      out.write("        ");

            Projects project = (Projects) request.getAttribute("project");
            if (project == null) {
                out.println("Error: Project details not found.");
                return;
            }
        
      out.write("\r\n");
      out.write("        ");

            String idParam = request.getParameter("id");
            System.out.println(idParam + " it is the id param");
            if (idParam == null || idParam.isEmpty()) {
                out.println("Error: Project ID is missing.");
                return;
            }
            int projectId = Integer.parseInt(idParam);
            // Now, use the projectId to fetch project details from the database
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <form id=\"editProjectForm\" action=\"EditProjectDetails\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.print( project.getId());
      out.write("\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\" id=\"projectNameGroup\">\r\n");
      out.write("                <label for=\"projectNameInput\">Project Name:</label>\r\n");
      out.write("                <input type=\"text\" id=\"projectNameInput\" name=\"name\" value=\"");
      out.print( project.getName());
      out.write("\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\" id=\"projectDescriptionGroup\">\r\n");
      out.write("                <label for=\"projectDescriptionInput\">Description:</label>\r\n");
      out.write("                <textarea id=\"projectDescriptionInput\" name=\"description\" required>");
      out.print( project.getDesc());
      out.write("</textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\" id=\"projectStatusGroup\">\r\n");
      out.write("                <label for=\"projectStatusSelect\">Status:</label>\r\n");
      out.write("                <select id=\"projectStatusSelect\" name=\"status\">\r\n");
      out.write("                    ");
System.out.println("project status is  " + project.getStatus());
      out.write("\r\n");
      out.write("                    <option value=\"Active\" ");
      out.print( project.getStatus().equals("Active") ? "selected" : "");
      out.write(">For-Sale</option>\r\n");
      out.write("                    <option value=\"Inactive\" ");
      out.print( project.getStatus().equals("Inactive") ? "selected" : "");
      out.write(">Sold</option>\r\n");
      out.write("                    <option value=\"processing\" ");
      out.print( project.getStatus().equals("processing") ? "selected" : "");
      out.write(">under-negotiation</option>\r\n");
      out.write("                    <option value=\"canceled\" ");
      out.print( project.getStatus().equals("canceled") ? "selected" : "");
      out.write(">canceled</option>\r\n");
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\" id=\"projectNameGroup\">\r\n");
      out.write("                <label for=\"projectNameInput\">Broker Details:</label>\r\n");
      out.write("                <input type=\"text\" id=\"projectNameInput\" name=\"name\" value=\"");
      out.print( project.getBroker());
      out.write("\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\" id=\"projectNameGroup\">\r\n");
      out.write("                <label for=\"projectNameInput\">Buyer:</label>\r\n");
      out.write("                <input type=\"text\" id=\"projectNameInput\" name=\"name\" value=\"");
      out.print( project.getBuyer());
      out.write("\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\" id=\"projectNameGroup\">\r\n");
      out.write("                <label for=\"projectNameInput\">Seller:</label>\r\n");
      out.write("                <input type=\"text\" id=\"projectNameInput\" name=\"name\" value=\"");
      out.print( project.getSeller());
      out.write("\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\" id=\"projectImageGroup\">\r\n");
      out.write("                <label for=\"projectImageInput\">Image</label>\r\n");
      out.write("                ");
System.out.println("project image is  " + project.getImage());
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <input type=\"file\" name=\"image\" id=\"image\" accept=\"image/*\" required>");
      out.print( project.getImage());
      out.write("<br>\r\n");
      out.write("                <!--<file id=\"projectDescriptionInput\" name=\"image\" required></textarea>-->\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\" id=\"submitButtonGroup\">\r\n");
      out.write("                <button id=\"updateProjectButton\" type=\"submit\">Update</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <a href=\"FetchProjectDetails\" id=\"backToProjectList\">Back</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./AdminFooter.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
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
