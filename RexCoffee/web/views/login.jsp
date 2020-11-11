<%-- 
    Document   : login
    Created on : Nov 4, 2020, 10:35:30 AM
    Author     : Rex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="css/login.css">
        <script src="js/main.js"></script>
    </head>
    <body>
        <div class="container-fluid wrapper">
            <div class="container">
                <div class="card signin-panel">
                    <div class="card-header">
                        <h3>Sign In</h3>
                        <p style="color: white;margin-bottom: 0;">admin/admin123</p>
                    </div>
                    <div class="card-body">
                        <form action="login" method="POST">
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>
                                <input type="text" class="form-control" name="username" placeholder="username" required="true">
                            </div>
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-key"></i></span>
                                </div>
                                <input type="password" class="form-control" name="password" placeholder="password" required="true">
                            </div>
                            <div class="form-group">
                                <input type="submit" value="Login" class="btn-login float-right">
                            </div>
                        </form>
                    </div>
                    <div class="card-footer">
                        <div class="d-flex justify-content-center">
                            <a href="" onclick="alertComingSoon()">Forgot your password?</a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Footer -->
            <jsp:include page="_footer.jsp"/>
            <!-- Footer -->
        </div>
    </body>
</html>
