<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="myform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

<!-- Blue with white text -->
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
<ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="/">Add Contacts</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="showContacts">Show Contacts</a>
    </li>
  </ul>
  </nav>
 <div class="container-fluid"> 
  <myform:form action="addContact" method="post" modelAttribute="contact">
    <div class="form-group">
    <myform:label path="name">Name:</myform:label>
    <myform:input path="name" class="form-control"/>
    <small><myform:errors path="name" cssClass="text-danger"></myform:errors></small><br>
    <myform:label path="email">Email:</myform:label>
    <myform:input path="email" class="form-control"/>
    <small><myform:errors path="email" cssClass="text-danger"></myform:errors></small><br>
    <myform:label path="number">Number:</myform:label>
    <myform:input path="number" class="form-control"/>
    <small><myform:errors path="number" cssClass="text-danger"></myform:errors></small><br>
    </div>
    <input type="submit" value="Add Contact" class="btn btn-primary">
  </myform:form>
 </div> 
</body>
</html>