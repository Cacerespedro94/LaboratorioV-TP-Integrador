package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import Entidad.Cuentas;
import Entidad.Pais;
import Entidad.Provincia;
import Entidad.TipoCuenta;
import Entidad.TipoMovimiento;
import Entidad.TipoUsuario;
import Entidad.Usuario;


public class ConfigHibernate {

	private SessionFactory sessionFactory;
	private Session session;
	Configuration configuration;
	ServiceRegistry serviceRegistry;

	public ConfigHibernate()
	{
		Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}
	
	public Session abrirConexion()
	{
		session=sessionFactory.openSession();
		return session;
	}
	
	public void cerrarSession()
	{
		session.close();
		cerrarSessionFactory();
		
	}
	
	
	public void cerrarSessionFactory()
	{
		sessionFactory.close();
	}
	
	public void datosEjemplo() {
		
		TipoCuenta tipoCuenta1 = new TipoCuenta("Caja de ahorro en Pesos");
    	TipoCuenta tipoCuenta2 = new TipoCuenta("Caja de ahorro en Dolares");
    	TipoCuenta tipoCuenta3 = new TipoCuenta("Cuenta Corriente");
    	
    	TipoMovimiento tipoMov1=new TipoMovimiento();
    	tipoMov1.setDescripcion("Transferencia");
    
        
    	TipoUsuario tipoUsuario1=new TipoUsuario();
    	tipoUsuario1.setDescripcion("Admin");
    	TipoUsuario tipoUsuario2=new TipoUsuario();
    	tipoUsuario2.setDescripcion("Cliente");
    	
    	
    	Pais pais= new Pais();
    	pais.setNombre("Argentina");
    	
    	Provincia provincia=new Provincia();
    	provincia.setNombre("Buenos Aires");
    	provincia.setPais(pais);
    	

    	Usuario user1=new Usuario();
    	user1.setNombreUsuario("Pepe123");
    	user1.setContrasena("contraseña");
    	user1.setNombre("Pepe");
    	user1.setApellido("Gonzalez");
    	user1.setDni("12345678");
    	user1.setFechaNacimiento("12/05/1990");
    	user1.setCuil("20123456789");
    	user1.setDireccion("SiempreViva 123");
    	user1.setEmail("pepe@hotmail.com");
    	user1.setLocalidad("Tigre");
    	user1.setSexo("M");
    	user1.setEstado(true);
    	user1.setTipoUsuario(tipoUsuario1);
    	user1.setProvincia(provincia);
    	user1.setTelefono("0112345678");
    	
    	Usuario user2=new Usuario();
    	user1.setNombreUsuario("Juan12");
    	user1.setContrasena("1234");
    	user1.setNombre("Juan");
    	user1.setApellido("MArtinez");
    	user1.setDni("11111111");
    	user1.setFechaNacimiento("10/07/1997");
    	user1.setCuil("20111111115");
    	user1.setDireccion("SiempreHonesta 123");
    	user1.setEmail("Juancito@hotmail.com");
    	user1.setLocalidad("San Isidro");
    	user1.setSexo("M");
    	user1.setEstado(true);
    	user1.setTipoUsuario(tipoUsuario2);
    	user1.setProvincia(provincia);
    	user1.setTelefono("1545873325");
    	
    	Cuentas cuenta1=new Cuentas();
    	cuenta1.setCbu("123456");
    	cuenta1.setEstado(true);
    	cuenta1.setFechaCreacion("9/7/2021");
    	cuenta1.setSaldo(10000);
    	cuenta1.setTipoCuenta(tipoCuenta1);
    	cuenta1.setUsuario(user1);
    	
     	Cuentas cuenta2=new Cuentas();
    	cuenta2.setCbu("123456789");
    	cuenta2.setEstado(true);
    	cuenta2.setFechaCreacion("9/7/2021");
    	cuenta2.setSaldo(10000);
    	cuenta2.setTipoCuenta(tipoCuenta2);
    	cuenta2.setUsuario(user2);
    	
     	Cuentas cuenta3=new Cuentas();
    	cuenta3.setCbu("1234567");
    	cuenta3.setEstado(true);
    	cuenta3.setFechaCreacion("9/7/2021");
    	cuenta3.setSaldo(10000);
    	cuenta3.setTipoCuenta(tipoCuenta3);
    	cuenta3.setUsuario(user1);
    	
    	session.beginTransaction();
    	
     	session.save(tipoMov1);
    	
    	session.save(tipoUsuario2);
    	
    	session.save(user1);
    	session.save(user2);
    	
    	session.save(cuenta1);
    	session.save(cuenta2);
    	session.save(cuenta3);
    	
    	session.getTransaction().commit();
    	
	}
	
}
