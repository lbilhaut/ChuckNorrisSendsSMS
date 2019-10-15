<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<div class="counter">
	    <div class="container">
    	    <div class="row">
	            <div class="col-lg-4 offset-lg-4 col-xs-4">
					<hr>
	                <div class="number-of-jokes"><p class="counter-unit">Already</p>
	                    <p class="counter-count"><c:out value="${jokeCounter}"/></p>
	                    <p class="counter-unit">jokes sent</p>
	                </div>
	            </div>
			</div>
		</div>
	</div>
	