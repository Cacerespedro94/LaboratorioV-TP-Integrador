package InterfacesNegocio;

import java.util.List;

import DAO.TransferenciaDAO;
import Entidad.Cuentas;
import Entidad.Transferencias;

public interface TransferenciaInterfazNegocio {

	public TransferenciaDAO getTransferenciaDao();
	
	public void setTransferenciaDao(TransferenciaDAO TransferenciaDAO);
	
	public void agregarTransferencia(Cuentas cuenta_origen, Cuentas cuenta_destino, float importe, String detalle);
	
	public List<Transferencias> getListaDeTransferenciasByCuenta(Cuentas cuenta);
	
	public void prueba ();
	
}
