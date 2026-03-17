<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
    <h1>Login</h1>
    <p style="color:red;">${message}</p>

    <g:form controller="login" action="login">
        <label>Username:</label>
        <g:textField name="username" /><br/><br/>
        <label>Password:</label>
        <g:passwordField name="password" /><br/><br/>
        <g:submitButton name="submit" value="Login"/>
    </g:form>
</body>
</html>