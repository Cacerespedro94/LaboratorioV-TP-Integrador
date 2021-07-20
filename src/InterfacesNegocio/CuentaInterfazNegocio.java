package InterfacesNegocio;

import java.util.List;

import Entidad.Cuentas;
import Entidad.Usuario;

public interface CuentaInterfazNegocio {
	
	public void altaCuenta (Cuentas cuenta);
	public void modificarCuenta(Cuentas cuenta);
	public void eliminarCuenta(Cuentas cuenta);
	public List<Cuentas>obtenerCuentasPorCliente(int idCliente);
	public Cuentas obtenerCuenta(String cbu);
	public boolean checkCuentaByUsuario(Usuario usuarioLogueado, String num_cuenta);
	
}
