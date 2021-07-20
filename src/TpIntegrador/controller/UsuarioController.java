package TpIntegrador.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Entidad.Pais;
import Entidad.Provincia;
import Entidad.TipoUsuario;
import Entidad.Usuario;
import Negocio.UsuarioNegocio;


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
			String TXTdomicilio, String TXTtelefono,String TXTcuil,String TXTcontrasenia,String TXTemail)
	{ 
		UsuarioNegocio neg=new UsuarioNegocio();
		ModelAndView MV = new ModelAndView();
		Usuario nuevoCliente = new Usuario();
		String Mensaje="";
		Provincia NuevaProvincia= new Provincia();
		TipoUsuario tipoUser=new TipoUsuario();
		tipoUser.setDescripcion("Cliente");
		Pais NuevoPais =new Pais();
		NuevoPais.setNombre("Argentina");
		NuevaProvincia.setPais(NuevoPais);
		nuevoCliente.setTipoUsuario(tipoUser);
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
		nuevoCliente.setEmail(TXTemail);
		nuevoCliente.setNombreUsuario(TXTnombre+TXTdni);
		nuevoCliente.setContrasena(TXTcontrasenia);
		nuevoCliente.setCuil(TXTcuil);
		nuevoCliente.setEstado(false);
		MV.setViewName("AltaCliente"); 
		if(neg.altaUsuario(nuevoCliente))
		{
			Mensaje="Cliente Guardado Correctamente";
			MV.addObject("Mensaje",Mensaje);
			
		}else {
			Mensaje="Cliente no pudo ser Guardado ";
			MV.addObject("Mensaje",Mensaje);
		}
		
		return MV;
	}
	
	@RequestMapping(value = "listarUsuarios.html", method = RequestMethod.GET)
	public ModelAndView listarClientes() {
		
			ModelAndView MV = new ModelAndView();
			UsuarioNegocio neg=new UsuarioNegocio();
			MV.setViewName("UsuariosLista");
			List<Usuario> listaUsuarios = neg.getUsuariosActivos();
			MV.addObject("listaUsuarios", listaUsuarios);
			
		return MV;
	}
	
	
}