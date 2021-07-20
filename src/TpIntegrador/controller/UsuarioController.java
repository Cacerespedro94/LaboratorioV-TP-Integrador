package TpIntegrador.controller;

import org.jboss.logging.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Entidad.Pais;
import Entidad.Provincia;
import Entidad.Usuario;


@Controller
public class UsuarioController {

	@RequestMapping("Inicio.html")
	public ModelAndView redireccion(){
		ModelAndView MV = new ModelAndView();
		MV.setViewName("Inicio"); 
		return MV;
	}
	
	@RequestMapping("irLogin.html")
	public ModelAndView redireccionLogin(){
		ModelAndView MV = new ModelAndView();
		MV.setViewName("LogIn"); 
		return MV;
	}
	
	@RequestMapping("irAltaUsuario.html")
	public ModelAndView redireccionAltaUsuario(){
		ModelAndView MV = new ModelAndView();
		MV.setViewName("AltaCliente"); 
		return MV;
	}

	
	@RequestMapping(value="AltaCliente.html", method=RequestMethod.POST)
	
	public ModelAndView altaCliente(@RequestParam(required=false) 
			String TXTnombre, String TXTapellido, String TXTdni,
			String TXTfecha, String TXTsexo, String TXTprovincia, String TXTlocalidad,
			String TXTdomicilio, String TXTtelefono, String TXTcorreo,String TXTcuil,String TXTcontrasenia,String TXTemail)
	{ 
		ModelAndView MV = new ModelAndView();
		Usuario nuevoCliente = new Usuario();
		String Mensaje="";
		Provincia NuevaProvincia= new Provincia();
		Pais NuevoPais =new Pais();
		NuevoPais.setNombre("Argentina");
		nuevoCliente.setNombre(TXTnombre);		
		nuevoCliente.setApellido(TXTapellido);
		nuevoCliente.setDni(TXTdni);
		nuevoCliente.setFechaNacimiento(TXTfecha);
		nuevoCliente.setSexo(TXTsexo);
		NuevaProvincia.setNombre(TXTprovincia);;
		nuevoCliente.setProvincia(NuevaProvincia);
		nuevoCliente.setLocalidad(TXTlocalidad);
		nuevoCliente.setDireccion(TXTdomicilio);
		nuevoCliente.setTelefono(TXTtelefono);
		nuevoCliente.setEmail(TXTcorreo);
		nuevoCliente.setContrasena(TXTcontrasenia);
		nuevoCliente.setCuil(TXTcuil);
		nuevoCliente.setEstado(false);
		MV.setViewName("AltaCliente"); 
		if(NegocioUsuario.GuardarCliente(nuevoCliente))
		{
			Mensaje="Cliente _Guardado Correctamente";
			MV.addObject(Mensaje);
			
		}else {
			Mensaje="Cliente no pudo ser Guardado ";
			MV.addObject(Mensaje);
		}
		
		return MV;
	}
	
}