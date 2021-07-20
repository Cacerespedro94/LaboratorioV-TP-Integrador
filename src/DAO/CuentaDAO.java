package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import Entidad.Cuentas;
import dao.ConfigHibernate;
import dao.Query;
import entidades.Cuenta;
public class CuentaDAO {
	private static ConfigHibernate ch;
	public static Session session;
	
	public void altaCuenta(Cuentas cuenta) {
		
	/*	Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);		
		Session session=sessionFactory.openSession()*/
		ConfigHibernate config=new ConfigHibernate();
		Session session=config.abrirConexion();
    	session.beginTransaction();
		session.save(cuenta);
		session.getTransaction().commit();
		session.close();
	}
	
    public void altaCuenta (Cuentas cuenta)
    {
    	Session session = ch.getConexion();
		session.beginTransaction();
    	session.save(cuenta);
    	session.getTransaction().commit();
    }
    
	public void modificarCuenta(Cuenta cuenta) {
		session = ch.getConexion();
		session.beginTransaction();
    	session.update(cuenta);
    	session.getTransaction().commit();
	}
    
    public void eliminarCuenta(Cuentas cuenta) {
		
		
		Integer num_cuenta = cuenta.getNroCuenta();
		
		session = ch.getConexion();
		session.beginTransaction();
   	
		String hql = "UPDATE Cuenta SET estado = false WHERE nroCuenta = :nroCuenta";
		
		Query q = session.createQuery(hql);
		q.setParameter("nroCuenta", nroCuenta);
	    q.executeUpdate();
	    
		session.getTransaction().commit();
	}
    
   
	
}
