<%-- 
    Document   : AdminNavbar
    Created on : Dec 19, 2024, 12:40:33 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <style>
            /* Navigation Bar */
            .navbar {
                display: flex;
                justify-content: space-between;
                align-items: center;
                background-color: navy;
                padding: 15px 20px;
                color: #fff;
                box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            }

            .navbar .logo {
                font-size: 1.5rem;
                font-weight: bold;
            }

            .navbar ul {
                list-style: none;
                display: flex;
                margin: 0;
                padding: 0;
            }

            .navbar ul li {
                margin-left: 20px;
            }

            .navbar ul li a {
                color: #fff;
                text-decoration: none;
                font-size: 1rem;
                transition: color 0.3s;
            }

            .navbar ul li a:hover {
                color: #ffcc00;
            }
        </style>
    </head>
    <body>
        <nav class="navbar">
            <div class="logo"><img src="./assets/images/logo2.svg" alt="logo" width="60%"/>
            </div>
            <ul>
                <li><a href="admin.jsp">Home</a></li>
                <li><a href="#">Account</a></li>
                <li><a href="LogOut.jsp">Log Out</a></li>
            </ul>
        </nav>    
    </body>

</html>
