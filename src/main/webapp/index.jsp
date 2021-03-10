<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Octal convertor</title>
</head>
<body>
	<div class="square center">
		<h2>Convert octal number to binary and decimal</h2>
	</div >
    <form method="post" action="octal" onsubmit="return validateOctal()">
    	<br>
		<span class="square center form">
			<input id="number" name="number" type="text" 
				placeholder="Enter octal number" required>
	        <button value="convert" type="submit">Convert</button>
		</span>
    </form>
    <br>
    <div class="square result">
    	<h2>Results for ${number}:</h2>
		<p>Binary: ${binary}</p>
		<p>Decimal: ${decimal}</p>
    </div>
	<span id="error" style="display:none; color:red"></span>
	
	<script type="text/javascript">
		const error = document.getElementById("error");
		const numberTxt = document.getElementById("number");
		
		function validateOctal() {
			let number = numberTxt.value;
			
			if (!isNaN(number) //Is a number
					&& number.match("[0-7]+") //Has 0 to 7 digits
					&& number.length <= 3 //# digits 3 or less
					&& !number.startsWith("0")) {//cannot start with 0
				
				error.style.display = 'none';
				return true;
			} else if (number.length > 3) {
				error.textContent = "Number should have no more than 3 digits.";	
				error.style.display = 'block';
			} else {
				error.textContent = "Invalid octal number.";	
				error.style.display = 'block';
			}
			return false;
		}
	
	</script>

	
</body>
<style>
.square {
	margin-left: auto;
    margin-right: auto;
    width: 50vw;
    height: 8vw;
    border-radius: 35px;
    background: #f69c55;
}
.center {
	display: flex;
  	align-items: center;
  	justify-content: center;
}
.form {
	width: 30vw;
}
.result {
	padding-top: 50px;
	width: 25vw;
    height: 15vw;
    text-align: center;
    justify-content: center;
}
input + button {
    margin-left: 10px;
}
button:hover {
	background-color: red;
}
</style>
</html>