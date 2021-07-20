<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">	
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Alta Cliente</title>
</head>
<body>

		<div>
			<h1 align=center style="color: #0049A0;">
				UTN BANK
			</h1>
		</div>
		
		 <!--Navbar-->

    <nav id="mainNavbar" class="navbar navbar-dark navbar-expand-md py-0" style="background: #569EF4">

            <a href="#" class="navbar-brand">UTN Bank</a>

            <button class="navbar-toggler" data-toggle="collapse" data-target="#navLinks" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-between blurb" id="navLinks"">
                <ul class="navbar-nav" style="margin-right:700px">
                
                    <li class="nav-item">
                        <a class="nav-link">Inicio</a>
                    </li>            
                    
                    <li class="nav-item dropdown">
                      <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Usuarios
                      </a>
                      <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                        <a class="dropdown-item" >Alta Usuario</a>
                        <a class="dropdown-item" >Listar Usuario</a>
                      </div>
                    </li>
                    
                    <li class="nav-item dropdown">
                      <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Cuentas
                      </a>
                      <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                        <a class="dropdown-item" >Alta Cuenta</a>
                        <a class="dropdown-item">Listar y Modificar</a>
                      </div>
                    </li>
                    
                    <li class="nav-item">
                        <a class="nav-link">Reportes</a>
                    </li>
                    
                    <li class="nav-item">
                        <a class="nav-link">Perfil</a>
                    </li>
                    
                </ul>
                <ul class="navbar-nav" style="margin-right: 30px">
                    <li class="nav-item align-content-lg-end">
                      <label id="lblNombreUsuario" Style="color: white;margin-right:20px; margin-top:5px;"></label>
                    </li>
                    <li class="nav-item align-content-lg-end">
                      <input class="btn btn-secondary" style="position: center;text-align: center; width:100%" type="submit" value="Cerrar Sesion" name="btnCerrarSesion"/>
                    </li>
                </ul>
            </div>
        </nav>
		
		
		<h2 style="color: #0049A0;" align=center>
			<b>ALTA DE CLIENTE</b>
		</h2>
<div class="container">

  <div class="row">
    <div class="col-2">
     
    </div>
    <div class="col-8">
  		<form action="AltaCliente.html">
		
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <input type="email" class="form-control" id="inputEmail4">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Contraseña</label>
      <input type="password" class="form-control" id="inputPassword4">
    </div>
  </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">DNI</label>
      <input type="text" class="form-control" id="inputEmail4">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">CUIL</label>
      <input type="text" class="form-control" id="inputPassword4">
    </div>
  </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Nombre</label>
      <input type="text" class="form-control" id="inputEmail4">
    </div>  
     <div class="form-group col-md-6">
      <label for="inputPassword4">Apellido</label>
      <input type="password" class="form-control" id="inputPassword4">
    </div>

  </div>
    <div class="form-row">
    <div class="form-group col-md-4">
      <label for="inputEmail4">Telefono</label>
      <input type="text" class="form-control" id="inputEmail4">
    </div>
     <div class="form-group col-md-4">
      <label for="inputPassword4">Fecha de nacimiento</label>
      <input type="date" class="form-control" id="inputPassword4">
    </div>
       <div class="form-group col-md-4">
      <label for="inputPassword4">Sexo</label>
        <select id="inputState" class="form-control">
        <option selected>Seleccionar...</option>
        <option>Masculino</option>
        <option>Femenino</option>
        </select>
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Direccion</label>
    <input type="text" class="form-control" id="inputAddress" >
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">Localidad</label>
      <input type="text" class="form-control" id="inputCity">
    </div>
    <div class="form-group col-md-6">
      <label for="inputState">Provincia</label>
      <select id="inputState" class="form-control">
        <option selected>Seleccionar...</option>
        <option>Buenos Aires</option>
        <option>Catamarca</option>
        <option>Chaco</option>
        <option>Chubut</option>
        <option>Córdoba</option>
        <option>Corrientes</option>
        <option>Entre Ríos</option>
        <option>Formosa</option>
        <option>Jujuy</option>
        <option>La Pampa</option>
        <option>La Rioja</option>
        <option>Mendoza</option>
        <option>Misiones</option>
        <option>Neuquén</option>
        <option>Río Negro</option>
        <option>Salta</option>
        <option>San Juan</option>
        <option>San Luis</option>
        <option>Santa Cruz</option>
        <option>Santa Fe</option>
        <option>Santiago del Estero</option>
        <option>Tierra del Fuego</option>
        <option>Tucumán</option>       
      </select>
    </div>
  </div>

  <button type="submit" class="btn btn-primary">Registrar</button>
</form>
			
		
    </div>
    <div class="col-2">
    
    </div>
  </div>
</div>

		
		<div align=center style="margin-top: 40px;">
			${Mensaje}
		</div>

</body>
</html>