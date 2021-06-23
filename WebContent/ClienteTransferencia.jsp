
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" content="text/html; charset=ISO-8859-1">

<style>  
	 p.one {
  	border-style: outset;
  	border-width: 5px;
	}
</style>
<link rel="stylesheet" href="//cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Transferencia</title>
</head>
<body>
	   <nav id="mainNavbar" class="navbar navbar-dark navbar-expand-md py-0"
		style="background: #569EF4"> 

		<a href="#" class="navbar-brand">UTN Bank</a>

		<button class="navbar-toggler" data-toggle="collapse"
			data-target="#navLinks" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse justify-content-between blurb"
			id="navLinks">
			<ul class="navbar-nav">
				<li class="nav-item"><a href="ClienteInicio.jsp" class="nav-link">Inicio</a></li>
				<li class="nav-item"><a href="ClienteHistorialMovimientos.jsp" class="nav-link">Historial</a>
				</li>
				<li class="nav-item"><a href="ClienteTransferencias.jsp" class="nav-link">Transferencias</a>
				</li>
				<li class="nav-item"><a href="ClientePerfil.jsp" class="nav-link">Perfil</a></li>
			</ul>
			<ul class="navbar-nav" style="margin-right: 30px">
				<li class="nav-item align-content-lg-end"><label
					id="lblNombreUsuario"
					Style="color: white; margin-right: 20px; margin-top: 5px;">NombreUsuario</label>
				</li>
				<li class="nav-item align-content-lg-end"><input
					class="btn btn-secondary"
					style="position: center; text-align: center; width: 100%"
					type="submit" value="Cerrar Sesion" name="btnCerrarSesion" /></li>
			</ul>
		</div>
	</nav>
        
        <h3 align="center" style="margin-top: 30px;">Realizar Transferencia</h3>

	
	<div class="container-md">
			<label>Cuenta que desea Utilizar</label>
			<select name="ddlCuentasTransferencia" >
					<option value=""></option>
					<option value=""></option>
					<option value=""></option>
					<option value=""></option>
		</select>

		 <div class="form-group">
    		<label for="CBU_Destino">CBU de la cuenta a la que desea transferir</label>
    		<input type="number" class="form-control" name="txtCBUDestino"  placeholder="" required>
  		 </div>
		 <div class="form-group">
    		<label for="Monto">Ingrese Monto</label>
    		<input type="number" class="form-control" name="txtTransferenciaMonto"  placeholder="" required>
  		</div>
  
  		<div class="container-sm" align="center">
  			 <div class="form-group">
  			 	
				<input type="submit" class="btn btn-secondary btn-lg active" name="BtnTransferencia" value="Realizar Transferencia">
  			 </div>
  		</div>
  		
  		    <div id="log"></div>
			<h4 id="Log" align="center" style="margin:10px;"></h4>
	</div>
	

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>

</body>
</html>