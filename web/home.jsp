<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Project and Client Management System</title>
        <link rel="stylesheet" href="./home.css"/>
    </head>
    <body>
        <!-- Header Section -->
        <header>
            <div class="navbar">
                <img src="./assets/images/logo.svg" alt="Logo" class="logo" width="5%"/>
                <nav>
                    <a href="#home" class="links">Home</a>
                    <a href="#about" class="links">About</a>
                    <a href="#projects" class="links">Our Projects</a>
                    <a href="#clients" class="links">Happy Clients</a>
                    <a href="#contact" class="links">Contact</a>
                </nav>

                <button  class="signup-btn">Sign Up</button>
            </div>
        </header>
        <div class="container">
            <div class="text-section">
                Consultation,<br/>
                Design<br/>
                & Marketing
            </div>
            <div class="contact-form" id="contact-form">
                <h1>Get a Free Consultation</h1>
                <form action="AddContact" method="post">
                    <input type="text" name="name" placeholder="Full Name" required>
                    <input type="email" name="email" placeholder="Enter Email Address" required>
                    <input type="tel" name="mobile" placeholder="Mobile Number" required>
                    <input type="text" name="address" placeholder="Area, City" required>
                    <button type="submit" class="btn">Get Quick Quote</button>
                </form>
            </div>
        </div>


        <!-- Background Shapes Section -->
        <div class="background-shapes">
            <img src="./assets/shapes/Ellipse17.svg" class="shape shape1" alt="Background Shape 1">
            <img src="./assets/shapes/Ellipse23.svg" class="shape shape2" alt="Background Shape 2">
            <img src="./assets/shapes/Ellipse27.svg" class="shape shape3" alt="Background Shape 3">
            <img src="./assets/shapes/Ellipse21.svg" class="shape shape4" alt="Background Shape 4">
        </div>

        <!-- Stable Container Section -->
        <div class="stable-container">
            <div class="side-header">
                <h2>Not Your Average Realtor</h2>
                <p>Real estate is my life, but it's not my entire life. I am a real person, just like you. Let's work together to make your real estate dreams a reality.</p>
            </div>
            <div class="image-container">
                <img id="img1" src="./assets/images/Ellipse11.svg" alt="Realtor smiling and holding a key" height="300px" width="150"/>
                <img id="img2" src="./assets/images/Ellipse12.svg" alt="Realtor with a family" height="290px" width="150"/>
                <img id="img3" src="./assets/images/Ellipse13.svg" alt="Realtor with a client" height="290px" width="150"/>
            </div>
        </div>

        <!-- Why Choose Us Section -->
        <div class="why-choose-us" id="why-choose-us">
            <h2>Why Choose Us?</h2>
            <div class="underline"></div>
            <div class="features">
                <div class="feature feature1">
                    <img src="./assets/shapes/Ellipse1.svg" class="background-shape" alt="Feature Background Shape 1">
                    <img src="./assets/icons/home.svg" alt="Home Icon">
                    <h3>Potential ROI</h3>
                    <p>Unlock the door to amazing ROI by working with us. We ensure you get the best value for your property.</p>
                </div>
                <div class="feature feature2">
                    <img src="./assets/shapes/Ellipse1.svg" class="background-shape" alt="Feature Background Shape 2">
                    <img src="./assets/icons/paintbrush-2.svg" alt="Paintbrush Icon">
                    <h3>Design</h3>
                    <p>Our design team ensures your property stands out. We help you make a lasting impression.</p>
                </div>
                <div class="feature feature3">
                    <img src="./assets/shapes/Ellipse1.svg" class="background-shape" alt="Feature Background Shape 3">
                    <img src="./assets/icons/circle-dollar-sign.svg" alt="Dollar Sign Icon">
                    <h3>Marketing</h3>
                    <p>Engaging marketing strategies ensure your property gets the attention it deserves.</p>
                </div>
            </div>
        </div>
        <div class="gallery">
            <img src="./assets/shapes/Rectangle55.svg" class="shape shape1" alt="Gallery Shape 1">
            <img src="./assets/shapes/Rectangle54.svg" class="shape shape2" alt="Gallery Shape 2">
            <img src="./assets/shapes/Rectangle58.svg" class="shape shape3" alt="Gallery Shape 3">
            <img src="./assets/shapes/Ellipse24-1.svg" class="shape shape4" alt="Gallery Shape 4">
            <div class="gallery-item">
                <img src="./assets/shapes/Subtract-5.svg" class="bg-shape" alt="Foreground Shape 1">
                <img id="gallery-img1" alt="Realtor showing a house to a client" height="150" src="./assets/images/pexels-andres-ayrton-6578391.svg" width="200"/>

                <img src="./assets/shapes/Group-1000001645.svg" class="bg-shape" alt="Foreground Shape 2">
            </div>

            <div class="gallery-item">
                <img id="gallery-img3" alt="Realtor with a happy family" height="250" src="./assets/images/pexels-brett-sayles-2881232-1.svg" width="300"/>
                <img src="./assets/shapes/Rectangle58.svg" class="bg-shape" alt="Foreground Shape 5" >
                <!-- <img src="./assests/shapes/Subtract-3.svg" class="foreground-shape" alt="Foreground Shape 6"> -->
            </div>
            <div class="gallery-item">
                <img id="gallery-img2" alt="Realtor discussing with clients" height="200" src="./assets/images/pexels-brett-sayles-2881232-2.svg" width="250"/>
                <img src="./assets/shapes/Ellipse10.svg" class="foreground-shape" alt="Foreground Shape 3">
                <img src="./assets/shapes/Group-1000001645.svg" class="bg-shape" alt="background Shape 4">
            </div>
        </div>
        <img src="./assets/shapes/Group1.svg" class="foreground-shape" alt="Foreground Shape 6">

        <div class="about-us">
            <h2>About Us</h2>
            <div class="underline"></div>
            <p>Fifteen years of experience in real estate, excellent customer service and a commitment to work hard, listen and follow through. We provide quality service to build relationships with clients and more importantly, maintain those relationships by communicating effectively.</p>
        </div>


        <!-- Our Project Section -->
        <section id="projects">
            <h2><b>Our Projects</b></h2>
            <p>We know what buyers are looking for and suggest best projects that will bring clients top dollar for sale of their homes</p>
            <div class="project-container">
                <div class="project">
                    <img
                        src="./assets/images/pexels-andres-ayrton-6578391.svg"
                        alt="Project 1"
                        />
                    <h3>Project Name 1</h3>
                    <p>Brief description of Project 1.</p>
                    <button>Read More</button>
                </div>
                <div class="project">
                    <img
                        src="./assets/images/pexels-brett-sayles-2881232-1.svg"
                        alt="Project 2"
                        />
                    <h3>Project Name 2</h3>
                    <p>Brief description of Project 2.</p>
                    <button>Read More</button>
                </div>
                <div class="project">
                    <img
                        src="./assets/images/pexels-brett-sayles-2881232-2.svg"
                        alt="Project 3"
                        />
                    <h3>Project Name 3</h3>
                    <p>Brief description of Project 3.</p>
                    <button>Read More</button>
                </div>
                <div class="project">
                    <img
                        src="./assets/images/pexels-brett-sayles-2881232-3.svg"
                        alt="Project 4"
                        />
                    <h3>Project Name 4</h3>
                    <p>Brief description of Project 4.</p>
                    <button>Read More</button>
                </div>
                <div class="project">
                    <img
                        src="./assets/images/pexels-fauxels-3182834.svg"
                        alt="Project 5"
                        />
                    <h3>Project Name 5</h3>
                    <p>Brief description of Project 5.</p>
                    <button>Read More</button>
                </div>
            </div>
        </section>

        <!-- Happy Clients Section -->
        <section id="clients">
            <h2>Happy Clients</h2>
            <div class="client-container">
                <div class="client">
                    <img src="./assets/images/Ellipse28.svg" alt="Client 1" />
                    <p>
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum
                        delectus praesentium id vero sit veniam temporibus quaerat,
                    </p>
                    <h3>Client Name 1</h3>
                    <p>CEO, Company 1</p>
                </div>
                <div class="client">
                    <img src="./assets/images/Ellipse29.svg" alt="Client 2" />
                    <p>
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum
                        delectus praesentium id vero sit veniam temporibus quaerat
                    </p>

                    <h3>Client Name 2</h3>
                    <p>Web Developer, Company 2</p>
                </div>
                <div class="client">
                    <img src="./assets/images/Ellipse31.svg" alt="Client 3" />
                    <p>
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum
                        delectus praesentium id vero sit veniam temporibus quaerat,
                    </p>

                    <h3>Client Name 3</h3>
                    <p>Designer, Company 3</p>
                </div>
                <div class="client">
                    <img src="./assets/images/Ellipse33.svg" alt="Client 4" />
                    <p>
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum
                        delectus praesentium id vero sit veniam temporibus quaerat,
                    </p>
                    <h3>Client Name 4</h3>
                    <p>Designer, Company 4</p>
                </div>
                <div class="client">
                    <img src="./assets/images/Ellipse35.svg" alt="Client 5" />
                    <p>
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto earum
                        delectus praesentium id vero sit veniam temporibus quaerat,
                    </p>
                    <h3>Client Name 5</h3>
                    <p>Designer, Company 5</p>
                </div>
            </div>
        </section>

        <!-- Footer Section -->
        <footer>
            <div class="footer-hero">
                <img src="./assets/images/Rectangle.svg" alt="Footer Background Image" class="footer-background"/>
                <div class="overlay-text">
                    <h2>Learn more about our listing process, as well as our additional staging and design work.</h2>
                    <button class="learn-more-btn">Learn More</button>
                </div>
            </div>
            <div class="footer-content">
                <div class="footer-links">
                    <a href="#">Home</a>
                    <a href="#why-choose-us">Services</a>
                    <a href="#projects">Projects</a>
                    <a href="#clients">Testimonials</a>
                    <a href="#contact-form">Contact</a>
                </div>
                <div class="subscribe">
                    <form action="AddSubscription" method="post">
                        <td>
                            <input type="email" name="email" placeholder="Enter Email Address" required />
                            <button type="submit" style="font-size: medium;">Subscribe</button>
                        </td>
                </div>
            </div>
            <div class="footer-bottom">
                <p>© All Rights Reserved 2023</p>
                <div class="footer-brand">
                    <img src="./assets/images/logo.svg" alt="RealTrust Logo" class="brand-logo"/>
                </div>
                <div class="social-icons">
                    <a href="#"><img src="./assets/icons/Group-1.svg" alt="Facebook Icon"/></a>
                    <a href="#"><img src="./assets/icons/Group.svg" alt="Twitter Icon"/></a>
                    <a href="#"><img src="./assets/icons/Frame.svg" alt="Instagram Icon"/></a>
                    <a href="#"><img src="./assets/icons/Linkedin.svg" alt="LinkedIn Icon"/></a>
                </div>
            </div>
        </footer>
    </body>
</html>
