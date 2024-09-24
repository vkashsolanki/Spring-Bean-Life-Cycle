<html>
<body>
	<link rel="stylesheet"
		href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
		crossorigin="anonymous">

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<h2>Register Here!</h2>


	<!-- send request from regiter.jsp  -->
	<form action="register.jsp">
		<label>Name </label>
		<br>
		<input type="text" placeholder=Enter your name" id="name" name="id">
		<br>
		<label>Email </label>
		<br>
		<input type="email" placeholder="Enter the email" id="email"name="email">
		<br>
		<label>Mobile Number</label>
		<br>
		 <input type="number" placeholder="Enter the mobile number" id="mobile" name="mobile">
		 <br>
		 <label>Password</label>
		 <br>
		<input type="password" placeholder="Enter the password" id="password"name="password">
		<br>
		<br><br>
		<input type="submit" value="sumbit"> <br><br>




	</form>
</body>
</html>
