package TpIntegrador.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Entidad.Cuentas;
import Negocio.CuentaNegocio;

@Controller
public class CuentaController {
	
	@RequestMapping("irAltaCuenta.html")
	public ModelAndView redireccionAltaCuenta(){
		ModelAndView MV = new ModelAndView();
		MV.setViewName("AltaCuenta"); 
		return MV;
	}

	@RequestMapping("AltaCuenta.html")
	public ModelAndView AltaCuenta(Cuentas model){
		CuentaNegocio neg=new CuentaNegocio();
		  Cuentas cuenta = new Cuentas();
		cuenta.setCbu(model.getCbu());
		cuenta.setSaldo(model.getSaldo());
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
		ModelAndView MV = new ModelAndView();
		MV.setViewName("AltaCuenta");
		MV.addObject("Mensaje", Message);
		//MV.addObject("listaUsuarios",this.service.obtenerUsuarios()); linea para devolver lista de cuentas en este caso.
		return MV;
	}

	private float Float(String txtAltaCuentaSaldo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
