package Negocio;

import java.util.List;

import DAO.CuentaDAO;
import Entidad.Cuentas;
import Entidad.Usuario;
import InterfacesNegocio.CuentaInterfazNegocio;

public class CuentaNegocio implements CuentaInterfazNegocio {
	 CuentaDAO dao=new CuentaDAO();
	public void altaCuenta(Cuentas cuenta) {
	
    	dao.altaCuenta(cuenta);
	}

	@Override
	public void modificarCuenta(Cuentas cuenta) {
		// TODO Auto-generated method stub
		dao.modificarCuenta(cuenta);
	}

	@Override
	public void eliminarCuenta(Cuentas cuenta) {
		// TODO Auto-generated method stub
		dao.eliminarCuenta(cuenta);
	}

	@Override
	public List<Cuentas> obtenerCuentasPorCliente(int idCliente) {
		// TODO Auto-generated method stub
		List<Cuentas> listaCuentas = dao.obtenerCuentasPorCliente(idCliente);
		return listaCuentas;
	}

	@Override
	public Cuentas obtenerCuenta(String cbu) {
		// TODO Auto-generated method stub
		Cuentas cuenta = dao.obtenerCuenta(cbu);
		return cuenta;
	}

	@Override
	public boolean checkCuentaByUsuario(Usuario usuarioLogueado, String num_cuenta) {
		// TODO Auto-generated method stub
		return dao.checkCuentaIsFromUsuarioLogueado(usuarioLogueado, num_cuenta);
	}
}
