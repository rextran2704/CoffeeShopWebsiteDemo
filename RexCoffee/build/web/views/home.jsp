<%-- 
    Document   : home
    Created on : Nov 1, 2020, 9:02:42 PM
    Author     : Rex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Rex Coffee</title>
        <jsp:include page="_css.jsp"/>
        <link href="https://fonts.googleapis.com/css2?family=Allura&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="container-fluid wrapper">
            <!-- HEADER CONTENT -->
            <jsp:include page="_header.jsp"/>

            <div id="image-slide" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ul class="carousel-indicators">
                    <li data-target="#image-slide" data-slide-to="0" class="active"></li>
                    <li data-target="#image-slide" data-slide-to="1"></li>
                    <li data-target="#image-slide" data-slide-to="2"></li>
                </ul>

                <!-- The slideshow -->
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="images/coffee-restaurant.jpg" alt="Coffee Restaurant" width="1100" height="500">
                    </div>
                    <div class="carousel-item">
                        <img src="images/coffee-preparation.jpg" alt="Coffee Preparation" width="1100" height="500">
                    </div>
                    <div class="carousel-item">
                        <img src="images/coffee-lobby.jpg" alt="Coffee Lobby" width="1100" height="500">
                    </div>
                </div>
                <!-- Left and right controls -->
                <a class="carousel-control-prev" href="#image-slide" data-slide="prev">
                    <span class="carousel-control-prev-icon"></span>
                </a>
                <a class="carousel-control-next" href="#image-slide" data-slide="next">
                    <span class="carousel-control-next-icon"></span>
                </a>
            </div>  
            <div class="container content">
                <div class="container">
                    <div class="row">
                        <div id="left" class="col-lg-9">
                            <h1 class="page-title"><s:property value="info.name"/></h1>
                            <div class="row">
                                <div class="col-md-5 image-info">
                                    <img src="<s:property value="info.image"/>" alt="Image info" width="95%" height="300" style="margin-left: 10px;"/>
                                </div>
                                <div class="col-md-7 description-info">
                                    <s:property value="info.description"/>
                                </div>
                            </div>
                            <div>
                                <h3>Vist my coffee shop</h3>
                                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p>
                                <p>131 Lương Nhữ Hộc, Đà Nẵng<br>Tel: 0978126534</p>
                            </div>
                            <div class="signature-text-noimg">
                                <h3>Kind regards</h3>
                                <div class="signature-sign" style="font-family: 'Allura', cursive;">
                                    Rex Tr
                                </div>
                            </div>
                        </div>
                        <!-- Sidebar-->
                        <div id="right" class="col-lg-3">
                            <jsp:include page="_sidebar.jsp"/>
                        </div>
                        <!-- Sidebar-->
                    </div>
                </div>
                <jsp:include page="_hitcounter.jsp"/>
            </div>
        </div>
        <!-- Footer -->
        <jsp:include page="_footer.jsp"/>
        <!-- Footer -->
    </div>
</body>
</html>
