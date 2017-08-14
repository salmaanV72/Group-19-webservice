<?php include('server.php') ?>
<!DOCTYPE html>
<html>
<head>
	
	<title>Registration system PHP and MySQL</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<style>
	
	body{
		background-image:url(bg.jpg)
		
	}
	</style>
</head>
<body>

	<marquee>WeSell , where style is priority..........Any questions??? please feel free to drop us an email at info@WeSell.co.za...loads of product ranges to choose from to satisfy all style types.....Start now while stocks last.....Enjoy your experience!!</marquee>
	<div class="header">
	<h1>Welcome to WeSell please complete the form below to register and start shopping</h1>
		
	</div>
	
	<form method="post" action="register.php">

		<?php include('errors.php'); ?>

		<div class="input-group">
			<label>Username</label>
			<input type="text" name="username" value="<?php echo $username; ?>">
		</div>
		<div class="input-group">
			<label>Email</label>
			<input type="email" name="email" value="<?php echo $email; ?>">
		</div>
		<div class="input-group">
			<label>Password</label>
			<input type="password" name="password_1">
		</div>
		<div class="input-group">
			<label>Confirm password</label>
			<input type="password" name="password_2">
		</div>
		<div class="input-group">
			<button type="submit" class="btn" name="reg_user">Register</button>
		</div>
		<p>
			Already a member? <a href="login.php">Sign in</a>
		</p>
	</form>
</body>
</html>