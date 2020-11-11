<%-- 
    Document   : find-us
    Created on : Nov 8, 2020, 7:01:32 PM
    Author     : Rex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Find Us</title>
        <jsp:include page="_css.jsp"/>
        <link rel="stylesheet" type="text/css" href="css/find-us.css">
    </head>
    <body>
        <div class="container-fluid wrapper">
            <!-- Header -->
            <jsp:include page="_header.jsp"/>
            <!-- Header -->
            <div class="container content">
                <div class="row">
                    <div id="left" class="col-lg-9">
                        <h1 class="page-title">Find Rex Coffee</h1>
                        <div class="row">
                            <div class="col-md-5">
                                <h3>Address and contact:</h3>
                                <p class="contact-info"><s:property value="contact.address"/><p>
                                <p class="contact-info"><span class="font-weight-bold">Tel: </span><s:property value="contact.phoneNumber"/></p>
                                <p class="contact-info"><span class="font-weight-bold">Email: </span><s:property value="contact.email"/></p>
                            </div>
                            <div class="col-md-6 offset-md-1">
                                <h3>Opening hours:</h3>
                                <p class="contact-info"><s:property value="contact.openingHours"/></p>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-md-12">
                                <h3>Map:</h3>
                                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d15338.905063452894!2d108.20609081437325!3d16.027758954352972!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31421993058c6045%3A0x4dbbb9ccec61fee3!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBOZ2_huqFpIG5n4buvIC0gxJDhuqFpIGjhu41jIMSQw6AgTuG6tW5n!5e0!3m2!1sen!2s!4v1604844566070!5m2!1sen!2s" width="100%" height="500px" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
                            </div>
                        </div>
                    </div>
                    <!-- Sidebar-->
                    <div id="right" class="col-lg-3">
                        <jsp:include page="_sidebar.jsp"/>
                    </div>
                    <!-- Sidebar-->
                </div>
                <jsp:include page="_hitcounter.jsp"/>
            </div>
            <!-- Footer -->
            <jsp:include page="_footer.jsp"/>
            <!-- Footer -->
        </div>
    </body>
</html>
