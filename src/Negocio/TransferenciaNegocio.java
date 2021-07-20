package Negocio;

import java.util.List;

import DAO.TransferenciaDAO;
import Entidad.Cuentas;
import Entidad.Transferencias;
import InterfacesNegocio.TransferenciaInterfazNegocio;

public class TransferenciaNegocio implements TransferenciaInterfazNegocio{

	static TransferenciaDAO transferenciaDAO;
	
	@Override
	public TransferenciaDAO getTransferenciaDao() {
		// TODO Auto-generated method stub
		return transferenciaDAO;
	}

	@Override
	public void setTransferenciaDao(TransferenciaDAO TransferenciaDAO) {
		// TODO Auto-generated method stub
		this.transferenciaDAO = TransferenciaDAO;
	}

	@Override
	public void agregarTransferencia(Cuentas cuenta_origen, Cuentas cuenta_destino, float importe, String detalle) {
		// TODO Auto-generated method stub
		this.transferenciaDAO.agregarTransferencia(cuenta_origen, cuenta_destino, importe, detalle);
	}


	@Override
	public void prueba() {
		// TODO Auto-generated method stub
		System.out.println("Prueba Transferencia Negocio");
	}

	@Override
	public List<Transferencias> getListaDeTransferenciasByCuenta(Cuentas cuenta) {
		// TODO Auto-generated method stub
		return this.transferenciaDAO.getListaDeTransferenciasByCuenta(cuenta);
	}

}
