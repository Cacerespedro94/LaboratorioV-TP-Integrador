package DAO;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import Entidad.Cuentas;
import Entidad.Transferencias;
import InterfacesDAO.TransferenciaInterfazDAO;

public class TransferenciaDAO implements TransferenciaInterfazDAO{

	private static ConfigHibernate configHibernate;
	private Transferencias transferencia;
	
	public TransferenciaDAO() {
		super();
	}
	
	public ConfigHibernate getConfigHibernate() {
		return configHibernate;
	}
	
	public void setConfigHibernate(ConfigHibernate ch) {
		this.configHibernate = ch;
	}
	
	public Transferencias getTransferencia() {
		return transferencia;
	}
	
	public void setTransferencia(Transferencias t) {
		this.transferencia = t;
	}
	
	@Override
	public List<Transferencias> getListaDeTransferenciasByCuenta(Cuentas cuenta) {
		Session session = configHibernate.getConexion();
		String hql = "FROM Transferencia WHERE cuenta_origen = :cuenta or cuenta_destino = :cuenta";
		Query q = session.createQuery(hql);
		q.setParameter("cuenta", cuenta);
		List<Transferencias> listaTransferencias = q.list();    
		
		for (Transferencias tran : listaTransferencias ) {
		    System.out.println(tran.toString());
		}

		return listaTransferencias; 
	}

	
	@Override
	public void agregarTransferencia(Cuentas cuenta_origen, Cuentas cuenta_destino, float importe, String detalle) {
		// TODO Auto-generated method stub
		Session session = configHibernate.getConexion();
		if(detalle.isEmpty()) {
			detalle = "";
		}
		
		Date fechaHoy = Date.valueOf(LocalDate.now());
		
		transferencia.setMonto(importe);
		transferencia.setDetalle(detalle);
		transferencia.setCuentaDestino(cuenta_destino);
		transferencia.setCuentaOrigen(cuenta_origen);
		transferencia.setFecha(fechaHoy.toString());
		
		session.beginTransaction();
		session.save(transferencia);
		session.getTransaction().commit();

	}

}
