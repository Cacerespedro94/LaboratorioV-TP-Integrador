package main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import Entidad.TipoCuenta;
import Entidad.Usuario;
public class Main 
{
    public static void main( String[] args )
    {
	
    	SessionFactory sessionFactory;
    	Configuration configuration = new Configuration();
    	configuration.configure();	
    	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	Session session = sessionFactory.openSession();
 
    	session.beginTransaction();
 
    	TipoCuenta tipoCuenta = new TipoCuenta("Dolares");
    	session.save(tipoCuenta);
  	
    	
    	session.getTransaction().commit();
    	session.close();
    	sessionFactory.close();
    }
}
