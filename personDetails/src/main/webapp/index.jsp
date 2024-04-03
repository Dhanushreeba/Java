<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
  <div class="container-fluid">


<a class="navbar-brand" href="ContactDetails.jsp"><button type="button" class="btn btn-light">home</button></a>

</div>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
    <div class="collapse navbar-collapse" id="navbarNav">
    </div>
</nav>


<h2 class="text-md-center w-50;">Person</h2>


<form  class=" container  mt-xxl-5  h-50 w-50" action="click" method="post">

 <div class=" mb-3 ">
            <label for="fName" class="form-label  ">First Name </label>
            <input type="text" class="form-control" id="fName"  name="fName1">
    
        </div>
        
        <div class=" mb-3 ">
            <label for="lName" class="form-label  ">Last Name </label>
            <input type="text" class="form-control" id="lName"  name="lName1">
            
        </div> 
        
  
  <input type="submit" value="send"/>
  
  </form>

</body>
</html>