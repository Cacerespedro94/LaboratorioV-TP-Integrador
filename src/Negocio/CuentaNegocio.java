package Negocio;

import DAO.CuentaDAO;
import Entidad.Cuentas;

public class CuentaNegocio {
		
	public void altaCuenta(Cuentas cuenta) {
		 CuentaDAO dao=new CuentaDAO();
    	dao.altaCuenta(cuenta);
	}
}
