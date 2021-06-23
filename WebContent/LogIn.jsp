<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>Inicio</title>
</head>
<body>
	<form action="ServletLoginSingin" method="post">
		<div class="fondo">
			<h2 style="color:#000000;" align=center>
			<b>INICIO DE SESION</b>
		</h2>
		</div>
		<BR><BR><BR><BR><BR><BR>
		<div>
		 	<table align="center" style="margin-top:15px">
			
			<tr>
				<td> Nombre de usuario </td>
				<td> <input type=text name="txtLogInNombreUsuario" required/> </td>
			</tr>
			
			<tr>
				<td> Contraseña </td>
				<td> <input type=password name="txtLogInContraseña" required/> </td>
			</tr>
			<tr>
				<td> </td>
				<td> <input type="submit" value="Iniciar Sesión" class="dropbtn" name="BtnLogIn"></td>
			</tr>
		</table>
		</div>
		
	</form>
</body>
</html>










