package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import Entidad.Cuentas;
import InterfacesDAO.CuentaInterfaz;
import dao.ConfigHibernate;
import dao.Query;
import entidades.Cuenta;
public class CuentaDAO implements CuentaInterfaz {
	private static ConfigHibernate ch;
	public static Session session;
	

    public void altaCuenta (Cuentas cuenta)
    {
    	Session session = ch.abrirConexion();
		session.beginTransaction();
    	session.save(cuenta);
    	session.getTransaction().commit();
    }
    
	public void modificarCuenta(Cuentas cuenta) {
		session = ch.abrirConexion();
		session.beginTransaction();
    	session.update(cuenta);
    	session.getTransaction().commit();
	}
    
    public void eliminarCuenta(Cuentas cuenta) {
		
		
		Integer nroCuenta = cuenta.getNroCuenta();
		
		session = ch.abrirConexion();
		session.beginTransaction();
   	
		String hql = "UPDATE Cuenta SET estado = false WHERE nroCuenta = :nroCuenta";
		
		Query q = session.createQuery(hql);
		q.setParameter("nroCuenta",nroCuenta);
	    q.executeUpdate();
	    
		session.getTransaction().commit();
	}
    
	public List<Cuentas> obtenerCuentasPorCliente(int idCliente) // Ejemplo de metodo para traer datos por HQL
	{	   
		Session session = ch.abrirConexion();
		String hql = "FROM Cuentas WHERE Usuario = :idCliente AND estado = true";
		Query q = session.createQuery(hql);
		q.setParameter("Usuario", idCliente);
		List<Cuentas> listaCuentas = q.list();    
		
		for (Cuentas _cue : listaCuentas ) {
		    System.out.println(_cue.toString());
		}

		return listaCuentas; 
	}
	
    
    public Cuentas obtenerCuenta(String cbu) {
		Session session = ch.abrirConexion();		 
		String hql = "FROM Cuentas WHERE cbu = :cbu";
		Query q = session.createQuery(hql);
		q.setParameter("cbu", cbu);
		
		Cuentas cuenta = (Cuentas) q.uniqueResult();
		
		return cuenta;
		
	}
    
    
	
}
