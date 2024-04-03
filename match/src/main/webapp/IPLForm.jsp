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
	    "stats" : false,
	    "city" : false,
	    "teams" :false,
	    "match":false,
	    "wins" : false,
	    "loss" :false,
	    "players":false,
	    "captains":false,
	    "pts":false,
	    "overs":false,
	    "playersInTeam":false,	    
	    "bowlers":false,
	    "batsman":false,
	    "owner":false,
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

    if(element.value.length >=1 && element.value.length <=90){
        error.innerHTML = "";
        fieldsChecks["name"] = true;
    }else{
        error.innerHTML = "Please  Enter  name.  name should be greterthan 1 or lessthan 90";
        error.style.color="red"
        fieldsChecks["name"] = false;

    }
    validateAndEnableSubmit();
}


function statsValidation()
{
	 let element = document.getElementById("stats");
	    let error = document.getElementById("statsError");

	    if(element.value.length != '0')
	    {
	        error.innerHTML = "";
	        fieldsChecks["stats"] = true;
	    }else
	    {
	        error.innerHTML = "Please select stats";
	        error.style.color="red"
	        fieldsChecks["stats"] = false;

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
	
	function  teamsValidation()
	{
			let element = document.getElementById("teams");
		    let error = document.getElementById("teamsError");

		    if(element.value.length != "0")
		    {
		        error.innerHTML = "";
		        fieldsChecks["teams"] = true;
		    }else
		    {
		        error.innerHTML = "Please select teams";
		        error.style.color="red"
		        fieldsChecks["teams"] = false;

		    }
		    validateAndEnableSubmit();
		}
			
	 function matchValidation() 
	 {

	 	let element = document.getElementById("match");
	     let error = document.getElementById("matchError");

	     if(element.value >=1 && element.value <=120){
	         error.innerHTML = "";
	         fieldsChecks["match"] = true;
	     }else
	       {
	         error.innerHTML = "Please  Enter  match.  match should be greterthan 1 or lessthan 1200";
	         error.style.color="red"
	         fieldsChecks["match"] = false;

	     }

	     validateAndEnableSubmit();
	 }
	 
	 
	 function winsValidation() 
	 {

	 	let element = document.getElementById("wins");
	     let error = document.getElementById("winsError");

	     if(element.value >=1 && element.value <=120){
	         error.innerHTML = "";
	         fieldsChecks["wins"] = true;
	     }else{
	         error.innerHTML = "Please  Enter  wins.  wins should be greterthan 1 or lessthan 120";
	         error.style.color="red"
	         fieldsChecks["wins"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function lossValidation() 
	 {

	 	let element = document.getElementById("loss");
	     let error = document.getElementById("lossError");

	     if(element.value >=1 && element.value <=120){
	         error.innerHTML = "";
	         fieldsChecks["loss"] = true;
	     }else{
	         error.innerHTML = "Please  Enter  loss.  loss should be greterthan 1 or lessthan 120 ";
	         error.style.color="red"
	         fieldsChecks["loss"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function playersValidation() 
	 {

	 	let element = document.getElementById("players");
	     let error = document.getElementById("playersError");

	     if(element.value >=1 && element.value <=140){
	         error.innerHTML = "";
	         fieldsChecks["players"] = true;
	     }else{
	         error.innerHTML = "Please  Enter  players.  players should be greterthan 1 or lessthan 140";
	         error.style.color="red"
	         fieldsChecks["players"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function captainsValidation()
	 {
	 	 let element = document.getElementById("captains");
	 	    let error = document.getElementById("captainsError");

	 	    if(element.value.length != '0')
	 	    {
	 	        error.innerHTML = "";
	 	        fieldsChecks["captains"] = true;
	 	    }else
	 	    {
	 	        error.innerHTML = "Please select captains";
	 	        error.style.color="red"
	 	        fieldsChecks["captains"] = false;

	 	    }
	 	    validateAndEnableSubmit();
	 }
	 
	 function ptsValidation() 
	 {

	 	let element = document.getElementById("pts");
	     let error = document.getElementById("ptsError");

	     if(element.value >=1 && element.value <=120){
	         error.innerHTML = "";
	         fieldsChecks["pts"] = true;
	     }else{
	         error.innerHTML = "Please  Enter pts.pts should be greterthan 1 or lessthan  120";
	         error.style.color="red"
	         fieldsChecks["pts"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function oversValidation() 
	 {

	 	let element = document.getElementById("overs");
	     let error = document.getElementById("oversError");

	     if(element.value >=1 && element.value <=120){
	         error.innerHTML = "";
	         fieldsChecks["overs"] = true;
	     }else{
	         error.innerHTML = "Please  Enter overs.overs should be greterthan 1 or lessthan 120";
	         error.style.color="red"
	         fieldsChecks["overs"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function playersInTeamValidation() 
	 {

	 	let element = document.getElementById("playersInTeam");
	     let error = document.getElementById("playersInTeamError");

	     if(element.value >=1 && element.value <=120){
	         error.innerHTML = "";
	         fieldsChecks["playersInTeam"] = true;
	     }else{
	         error.innerHTML = "Please  Enter playersInTeam.playersInTeam should be greterthan 1 or lessthan 120 ";
	         error.style.color="red"
	         fieldsChecks["playersInTeam"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function bowlersValidation() 
	 {

	 	let element = document.getElementById("bowlers");
	     let error = document.getElementById("bowlersError");

	     if(element.value >=1 && element.value <=120){
	         error.innerHTML = "";
	         fieldsChecks["bowlers"] = true;
	     }else{
	         error.innerHTML = "Please  Enter  bowlers.bowlers should be greterthan 1 or lessthan 120";
	         error.style.color="red"
	         fieldsChecks["bowlers"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function batsmanValidation() 
	 {

	 	let element = document.getElementById("batsman");
	     let error = document.getElementById("batsmanError");

	     if(element.value.length >=1 && element.value.length <=120){
	         error.innerHTML = "";
	         fieldsChecks["batsman"] = true;
	     }else{
	         error.innerHTML = "Please  Enter batsman.batsman should be greterthan 1 or lessthan 120";
	         error.style.color="red"
	         fieldsChecks["batsman"] = false;

	     }
	     validateAndEnableSubmit();
	 }
	 
	 function ownerValidation()
	 {
		 let element = document.getElementById("owner");
	 	    let error = document.getElementById("ownerError");

	 	    if(element.value.length != '0')
	 	    {
	 	        error.innerHTML = "";
	 	        fieldsChecks["owner"] = true;
	 	    }else
	 	    {
	 	        error.innerHTML = "Please select owner";
	 	        error.style.color="red"
	 	        fieldsChecks["owner"] = false;

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

<h2 class="text-md-center w-50;">IPL Details</h2>


<form  class=" container  mt-xxl-5  h-50 w-50" action="ipl" method="post">

 <div class=" mb-3 ">
            <label for="name" class="form-label  ">Match Name </label>
            <input type="text" class="form-control" id="name" onblur="nameValidation()" name="name1">
            <span id="errorname"></span>
        </div> 
               
        
        <div  class="mb-3">
<label for="stats" class="form-label">Stats Of  IPL Matches </label>
       <select class="form-select custom-select-width" id="stats" onblur="statsValidation()" name="stats1" aria-label="Select Color">
  <option selected value="">---select State---</option>
   <option value="Bangalore ">Bangalore </option>
   <option value="Chennai">Chennai</option>
   <option value="Delhi">Delhi </option>
   <option value="Gujarath ">Gujarath </option>
    <option value="Hydrabad ">Hydrabad </option>
   <option value="Kolkatta">Kolkatta</option>
     <option value="Luknow">Luknow </option>
  <option value="Mumbai  ">Mumbai </option>
  <option value="Panjab ">Panjab </option>
  <option value="Rajasthan">Rajasthan </option>
  
   
 </select>
 <span id="statsError"></span><br>
 </div>
 
  <div  class="mb-3">
<label for="city" class="form-label"> Play City </label>
       <select class="form-select custom-select-width" id="city" onblur="cityValidation()" name="city1" aria-label="Select Color">
  <option selected value="">---select City---</option>
   <option value="Bangalore">Bangalore</option>
  <option value="Chandigarh">Chandigarh</option>
  <option value="Chennai">Chennai</option>
  <option value="Hydrabad">Hydrabad</option>
  <option value="Lucknow">Lucknow</option>
  <option value="Mumbai">Mumbai</option>
  <option value="Kolkata">Kolkata</option>
  
  </select>
 <span id="cityError"></span><br>
 </div>
  
  
  <div  class="mb-3">
<label for="teams" class="form-label"> Teams</label>
       <select class="form-select custom-select-width" id="teams" onblur="teamsValidation()" name="teams1" aria-label="Select Color">
  <option selected value="">---select Teams---</option>
   <option value="CSK">CSK</option>
  <option value="DC">DC</option>
  <option value="GT">GT</option>
  <option value="KKR">KKR</option>
  <option value="LSG">LSG</option>
  <option value="MI">MI</option>
  <option value="PKBS">PKBS</option>
  <option value="RR">RR</option>
  <option value="RCB">RCB</option>
  <option value="SRH">SRH</option>
  
 </select>
 <span id="teamsError"></span><br>
 </div>
        
         <div class=" mb-3 ">
        <label for="match" class="form-label  ">Number Of Match</label>
            <input type="number" class="form-control" id="match" onblur="matchValidation()" name="match1" min=1 max=90>
            <span id="matchError"></span>
        </div> 
        
        <div class=" mb-3 ">
        <label for="wins" class="form-label  ">Number Of Wins</label>
            <input type="number" class="form-control" id="wins" onblur="winsValidation()" name="wins1" min=1 max=90>
            <span id="winsError"></span>
            </div>
            
            <div class=" mb-3 ">
        <label for="loss" class="form-label  ">Number Of Loss</label>
            <input type="number" class="form-control" id="loss" onblur="lossValidation()" name="loss1" min=1 max=90>
            <span id="lossError"></span>
            </div>
            
            <div class=" mb-3 ">
        <label for="players" class="form-label  ">Number Of Players</label>
            <input type="number" class="form-control" id="players" onblur="playersValidation()" name="players1" min=1 max=90>
            <span id="playersError"></span>
            </div>
        
        <div class="mb-3">
       <label for="captains" class="form-label">Captains Name of teams</label>
         <select class="form-select custom-select-width" id="captains" onblur="captainsValidation()" name="captains1" aria-label="Select Color">
                <option selected value="">---Select Captains ---</option>
                <option value="M S Dhoni">M S Dhoni</option>
                <option value="	Rishabh Pant or David Warner">	Rishabh Pant or David Warner </option>
                <option value="	Shreyas Iyer">	Shreyas Iyer</option>
                <option value="KL Rahul">KL Rahul</option>
                <option value="Shubman Gill">Shubman Gill</option>
                <option value="Hardik Pandya">Hardik Pandya</option>
                <option value="	Shikhar Dhawan">	Shikhar Dhawan</option>
                <option value="	Sanju Samson">	Sanju Samson</option>
                <option value="Faf du Plessis">Faf du Plessis</option>
                <option value="	Pat Cummins">	Pat Cummins</option>
 
            </select>
            <span id="captainsError"></span>
        </div>
        
        
        
        <div class=" mb-3 ">
        <label for="pts" class="form-label  ">PTS</label>
            <input type="number" class="form-control" id="pts" onblur="ptsValidation()" name="pts1" min=1 max=90>
            <span id="ptsError"></span>
        </div> 
        
        <div class=" mb-3 ">
        <label for="overs" class="form-label  ">Overs in IPL Match</label>
            <input type="text" class="form-control" id="overs" onblur="oversValidation()" name="overs1" min=1 max=90>
            <span id="oversError"></span>
        </div> 
        
        <div class=" mb-3 ">
        <label for="playersInTeam" class="form-label  ">No Of Players In a team</label>
            <input type="number" class="form-control" id="playersInTeam" onblur="playersInTeamValidation()" name="playersInTeam1" min=1 max=90>
            <span id="playersInTeamError"></span>
        </div> 
        
        <div class=" mb-3 ">
        <label for="bowlers" class="form-label  ">No Of Bowlers</label>
            <input type="number" class="form-control" id="bowlers" onblur="bowlersValidation()" name="bowlers1" min=1 max=90>
            <span id="bowlersError"></span>
        </div> 
        
        <div class=" mb-3 ">
        <label for="batsman" class="form-label  ">No Of Batsman</label>
            <input type="number" class="form-control" id="batsman" onblur="batsmanValidation()" name="batsman1" min=1 max=90>
            <span id="batsmanError"></span>
        </div> 
        
         <div class="mb-3">
       <label for="owner" class="form-label">IPL Teams Owner</label>
         <select class="form-select custom-select-width" id="owner" onblur="ownerValidation()" name="owner1" aria-label="Select Color">
                <option selected value="">---Select Owner ---</option>
                <option value="N Srinivasan">N Srinivasan</option>
                <option value="	Parth Jindal">Parth Jindal </option>
                <option value="Preity Zinta, Ness Wadia, Mohit Burman, and Karan Paul">Preity Zinta, Ness Wadia, Mohit Burman, and Karan Paul</option>
                <option value="Mukesh Ambani">Mukesh Ambani</option>
                <option value="ShahRukh Khan, Juhi Chawla & Jay Mehta">ShahRukh Khan, Juhi Chawla & Jay Mehta</option>
                <option value="Kalanithi Maran">Kalanithi Maran</option>
                <option value="Manoj Badale">Manoj Badale</option>
                <option value="Dr Sanjiv Goenka">Dr Sanjiv Goenka</option>
                  <option valu="None">None</option>
 
            </select>
            <span id="ownerError"></span>
        </div>
       
        
      <div class ="mb-3 form-label">
   <input type="submit" id="submit" disabled/>
  </div>    
       
</div>

</form>

</body>
</html>