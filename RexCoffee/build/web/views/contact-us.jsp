<%-- 
    Document   : contact-us
    Created on : Nov 9, 2020, 1:39:28 AM
    Author     : Rex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Contact Us</title>
        <jsp:include page="_css.jsp"/>
        <link rel="stylesheet" type="text/css" href="css/contact-us.css">
        <s:head/>
    </head>
    <body>
        <div class="container-fluid wrapper">
            <!-- Header -->
            <jsp:include page="_header.jsp"/>
            <!-- Header -->
            <div class="container content">
                <div class="row">
                    <div id="left" class="col-lg-9">
                        <h1 class="page-title">Contact Us</h1>
                        <div class="form-contact-us">
                            <p>Write your message here. Fill out the form:</p>
                            <s:form action="send-message" method="POST">
                                <s:textfield cssClass="input-info" label="Name" name="name" value="" placeholder="Your name"/>
                                <s:textfield cssClass="input-info" label="Email" name="email" value="" placeholder="abc@gmail.com"/>
                                <s:textarea cssClass="input-info" label="Message" name="message" value="" placeholder="Write your message here"/>
                                <s:submit value="Send"/>
                            </s:form>
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
