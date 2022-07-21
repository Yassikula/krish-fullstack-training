<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>

  <div class="container" style="    width: 30%;padding: 36px;background: #a6c4c5;">
   <h1>Employee Register Form</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">

  <div class="form-group">
    <label >First Name</label>
   <input class="form-control" type="text" name="firstName" >
  </div>
  <div class="form-group">
    <label >Last Name</label>
   <input class="form-control" type="text" name="lastName"  >
  </div>
  <div class="form-group">
    <label >UserName</label>
   <input class="form-control" type="text" name="username">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Password</label>
   <input class="form-control" type="text" name="password">
  </div>
  <div class="form-group">
    <label >Address</label>
   <input class="form-control" type="text" name="address" >
  </div>
    <div class="form-group">
    <label >Contact No</label>
   <input class="form-control" type="text" name="contact" >
  </div>
  
  <button type="submit" class="btn btn-secondary btn-lg btn-block">Submit</button>
</form>
  </div>
 
 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>