<%-- 
    Document   : menu
    Created on : Nov 8, 2020, 12:04:44 PM
    Author     : Rex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Menu</title>
        <jsp:include page="_css.jsp"/>
        <link rel="stylesheet" type="text/css" href="css/menu.css">
    </head>
    <body>
        <div class="container-fluid wrapper">
            <!-- HEADER CONTENT -->
            <jsp:include page="_header.jsp"/>

            <div class="container">
                <div class="row">
                    <div id="left" class="col-sm-9">
                        <h1 class="product-type">Drinks</h1>
                        <s:iterator value="drinkList" var="drink" status="st">
                            <s:if test="#st.odd == true">
                                <div class="row">
                                </s:if>
                                <div class="col-md-6">
                                    <img src="<s:property value="#drink.image"/>" alt="<s:property value="#drink.name"/>" class="image-product">
                                    <h3><s:property value="#drink.name"/></h3>
                                    <div class="product-description"><s:property value="#drink.description"/></div>
                                </div>
                                <s:if test="#st.even == true">
                                </div>
                            </s:if>
                            <s:if test="%{#st.last == true && #st.odd ==true}">
                            </div>
                        </s:if>
                    </s:iterator>
                    <hr>

                    <h1 class="product-type">Foods</h1>
                    <s:iterator value="foodList" var="food" status="st">
                        <s:if test="#st.odd == true">
                            <div class="row">
                            </s:if>
                            <div class="col-md-6">
                                <img src="<s:property value="#food.image"/>" alt="<s:property value="#food.name"/>" class="image-product">
                                <h3><s:property value="#food.name"/></h3>
                                <div class="product-description"><s:property value="#food.description"/></div>
                            </div>
                            <s:if test="#st.even == true">
                            </div>
                        </s:if>
                        <s:if test="%{#st.last == true && #st.odd ==true}">
                        </div>
                    </s:if>
                </s:iterator>
                <hr>

                <h1 class="product-type">Others</h1>
                <s:iterator value="otherProductList" var="other" status="st">
                    <s:if test="#st.odd == true">
                        <div class="row">
                        </s:if>
                        <div class="col-md-6">
                            <img src="<s:property value="#other.image"/>" alt="<s:property value="#other.name"/>" class="image-product">
                            <h3><s:property value="#other.name"/></h3>
                            <div class="product-description"><s:property value="#other.description"/></div>
                        </div>
                        <s:if test="#st.even == true">
                        </div>
                    </s:if>
                    <s:if test="%{#st.last == true && #st.odd ==true}">
                    </div>
                </s:if>
            </s:iterator>
            <hr>
        </div>

        <!-- Sidebar-->
        <div id="right" class="col-sm-3">
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
