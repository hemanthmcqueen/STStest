<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="myform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <li class="nav-item">
      <a class="nav-link" href="/">Add Contacts</a>
    </li>
    <li class="nav-item active">
      <a class="nav-link" href="showContacts">Show Contacts</a>
    </li>
  </ul>
  </nav>
  <h2>My Contacts</h2>
  <hr/>
 <div class="container">          
  <table class="table table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Number</th>
        <th>Options</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${contacts}" var="contact">
      <tr>
        <td>${contact.id}</td>
        <td>${contact.name}</td>
        <td>${contact.email}</td>
        <td>${contact.number}</td>
        <%-- <td><a href="editContact/${contact.id}"><button class="btn btn-info">Edit</button></a></td> --%>
        <td><a href="deleteContact/${contact.id}"><button class="btn btn-danger">Delete</button></a></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
 	
</body>
</html>