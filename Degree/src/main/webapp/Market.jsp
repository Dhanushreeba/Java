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
	    "location" : false,
	    "city" : false,
	    "pincode" :false,
	    "area" : false,
	    "type" :false,
	    "stallNo":false,
	    "itemName":false,
	    "itemQuality":false,
	    "itemQuantity":false,
	    "itemCost":false,	    
	    "stallOwner":false,
	    "stallKebNo":false,
	    "gstNo":false,
	    "transaction":false,
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

    if(element.value.length >=5 && element.value.length <=20){
        error.innerHTML = "";
        fieldsChecks["name"] = true;
    }else{
        error.innerHTML = "Please  Enter  name.  name should be greterthan 5 letters";
        error.style.color="red"
        fieldsChecks["name"] = false;

    }
    validateAndEnableSubmit();
}


function locationValidation()
{
	 let element = document.getElementById("location");
	    let error = document.getElementById("locationError");

	    if(element.value.length != '0')
	    {
	        error.innerHTML = "";
	        fieldsChecks["location"] = true;
	    }else
	    {
	        error.innerHTML = "Please select Location";
	        error.style.color="red"
	        fieldsChecks["location"] = false;

	    }
	    validateAndEnableSubmit();
}

	function  cityValidation()
{
		let element = document.getElementById("city");
	    let error = document.getElementById("cityError");

	    if(element.value.length != "0")
	    {
	        error.innerHTML = "";
	        fieldsChecks["city"] = true;
	    }else
	    {
	        error.innerHTML = "Please select city";
	        error.style.color="red"
	        fieldsChecks["city"] = false;

	    }
	    validateAndEnableSubmit();
	}
	
	function pincodeValidation()

	{

		let element = document.getElementById("pincode");
	    let error = document.getElementById("pincodeError");

	    if(element.value.length !=0 && element.value.length >=1 && element.value.length <=1000)
	    {
	        error.innerHTML = "";
	        fieldsChecks["pincode"] = true;
	    }
	    else
	    {
	        error.innerHTML = "Please  Enter pincode. pincode should be greterthan 1 and lessthan 1000";
	        error.style.color="red"
	        fieldsChecks["pincode"] = false;

	    }
	    validateAndEnableSubmit();
		}

	
	 function areaValidation() 
	 {

	 	let element = document.getElementById("area");
	     let error = document.getElementById("areaError");

	     if(element.value.length >=5 && element.value.length <=20){
	         error.innerHTML = "";
	         fieldsChecks["area"] = true;
	     }else{
	         error.innerHTML = "Please  Enter  area.  area should be greterthan 5 and lessthan 20 letters";
	         error.style.color="red"
	         fieldsChecks["area"] = false;

	     }
	     validateAndEnableSubmit();
	 }
			  
	
	 function typeValidation()
	 {
		 let element = document.getElementById("type");
	    let error = document.getElementById("typeError");

	    if(element.value.length != "0")
	    {
	        error.innerHTML = "";
	        fieldsChecks["type"] = true;
	    }else
	    {
	        error.innerHTML = "Please select type";
	        error.style.color="red"
	        fieldsChecks["type"] = false;


		    }
		    validateAndEnableSubmit();
	}
	 
	 function stallNoValidation() 
	 {

	 	let element = document.getElementById("stallNo");
	     let error = document.getElementById("stallNoError");

	     if(element.value.length >=1 && element.value.length <=1000){
	         error.innerHTML = "";
	         fieldsChecks["stallNo"] = true;
	     }else{
	         error.innerHTML = "Please  Enter  stallNo.  stallNo should be greterthan 1 and lessthan 1000 letters";
	         error.style.color="red"
	         fieldsChecks["stallNo"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function itemNameValidation() 
	 {

	 	let element = document.getElementById("itemName");
	     let error = document.getElementById("itemNameError");

	     if(element.value.length >=5 && element.value.length <=20){
	         error.innerHTML = "";
	         fieldsChecks["itemName"] = true;
	     }else{
	         error.innerHTML = "Please  Enter  itemName.  itemName should be greterthan 5 and lessthan 20 letters";
	         error.style.color="red"
	         fieldsChecks["itemName"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function itemQualityValidation() 
	 {

	 	let element = document.getElementById("itemQuality");
	     let error = document.getElementById("itemQualityError");

	     if(element.value.length >=5 && element.value.length <=20){
	         error.innerHTML = "";
	         fieldsChecks["itemQuality"] = true;
	     }else{
	         error.innerHTML = "Please  Enter  itemQuality.  itemQuality should be greterthan 5 and lessthan 20 letters";
	         error.style.color="red"
	         fieldsChecks["itemQuality"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function itemQuantityValidation() 
	 {

	 	let element = document.getElementById("itemQuantity");
	     let error = document.getElementById("itemQuantityError");

	     if(element.value.length >=1 && element.value.length <=1000){
	         error.innerHTML = "";
	         fieldsChecks["itemQuantity"] = true;
	     }else{
	         error.innerHTML = "Please  Enter item Quantity.  item Quantity should be greterthan 1 and lessthan 1000 letters";
	         error.style.color="red"
	         fieldsChecks["itemQuantity"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function itemCostValidation() 
	 {

	 	let element = document.getElementById("itemCost");
	     let error = document.getElementById("itemCostError");

	     if(element.value.length >=1 && element.value.length <=1000){
	         error.innerHTML = "";
	         fieldsChecks["itemCost"] = true;
	     }else{
	         error.innerHTML = "Please  Enter item Cost.  item Cost should be greterthan 1 and lessthan 1000 letters";
	         error.style.color="red"
	         fieldsChecks["itemCost"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function stallOwnerValidation() 
	 {

	 	let element = document.getElementById("stallOwner");
	     let error = document.getElementById("stallOwnerError");

	     if(element.value.length >=5 && element.value.length <=20){
	         error.innerHTML = "";
	         fieldsChecks["stallOwner"] = true;
	     }else{
	         error.innerHTML = "Please  Enter  stall Owner.  stall Owner should be greterthan 5 and lessthan 20 letters";
	         error.style.color="red"
	         fieldsChecks["stallOwner"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function stallKebNoValidation() 
	 {

	 	let element = document.getElementById("stallKebNo");
	     let error = document.getElementById("stallKebNoError");

	     if(element.value.length >=1 && element.value.length <=1000){
	         error.innerHTML = "";
	         fieldsChecks["stallKebNo"] = true;
	     }else{
	         error.innerHTML = "Please  Enter  stallKebNo. stall Keb No should be greterthan 1 and lessthan 1000 letters";
	         error.style.color="red"
	         fieldsChecks["stallKebNo"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function gstNoValidation() 
	 {

	 	let element = document.getElementById("gstNo");
	     let error = document.getElementById("gstNoError");

	     if(element.value.length >=1 && element.value.length <=1000){
	         error.innerHTML = "";
	         fieldsChecks["gstNo"] = true;
	     }else{
	         error.innerHTML = "Please  Enter gst No. gstNo should be greterthan 1 and lessthan 1000 letters";
	         error.style.color="red"
	         fieldsChecks["gstNo"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function transactionValidation() 
	 {

	 	let element = document.getElementById("transaction");
	     let error = document.getElementById("transactionError");

	     if(element.value.length >=1 && element.value.length <=1000){
	         error.innerHTML = "";
	         fieldsChecks["transaction"] = true;
	     }else{
	         error.innerHTML = "Please  Enter transaction. transaction should be greterthan 1 and lessthan 1000 letters";
	         error.style.color="red"
	         fieldsChecks["transaction"] = false;

	     }
	     validateAndEnableSubmit();
	 }
     	

</script>
</head>
<body>


    <nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
  <div class="container-fluid">

<a class="navbar-brand" href="index.jsp"><button type="button" class="btn btn-light">Home</button></a>
<a class="navbar-brand" href="index.jsp"><button type="button" class="btn btn-light">Back</button></a>

</div>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
    <div class="collapse navbar-collapse" id="navbarNav">
    </div>
</nav>

<div class="container">

<h2 class="text-md-center w-50;">Market Details</h2>


<form  class=" container  mt-xxl-5  h-50 w-50" action="market" method="post">

 <div class=" mb-3 ">
            <label for="name" class="form-label  ">Market Name </label>
            <input type="text" class="form-control" id="name" onblur="nameValidation()" name="name1">
            <span id="errorname"></span>
        </div> 
               
        
        <div  class="mb-3">
<label for="location" class="form-label">Location</label>
       <select class="form-select custom-select-width" id="location" onblur="locationValidation()" name="location1" aria-label="Select Color">
  <option selected value="">---select Location---</option>
   <option value="Bangalore ">Bangalore </option>
   <option value="Bidadi">Bidadi</option>
   <option value="Mandya">Mandya</option>
  <option value="Mysore ">Mysore </option>
   
 </select>
 <span id="locationError"></span><br>
 </div>
 
  <div  class="mb-3">
<label for="city" class="form-label">City</label>
       <select class="form-select custom-select-width" id="city" onblur="cityValidation()" name="city1" aria-label="Select Color">
  <option selected value="">---select City---</option>
   <option value="Bangalore Rural">Bangalore Rural</option>
  <option value="Bangalore Urban">Bangalore Urban</option>
  <option value="Chennai">Chennai</option>
  <option value="Hydrabad">Hydrabad</option>
  <option value="Mumbai">Mumbai</option>
  
 </select>
 <span id="cityError"></span><br>
 </div>
 
 <div class="mb-3">
       <label for="pincode" class="form-label">Pincode</label>
       <input type="number" class="form-control  " id="pincode" onblur="pincodeValidation()" name="pincode1">
            <span id="pincodeError"></span>
        </div> 
         
         <div class="mb-3">
       <label for="area" class="form-label">Area</label>
       <input type="text" class="form-control  " id="area" onblur="areaValidation()" name="area1">
            <span id="areaError"></span>
        </div>  
 
 <div class="mb-3">
       <label for="type" class="form-label">Type</label>
         <select class="form-select custom-select-width" id="type" onblur="typeValidation()" name="type1" aria-label="Select Color">
                <option selected value="">---Select Type ---</option>
                <option value="Cloths">Cloths</option>
                <option value="Fruits">Fruits </option>
                <option value="Grains">Grains</option>
                <option value="Slipper">Slipper</option>
                <option value="Vegitable">Vegitable</option>
 
            </select>
            <span id="typeError"></span>
        </div>
        
        <div class=" mb-3 ">
        <label for="stallNo" class="form-label  ">Stall No</label>
            <input type="number" class="form-control" id="stallNo" onblur="stallNoValidation()" name="stallNo1">
            <span id="stallNoError"></span>
        </div> 
        
        <div class=" mb-3 ">
        <label for="itemName" class="form-label  ">Item Name</label>
            <input type="text" class="form-control" id="itemName" onblur="itemNameValidation()" name="itemName1">
            <span id="itemNameError"></span>
        </div> 
        
        <div class=" mb-3 ">
        <label for="itemQuality" class="form-label  ">Item Quality</label>
            <input type="text" class="form-control" id="itemQuality" onblur="itemQualityValidation()" name="itemQuality1">
            <span id="itemQualityError"></span>
        </div> 
        
        <div class=" mb-3 ">
        <label for="itemQuantity" class="form-label  ">Item Quantity</label>
            <input type="number" class="form-control" id="itemQuantity" onblur="itemQuantityValidation()" name="itemQuantity1">
            <span id="itemQuantityError"></span>
        </div> 
        
        <div class=" mb-3 ">
        <label for="itemCost" class="form-label  ">Item cost</label>
            <input type="number" class="form-control" id="itemCost" onblur="itemCostValidation()" name="itemCost1">
            <span id="itemCostError"></span>
        </div> 
        
        <div class=" mb-3 ">
        <label for="stallOwner" class="form-label  ">Stall Owner</label>
            <input type="text" class="form-control" id="stallOwner" onblur="stallOwnerValidation()" name="stallOwner1">
            <span id="stallOwnerError"></span>
        </div> 
        
        <div class=" mb-3 ">
        <label for="stallKebNo" class="form-label  ">Stall KEB No</label>
            <input type="number" class="form-control" id="stallKebNo" onblur="stallKebNoValidation()" name="stallKebNo1">
            <span id="stallKebNoError"></span>
        </div>
        
        <div class=" mb-3 ">
        <label for="gstNo" class="form-label  ">Stall Owner GST No</label>
            <input type="number" class="form-control" id="gstNo" onblur="gstNoValidation()" name="gstNo1">
            <span id="gstNoError"></span>
        </div>
        
        <div class=" mb-3 ">
        <label for="transaction" class="form-label  ">Weekly Transaction</label>
            <input type="number" class="form-control" id="transaction" onblur="transactionValidation()" name="transaction1">
            <span id="transactionError"></span>
        </div>
        
        
       <div class ="mb-3 form-label">
   <input type="submit" id="submit" disabled>
  </div>    
       
</div>

</form>

</body>
</html>