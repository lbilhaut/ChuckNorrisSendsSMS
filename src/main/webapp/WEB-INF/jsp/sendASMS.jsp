<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="container main-content">
	<div class="text-center">
		<h1>Send a random Chuck Norris joke to your friends!</h1>
		<form:form action="${relativePath}/SMS-sent" method="POST" modelAttribute="sms">			
			<div class="formInputGroup">
				<div class="row">
					<form:input path="fromName" type="text" class="form-control col-lg-4 offset-lg-4" placeholder="Your name*" aria-label="Sender's name"/>
				</div>
				<div class="row">
					<form:errors path="fromName" class="error text-center col-lg-4"/>
				</div>
				<div class="row">
					<form:input path="toName" type="text" class="form-control col-lg-4 offset-lg-4" placeholder="Recipient's name*" aria-label="Recipient's name"/>
					<form:errors path="toName" class="error col-lg-4 text-center"/>
					<form:input path="phoneNumber" type="text" class="form-control col-lg-4 offset-lg-4" placeholder="Recipient's phone number* (8881231234)" aria-label="Recipient's phone number"/>
					<form:errors path="phoneNumber" class="error col-lg-4 text-center"/>
				</div>
				<div class="row">					
					<a class="btn btn-info col-lg-4 offset-lg-4" data-toggle="collapse" href="#moreOptions" role="button" aria-expanded="false" aria-controls="collapseExample">
			  			More options
			  		</a>
			  	</div>
		  		<div class="collapse" id="moreOptions">
					<br>Chuck Norris is the best! But I want to switch his name to:
					<div class="row">
						<form:input type="text" class="form-control col-lg-4 offset-lg-4" placeholder="Firstname" path="firstname" aria-label="Firstname"></form:input>
					</div>
					<div class="row">
						<form:input type="text" class="form-control col-lg-4 offset-lg-4" placeholder="Lastname" path="lastname" aria-label="Lastname"></form:input>
					</div>
					<img src="${relativePath}/img/HeIsAShe.png" class="col-lg-1 col-4" alt="image He is a She"/><br>
					He is a She <form:checkbox path="female"/>
					<br><hr>
					<img src="${relativePath}/img/Explicit.png" class="col-lg-1 col-4" alt="image explicit">
					<br>
					Ohlala! I want the jokes to be explicit!<span class="d-none d-md-inline d-md-none"> (No judging!)</span>
					<form:checkbox id="explicit" path="explicit" class="mutuallyexclusive"/>
					<br><hr><img src="${relativePath}/img/nerd.png" class="col-lg-1 col-4" alt="image nerd">
					<br>I prefer my jokes to be nerdy*
					<form:checkbox id="nerdy" path="nerdy" class="mutuallyexclusive"/>
					<br><span id="GoWonder">
					* You can't have explicit AND nerdy jokes! Go wonder!</span>
					<br>
				</div>
				<div class="row">
					<input id="send" class="btn btn-primary formSubmitButton col-lg-4 offset-lg-4" type="submit" value="Send a joke!" />
				</div>
			</div> <!-- formInputGroup -->
		</form:form>	
		<div id="spinner" class="spinner-border text-info" role="status">
  				<span class="sr-only">Loading...</span>
		</div>
	</div> <!-- text-center -->


	
</section> <!-- container main-content -->

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
