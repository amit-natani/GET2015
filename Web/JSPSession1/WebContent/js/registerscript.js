
	function validate() {
		var resultvalidation = false;
		var name = document.getElementById("name").value;
		var username = document.getElementById("username").value;
		var email = document.getElementById("email").value;
		var password = document.getElementById("password").value;
		var confirmPassword = document.getElementById("confirmPassword").value;
		var state = document.getElementById("state").value;
		var city = document.getElementById("city").value;
		if(name == "") {
			alert("Name not entered");
		}
		else{
			if(username == "") {
				alert("Username can't be empty")
			}
			else {
				if(email == "") {
					alert("Email can't be empty");
				}
				else {
					if(password == "") {
						alert("Passwords can't be empty");
					}
					else if(password.length < 8) {
						alert("password must be at least 8 characters long");
					}
					else {
						if(confirmpassword == "") {
							alert("Re-type Password");
						}
						else {
							if(password != confirmpassword) {
								alert("Password Doesn't match");
							}
							else {
								if(state == "") {
									alert("Select State");
								}
								else {
									if(city == "") {
										alert("Select City");
									}
									else {
										alert("user Created Successfully");
										resultvalidation = true;
									}
								}
							}
						}
					}
				}
			}
		}
		return resultvalidation;
	}	
	
	function cityShow() {
		var stateObject = document.getElementById("state");
		var cityObject = document.getElementById("city");
		switch(stateObject.value) {
			case "rajasthan":
				cityObject.innerHTML = "<option value = ''>--Select City--</option><option value = 'jaipur'>Jaipur</option><option value = 'kota'>Kota</option><option value = 'ajmer'>Ajmer</option><option value = 'alwar'>Alwar</option>";
				break;
			case "maharashtra":
				cityObject.innerHTML = "<option value = ''>--Select City--</option><option value = 'mumbai'>Mumbai</option><option value = 'nagpur'>Nagpur</option><option value = 'pune'>Pune</option><option value = 'thane'>Thane</option>";
				break;
			case "bihar":
				cityObject.innerHTML = "<option value = ''>--Select City--</option><option value = 'patna'>Patna</option><option value = 'gaya'>Gaya</option><option value = 'bhagalpur'>Bhagalpur</option><option value = 'hajipur'>Hajipur</option>";
				break;	
			case "punjab":
				cityObject.innerHTML = "<option value = ''>--Select City--</option><option value = 'amritsar'>Amritsar</option><option value = 'jalandhar'>Jalandhar</option><option value = 'ludhiyana'>Ludhiyana</option><option value = 'patiala'>Patiala</option>";
				break;
		}
	}
	