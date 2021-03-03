<html>
<body>
	<h2>Initiailize Hibernate!</h2>

	<a href="init"> Initialize Hibernate</a>
	<br></br>

	<a href="list">List of Products</a>
	<hr></hr>
	
	<h4>Add a Product</h4>

	
	<form action="ProductAdded" method="post">
		<label for="fname">Product name:</label><br> 
		<input type="text" id="fname" name="fname" value="Laptop Name"><br> 
		<label for="lname">Product Price:</label><br> 
		<input type="text" id="lname" name="lname" value="Price">
		<input type="submit" value="Submit">
	</form>

</body>
</html>
