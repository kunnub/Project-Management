package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Projects;

public final class projects_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Project Management</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./AdminFormsCSS.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>       \r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./AdminNavbar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h1>Project Management</h1>\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>          \r\n");
      out.write("                <th>Project Id</th>\r\n");
      out.write("                <th>Project Name</th>\r\n");
      out.write("                <th>Description</th>\r\n");
      out.write("                <th>project Image</th>\r\n");
      out.write("                <th>Project Status</th>\r\n");
      out.write("                <th>Broker Details</th>\r\n");
      out.write("                <th>Buyer</th>\r\n");
      out.write("                <th>Seller</th>\r\n");
      out.write("                <th>Actions</th>\r\n");
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            ");

                List<Projects> projectList = (List<model.Projects>) request.getAttribute("projectList");

                if (projectList != null && !projectList.isEmpty()) {
                    for (Projects project : projectList) {


            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <tr>             \r\n");
      out.write("                <td>");
      out.print( project.getId());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( project.getName());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( project.getDesc());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( project.getStatus());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(project.getImage());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(project.getBroker());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(project.getBuyer());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(project.getSeller());
      out.write("</td>\r\n");
      out.write("                \r\n");
      out.write("                <td>\r\n");
      out.write("                    <!-- Edit Button -->\r\n");
      out.write("                    <form action=\"EditProjectDetails\" method=\"get\" style=\"display:inline;\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print( project.getId());
      out.write("\">\r\n");
      out.write("                        <button type=\"submit\">Edit</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Delete Button -->\r\n");
      out.write("                    <form action=\"DeleteProjectsServlet\" method=\"post\" style=\"display:inline;\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print( project.getId());
      out.write("\">\r\n");
      out.write("                        <button type=\"submit\" class=\"delete-btn\" onclick=\"return confirm('Are you sure you want to delete this project?')\">Delete</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 }
            } else {

            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"4\" class=\"no-records\" > no records found</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        <a href=\"addProject.jsp\" id=\"addNewProject\">Add New Project</a>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./AdminFooter.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
