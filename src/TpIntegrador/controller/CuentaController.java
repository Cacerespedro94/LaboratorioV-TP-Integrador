package TpIntegrador.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Entidad.Cuentas;
import InterfacesNegocio.CuentaInterfazNegocio;
import Negocio.CuentaNegocio;

@Controller
public class CuentaController {
	CuentaInterfazNegocio neg=new CuentaNegocio();
	ModelAndView MV = new ModelAndView();
	@RequestMapping("irAltaCuenta.html")
	public ModelAndView redireccionAltaCuenta(){
		ModelAndView MV = new ModelAndView();
		MV.setViewName("AltaCuenta"); 
		return MV;
	}

	@RequestMapping("AltaCuenta.html")
	public ModelAndView AltaCuenta(Cuentas model){
		
		  Cuentas cuenta = new Cuentas();
		cuenta.setCbu(model.getCbu());
		cuenta.setSaldo(10000);
		cuenta.setFechaCreacion(LocalDate.now().toString());
		cuenta.setNroCuenta(model.getNroCuenta());
		cuenta.setUsuario(model.getUsuario());
		cuenta.setTipoCuenta(model.getTipoCuenta());
		cuenta.setEstado(true);
		String Message="";
	try{
			
			neg.altaCuenta(cuenta);
			Message = "Cuenta agregada";
		}
		catch(Exception e)
		{
			Message = "No se pudo insertar la cuenta";
		}
		finally
		{
		
		}
		
		MV.setViewName("AltaCuenta");
		MV.addObject("Mensaje", Message);
		//MV.addObject("listaUsuarios",this.service.obtenerUsuarios()); linea para devolver lista de cuentas en este caso.
		return MV;
	}
	
	@RequestMapping(value = "eliminarCuenta.html", method = RequestMethod.GET)
	public ModelAndView eliminarCuenta(@RequestParam String id) {

		Cuentas cuentaEliminar = new Cuentas();
		cuentaEliminar.setNroCuenta(Integer.parseInt(id));
		neg.eliminarCuenta(cuentaEliminar);
		MV.setViewName("cuentaEliminadaCorrectamente");
		return MV;
	}
	
	private float Float(String txtAltaCuentaSaldo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
