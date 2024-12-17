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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Project Management</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/admin.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Project Management</h1>\n");
      out.write("        <table>\n");
      out.write("            <tr>          \n");
      out.write("                <th>Project Id</th>\n");
      out.write("                <th>Project Name</th>\n");
      out.write("                <th>Description</th>\n");
      out.write("                <th>project status</th>\n");
      out.write("                <th>Actions</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                List<Projects> projectList = (List<model.Projects>) request.getAttribute("projectList");

                if (projectList != null && !projectList.isEmpty()) {
                    for (Projects project : projectList) {


            
      out.write("\n");
      out.write("            <tr>             \n");
      out.write("                <td>");
      out.print( project.getId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( project.getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( project.getDesc());
      out.write("</td>\n");
      out.write("<!--                <td>\n");
      out.write("                    <form action=\"GetImageServlet\" method=\"get\">\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print( project.getId());
      out.write("\">\n");
      out.write("                        <img src=\"GetImageServlet?id=");
      out.print( project.getId());
      out.write("\" alt=\"Project Image\" width=\"100\" height=\"100\">\n");
      out.write("                    </form>\n");
      out.write("                </td>-->\n");
      out.write("                <td>");
      out.print( project.getStatus());
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <!-- Edit Button -->\n");
      out.write("                    <form action=\"EditProjectDetails\" method=\"get\" style=\"display:inline;\">\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print( project.getId());
      out.write("\">\n");
      out.write("                        ");
System.out.println(project.getId());
      out.write("\n");
      out.write("                        <button type=\"submit\">Edit</button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <!-- Delete Button -->\n");
      out.write("                    <form action=\"DeleteProjectsServlet\" method=\"post\" style=\"display:inline;\">\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print( project.getId());
      out.write("\">\n");
      out.write("                        <button type=\"submit\" onclick=\"return confirm('Are you sure you want to delete this project?')\">Delete</button>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }
            } else {

            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"4\" class=\"no-records\" > no records found</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <a href=\"addProject.jsp\">Add New Project</a>\n");
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
