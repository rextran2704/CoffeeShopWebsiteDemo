<%-- 
    Document   : new-product
    Created on : Nov 8, 2020, 9:37:31 PM
    Author     : Rex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>New Product</title>
        <jsp:include page="_css.jsp"/>
        <link rel="stylesheet" type="text/css" href="css/new-product.css">
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
                        <h1 class="page-title">Create New Product</h1>
                        <div class="form-new-product">
                            <s:form action="create-product" method="POST">
                                <s:textfield cssClass="input-info" label="Name" name="name" value="Madeleine"/>
                                <s:textarea cssClass="input-info" label="Description" name="description" value="Madeleine là tên 1 loại bánh có nguồn gốc từ Pháp, thuộc thể loại bánh gato cơ bản (sponge cake), được đặc trưng bởi hình dáng vỏ sò nhỏ nhắn xinh xắn. Bánh mì rất mềm, rất nhẹ kiểu Sponge, nhưng cũng rất ẩm. Khi cắn vào thì cảm nhận được rất rõ vị bơ ngậy tan trên đầu lưỡi. Bánh mì hình sò có nhiều vị khác nhau. Thưởng thức một chiếc bánh mì sò với 1 tách trà thật là “lãng mạn” biết bao." rows="5"/>
                                <s:textfield cssClass="input-info" label="Image Link" name="imageLink" value="https://i.ytimg.com/vi/RZOnIDzyWQo/maxresdefault.jpg"/>
                                <s:select cssClass="input-info" label="Product Type" name="type" list="productTypeList" />
                                <s:submit value="Create"/>
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
