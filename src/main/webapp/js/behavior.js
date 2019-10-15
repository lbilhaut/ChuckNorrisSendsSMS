(function(){

	window.onload = function(){ 

		var x = document.getElementById("spinner");
		if(x != null){
			x.style.display = "none";			
		}

		// Spinner
		$('#send').click(function () {
			if (x.style.display === "none") {
				x.style.display = "inline-block";
			} else {
				x.style.display = "none";
			}
		});


		// Mutually exclusive checkboxes (for nerdy and explicit)
		$('.mutuallyexclusive').click(function () {
			var explicitState = document.getElementById("explicit").checked;
			var nerdyState = document.getElementById("nerdy").checked;

			if ((explicitState && nerdyState)){
				console.log("Both elements are checked");
				console.log("Element that has been clicked the lasted is is " + event.srcElement.id);
				var clickedElementId = event.srcElement.id;
				if(clickedElementId == "explicit"){
					document.getElementById("nerdy").checked = false;           		
				}
				else {
					document.getElementById("explicit").checked = false;           				
				}
			}
		});

		// Animated Counter
		$('.counter-count').each(function () {
			console.log('in the counter function');
			$(this).prop('Counter',0).animate({
				Counter: $(this).text()
			}, {
				duration: 1500,
				easing: 'swing',
				step: function (now) {
					$(this).text(Math.ceil(now));
				}
			});
		});

	};

})();
