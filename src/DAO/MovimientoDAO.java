package DAO;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import Entidad.Cuentas;
import Entidad.Movimientos;
import InterfacesDAO.MovimientoInterfazDAO;
import DAO.ConfigHibernate;

public class MovimientoDAO implements MovimientoInterfazDAO{

	private ConfigHibernate ch;
	private Movimientos movimiento;
	
	public Movimientos getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(Movimientos movimiento) {
		this.movimiento = movimiento;
	}

	public MovimientoDAO() {
		super();
	}
	
	public ConfigHibernate getCh() {
		return ch;
	}

	public void setCh(ConfigHibernate ch) {
		this.ch = ch;
	}
	
	@Override
	public void agregarMovimiento(Cuentas cuentaOrigen, Cuentas cuentaDestino, String detalle, float importe) {
		// TODO Auto-generated method stub
		Session session = ch.getConexion();
		if(detalle.isEmpty()) {
			detalle = "";
		}
		
		Date hoy = Date.valueOf(LocalDate.now());

		movimiento.setCuentaOrigen(cuentaOrigen);
		movimiento.setCuentaDestino(cuentaDestino);
		movimiento.setDetalle(detalle);
		movimiento.setImporte(importe);
		movimiento.setFecha(hoy.toString());
		
		session.beginTransaction();
		session.save(movimiento);
    	session.getTransaction().commit();
		
	}

	@Override
	public List<Movimientos> getListaDeMovimientosByCuenta(Cuentas cuenta) {
		// TODO Auto-generated method stub
		
		Session session = ch.getConexion();
		String hql = "FROM Movimientos WHERE CuentaOrigen = :cuenta";
		Query q = session.createQuery(hql);
		q.setParameter("cuenta", cuenta);
		List<Movimientos> listaMovimientos = q.list();   
		
		for (Movimientos movimiento : listaMovimientos ) {
		    System.out.println(movimiento.toString());
		}

		return listaMovimientos;

	}

}
