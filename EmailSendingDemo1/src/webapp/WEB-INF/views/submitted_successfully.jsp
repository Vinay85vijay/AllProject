<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<title>Resignation submition</title>
</head>
<body>


	<div>

		<h2 align="center">Resignation submitted</h2>
		<div align="center">
		
		<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRHaj1R5DkdN1sk6jJnM9vlFqu6YlJztGZCXg&usqp=CAU"  alt="shake hand" width="100" height="100">
	</div>
	<br>
		<span>Employee Name : </span> <span>${  employeeResignationForm.emp_Name}</span>
		<br> <span>Employee ID : </span> <span>${  employeeResignationForm.emp_Id}</span>
		<br> <span>Profession : </span> <span>${  employeeResignationForm.proffesion}</span>
		<br> <span>Resigning Date : </span> <span>${  employeeResignationForm.resigning_Date}</span><br>
	</div>
<body>
	<h2>Sub : Resignation Letter</h2>
	<br></br>
	<br></br>
	<h2 align=center>
		Hi am  ${  employeeResignationForm.emp_Name} with Employee
		ID : <span>${  employeeResignationForm.emp_Id}</span> <br>
		leaving the company for my so n so reasons
	</h2>
	<br></br>
	<br></br>
</body>


</body>
</html>