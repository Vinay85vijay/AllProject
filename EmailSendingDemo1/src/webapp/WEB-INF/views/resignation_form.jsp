<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resignation Form</title>
</head>
<body>
	<div>

		<h2 align="center">Resignation Form</h2>

		<form:form action="resignation" method="post"
			modelAttribute="employeeResignationForm">
			<form:label path="emp_Name">Employee name</form:label>
			<form:input path="emp_Name" />
			<br>
			<br>
			<form:label path="emp_Id">Employee ID</form:label>
			<form:input path="emp_Id" />
			<br></br>
			<form:label path="proffesion">Profession</form:label>
			<form:input path="proffesion" />
			<br></br>
			<form:label path="resigning_Date">Resigning Date</form:label>
			<form:input path="resigning_Date" />
		
			<br></br>
			<h2 align="center">Read the letter completely before submitting</h2>
			<body>
				<h2>Sub : Resignation Letter</h2>
				<br></br>
				<br></br>
				<h2 align=center>
					hi am
					 
					with Employee ID :
					<form:input path="emp_Id" /> <br>
					leaving the company for my so n so reasons
				</h2>
				<br></br>
				<br></br>
			</body>



			<form:button  name="submit" >Submit</form:button>
		</form:form>
	</div>
</body>
</html>