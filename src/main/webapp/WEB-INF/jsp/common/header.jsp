<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Chuck Norris Sends SMS</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<script  src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script type="text/javascript" src="js/behavior.js"></script>
	<link rel="stylesheet" href="css/style.css">
	<link rel="icon" href="${relativePath}/img/icon.png">
</head>

<body>
  <header>
  <div class="container-fluid">
	  <div class="row">
        <div class="navbar-header">
        	<a href="${relativePath}/">
	        	<img src="<c:out value="${relativePath}"/>/img/ChuckNorrisSendsSMS-xs.png" class="col-5 d-inline d-md-none" alt="image banner">
	        	<img src="<c:out value="${relativePath}"/>/img/ChuckNorrisSendsSMS-lg.png" class="col-lg-8 col-md-8 d-none d-md-inline d-md-none" id="logo-lg" alt="image banner">
				<img src="<c:out value="${relativePath}"/>/img/Smartphone-cowboy-xs.png" class="col-lg-2 col-md-2 col-6" id="phone-cowboy" alt="image banner">
        	</a>
        </div>
       </div>
   </div>
 </header>
 