/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
@WebFilter(urlPatterns = {
    "/FetchContactDetails",
    "/AddProjectsServlet",
    "/DeleteProjectsServlet",
    "/EditProjectDetails",
    "/fetchProjectDetails",
    "/FetchSubscriptions",
    "/FetchUserData",
    "/DeleteSubscriptions"
})
public class AdminAuthFilter implements Filter {

    public void init(FilterConfig fConfig) throws ServletException {
        // Initialization if needed
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        HttpSession session = httpRequest.getSession(false);  // Get session without creating a new one

        // Check if the session exists and if the user is an admin
        if (session == null || session.getAttribute("role") == null || !session.getAttribute("role").equals("admin")) {
            // Redirect to login page if not authenticated or not an admin
            httpResponse.sendRedirect("AdminLogin.html");
        } else {
            // Continue with the request if the user is an admin
            chain.doFilter(request, response);
        }
    }

    public void destroy() {
        // Cleanup if needed
    }

}
