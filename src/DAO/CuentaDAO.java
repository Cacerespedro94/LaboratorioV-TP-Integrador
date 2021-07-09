package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import Entidad.Cuentas;
public class CuentaDAO {
	
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
	
}
