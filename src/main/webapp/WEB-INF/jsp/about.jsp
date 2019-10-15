<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="container main-content">
	<div class="row">
		<div class="col-lg-12 text-center" id="about">
			<h1>About</h1>
			<p class="col-lg-6 offset-lg-3">Hi, my name is Lise, and I developped, designed, and deployed the app <span class="cnss">Chuck Norris Sends SMS</span> 
			in October 2019 as a side project while I was learning web development.</p>
			<span class="cnss">Chuck Norris Sends SMS</span> uses:
			<ul>
				<li><span>Java and Spring MVC for the back-end.</span></li>
				<li><span>HTML, CSS, Bootstrap, JSP, and JavaScript for the front-end.</span></li>
				<li><span><a href="http://www.twilio.com/referral/Pcz7Ie" target= "_Blank">Twilio</a> SMS API to send texts.</span></li> 
				<li><span><a href="http://www.icndb.com/" target= "_Blank">The Internet Chuck Norris Database</a> to generate the jokes.</span></li>
			</ul>
			<ul>
				<li><span>The app is deployed on <a href="https://www.heroku.com/" target= "_Blank">Heroku</a>.</span></li>
				<li><span>It even has form validation!</span></li>
			</ul>
			<p>Find the code source of this project on my <a href="https://github.com/lbilhaut/ChuckNorrisSendsSMS">Github page</a>.</p>
			<h2>Have fun!</h2>
		</div>
	</div>
</section>

<c:import url="/WEB-INF/jsp/common/counter.jsp" />

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
