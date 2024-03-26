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

<a class="navbar-brand" href="index.jsp"><button type="button" class="btn btn-light">Home</button></a>
<a class="navbar-brand" href="DegreePercentage.jsp"><button type="button" class="btn btn-light">Back</button></a>

</div>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
    <div class="collapse navbar-collapse" id="navbarNav">
    </div>
</nav>
    
 
<h1>Student details are saved..</h1>
<h2>Percentage of Student is:<span style="color:red">${jj}</span></h1></h2>
<h5>Name:  <span style="color:red">${aj}</span></h5>
<h5>Email:  <span style="color:red">${ba}</span></h5>
<h5>College:  <span style="color:red">${sk}</span></h5>
<h5>Degree:  <span style="color:red">${vg}</span></h5>
<h5>Branch:  <span style="color:red">${bp}</span></h5>
<h5>Percentage:  <span style="color:red">${vm}</span></h5>
</body>
</html>