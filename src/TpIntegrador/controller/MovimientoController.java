package TpIntegrador.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Entidad.Cuentas;
import Entidad.Transferencias;
import Entidad.Usuario;
import Negocio.CuentaNegocio;
import Negocio.TransferenciaNegocio;
import Negocio.UsuarioNegocio;

@Controller
public class MovimientoController {
	

	@RequestMapping(value="irAMovimientos.html", method=RequestMethod.GET)
	public ModelAndView listarMovimientos(String num_cuenta) {
		
		
		TransferenciaNegocio transferenciaNegocio = new TransferenciaNegocio();
		UsuarioNegocio usuarioNegocio = new UsuarioNegocio();
		CuentaNegocio cuentaNegocio = new CuentaNegocio();
		ModelAndView mv = new ModelAndView();
		
		Usuario _usr = usuarioNegocio.getUsuarioLogueado();
		Cuentas _cuenta = cuentaNegocio.obtenerCuenta(num_cuenta);
		
		if(_cuenta != null) {
			List<Transferencias> listaDeTransferencias = transferenciaNegocio.getListaDeTransferenciasByCuenta(_cuenta);
			boolean esUnaCuentaDelUsuario = cuentaNegocio.checkCuentaByUsuario(_usr, num_cuenta);
			
			if(esUnaCuentaDelUsuario == true || _usr.getTipoUsuario().getDescripcion() == "Cliente") {
				mv.addObject("listaDeTransferencias", listaDeTransferencias);
				mv.addObject("CuentaActual", _cuenta);
			} else {
				mv.addObject("Error", true);
			}
		}
		
		mv.setViewName("movimientosLista"); 
		
		return mv;
	}
	
	
}
