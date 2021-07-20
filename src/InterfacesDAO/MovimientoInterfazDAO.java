package InterfacesDAO;

import java.util.List;

import Entidad.Cuentas;
import Entidad.Movimientos;

public interface MovimientoInterfazDAO {

	
	public void agregarMovimiento (Cuentas cuentaOrigen, Cuentas cuentaDestino, String detalle, float importe);
	
	public List<Movimientos> getListaDeMovimientosByCuenta(Cuentas cuenta);
}
