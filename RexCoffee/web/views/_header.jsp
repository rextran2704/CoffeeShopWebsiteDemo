<%-- 
    Document   : _header
    Created on : Nov 1, 2020, 9:10:20 PM
    Author     : Rex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<div class="site-header sticky-top">
    <nav class="navbar navbar-expand-md bg-dark navbar-dark">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="menu">Menu</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="find-us">Find us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="contact-us">Contact us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="" onclick="alertComingSoon()">Order now</a>
                </li>
            </ul>

            <a class="navbar-brand logo-image" href="home">
                <img src="images/coffee-logo.png" alt="logo" style="width:65px;">
            </a>

            <s:if test="#session.username != null">
                <div class="dropdown user-dropdown">
                    <button type="button" class="btn btn-primary dropdown-toggle user-btn-dropdown" data-toggle="dropdown">
                        Hello, <s:property value="#session.username"/>
                    </button>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="new-product">Add product</a>
                        <a class="dropdown-item" href="logout">Log out</a>
                    </div>
                </div>
            </s:if>
            <s:else>
                <a class="nav-item nav-link signin-link" href="login-form">Sign in</a>
            </s:else>

        </div>
    </nav>
    <script>
        $('#collapsibleNavbar a').click(function (e) {
            $('#collapsibleNavbar a').removeClass('active');
            $(this).addClass('active');
        });
    </script>
</div>


