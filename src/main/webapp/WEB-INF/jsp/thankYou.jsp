<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div class="container main-content">
	<div class="row">
		<section class="col-lg-4 offset-lg-4" id="thank-you">
			<h1>Thank you <c:out value="${fromName}"/>!</h1>
			The joke you sent to <c:out value="${toName}"/> is:
			<div id="joke"><c:out value="${joke}" /></div>
		</section>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/counter.jsp" />

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
