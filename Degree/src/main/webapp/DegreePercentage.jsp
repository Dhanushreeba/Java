<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script>

let fieldsChecks = {
	    "name" : false,
	    "email" : false,
	    "college" : false,
	    "degree" :false,
	    "branch" : false,
	    "percentage" :false,
	    "cmf":false,
	    
	}
	
	
	
function validateAndEnableSubmit()
{
let flag=false;

for(let[key,value] of Object.entries(fieldsChecks)) 
	{
	if(value === false){
        flag = true;
        break;
    }
	}

if(!flag){
    document.getElementById("submit").removeAttribute("disabled");
}else{
    document.getElementById("submit").setAttribute("disabled","");
}
}

function nameValidation() 
{

	let element = document.getElementById("name");
    let error = document.getElementById("errorname");

    if(element.value.trim().length >= 3){
        error.innerHTML = "";
        fieldsChecks["name"] = true;
    }else{
        error.innerHTML = "Invalid  name.  name should be greterthan 3 letters";
        error.style.color="red"
        fieldsChecks["name"] = false;

    }
    validateAndEnableSubmit();
}

function emailValidation()

{

	let element = document.getElementById("email");
    let error = document.getElementById("erroremail");

    if(element.value.trim().length >= 2)
    {
        error.innerHTML = "";
        fieldsChecks["email"] = true;
    }else
    {
        error.innerHTML = "Invalid email. emailshould be greterthan 2 letters";
        error.style.color="red"
        fieldsChecks["email"] = false;

    }
    validateAndEnableSubmit();
	}

function collegeValidation()
{
	 let element = document.getElementById("college");
	    let error = document.getElementById("collegeError");

	    if(element.value.length != '0')
	    {
	        error.innerHTML = "";
	        fieldsChecks["college"] = true;
	    }else
	    {
	        error.innerHTML = "Please select college";
	        error.style.color="red"
	        fieldsChecks["college"] = false;

	    }
	    validateAndEnableSubmit();
}

	function  degreeValidation()
{
		let element = document.getElementById("degree");
	    let error = document.getElementById("degreeError");

	    if(element.value.length != "0")
	    {
	        error.innerHTML = "";
	        fieldsChecks["degree"] = true;
	    }else
	    {
	        error.innerHTML = "Please select degree";
	        error.style.color="red"
	        fieldsChecks["degree"] = false;

	    }
	    validateAndEnableSubmit();
	}

	 function branchValidation()
	 {
		 let element = document.getElementById("branch");
		    let error = document.getElementById("branchError");

		    if(element.value.length != '0')
		    {
		        error.innerHTML = "";
		        fieldsChecks["branch"] = true;
		    }else
		    {
		        error.innerHTML = "Please select branch";
		        error.style.color="red"
		        fieldsChecks["branch"] = false;

		    }
		    validateAndEnableSubmit();
	}
	
	 function percentageValidation() 
	 {

	 	let element = document.getElementById("percentage");
	     let error = document.getElementById("percentageError");

	     if(element.value.trim().length >=2){
	         error.innerHTML = "";
	         fieldsChecks["percentage"] = true;
	     }else{
	         error.innerHTML = "Invalid  percentage.  percentage should be greterthan or equals to 2 letters";
	         error.style.color="red"
	         fieldsChecks["percentage"] = false;

	     }
	     validateAndEnableSubmit();
	 }
			  
	
	  function confirmValidation()
	{
		 let element = document.getElementById("cmf");
		    let error = document.getElementById("errorconfirmed");

		    if(element.checked)
		    {
		        error.innerHTML = "";
		        fieldsChecks["cmf"] = true;
		    }else
		    {
		        error.innerHTML = "Please confirm";
		        error.style.color="red"
		        fieldsChecks["cmf"] = false;

		    }
		    
		    validateAndEnableSubmit();
		    genderValidation()
		    
         } 
     	

</script>
</head>
<body>

<h1>can i get your degree list</h1>

<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
  <div class="container-fluid">

<a class="navbar-brand" href="index.html"><button type="button" class="btn btn-light">Home</button></a>
<a class="navbar-brand" href="index.html"><button type="button" class="btn btn-light">Back</button></a>


</div>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
    <div class="collapse navbar-collapse" id="navbarNav">
    </div>
</nav>

<div class="container">

<h2 class="text-md-center w-50;">Degree Form</h2>


<form  class=" container  mt-xxl-5  h-50 w-50" action="result" method="post">

 <div class=" mb-3 ">
            <label for="name" class="form-label  ">Student Name </label>
            <input type="text" class="form-control" id="name" onblur="nameValidation()" name="name1">
            <span id="errorname"></span>
        </div> 
               
         <div class="mb-3">
       <label for="email" class="form-label">Email id of The Student</label>
       <input type="text" class="form-control  " id="email" onblur="emailValidation()" name="email1">
            <span id="erroremail"></span>
        </div>  
        
        <div  class="mb-3">
<label for="college" class="form-label">College</label>
       <select class="form-select custom-select-width" id="college" onblur="collegeValidation()" name="college1" aria-label="Select Color">
  <option selected value="">---select College---</option>
   <option value="GMIT ">GMIT </option>
  <option value="JVIT  ">JVIT </option>
  <option value="PES">PES</option>
  <option value="SJBIT">SJBIT</option>
  
 </select>
 <span id="collegeError"></span><br>
 </div>
 
  <div  class="mb-3">
<label for="degree" class="form-label">Degree</label>
       <select class="form-select custom-select-width" id="degree" onblur="degreeValidation()" name="degree1" aria-label="Select Color">
  <option selected value="">---select Degree---</option>
   <option value="BE ">BE </option>
  <option value="BTECH">BTECH</option>
  <option value="BSC">BSC</option>
  <option value="MS">MS</option>
  <option value="MTECH">MTECH</option>
 </select>
 <span id="degreeError"></span><br>
 </div>
 
 <div class="mb-3">
       <label for="branch" class="form-label">Branch</label>
         <select class="form-select custom-select-width" id="branch" onblur="branchValidation()" name="branch1" aria-label="Select Color">
                <option selected value="">---Select your Branch ---</option>
                <option value="Computer Science Engineering">Computer Science Engineering</option>
                <option value="Civil Engineering">Civil Engineering</option>
                <option value="Electronic Communication Engineering">Electronic Communication Engineering</option>
                <option value="Information Science">Information Science</option>
                <option value="Mechanical Engineering">Mechanical Engineering</option>
            </select>
            <span id="branchError"></span>
        </div>
        
        <div class=" mb-3 ">
        <label for="percentage" class="form-label  ">Student Percentage </label>
            <input type="text" class="form-control" id="percentage" onblur="percentageValidation()" name="percentage1">
            <span id="percentageError"></span>
        </div> 
        
        <div>
             <label for="Select Checkbox">
            <input type="checkbox" id="cmf" onchange="confirmValidation()"/> Confirm
            <span id="errorconfirmed"></span>
            </label>
         </div> 
        
        <div class ="mb-3 form-label">
   <input type="submit" id="submit" disabled>
  <!-- <button type="submit" class="btn btn-primary" id="submitButton" disabled >Submit</button> -->
  </div>    
       
</div>

</form>
</body>
</html>