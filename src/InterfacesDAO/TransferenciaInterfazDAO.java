package InterfacesDAO;

import java.util.List;

import Entidad.Cuentas;
import Entidad.Transferencias;

public interface TransferenciaInterfazDAO {

	public void agregarTransferencia (Cuentas cuenta_origen, Cuentas cuenta_destino, float importe, String detalle);
	
	public List<Transferencias> getListaDeTransferenciasByCuenta(Cuentas cuenta);
	
}
