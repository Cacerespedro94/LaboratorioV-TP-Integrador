package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import Entidad.Cuentas;
import InterfacesDAO.CuentaInterfaz;
import Entidad.Usuario;
import DAO.ConfigHibernate;
import Entidad.Cuentas;

public class CuentaDAO implements CuentaInterfaz {
	
	private static ConfigHibernate ch;
	public static Session session;
	

	@Override
    public void altaCuenta (Cuentas cuenta)
    {
    	Session session = ch.abrirConexion();
		session.beginTransaction();
    	session.save(cuenta);
    	session.getTransaction().commit();
    }
	
	@Override
	public void modificarCuenta(Cuentas cuenta) {
		session = ch.abrirConexion();
		session.beginTransaction();
    	session.update(cuenta);
    	session.getTransaction().commit();
	}
    
	@Override
    public void eliminarCuenta(Cuentas cuenta) {
		
		
		Integer nroCuenta = cuenta.getNroCuenta();
		
		session = ch.abrirConexion();
		session.beginTransaction();
   	
		String hql = "UPDATE Cuenta SET estado = false WHERE nroCuenta = :nroCuenta";
		
		Query q = (Query) session.createQuery(hql);
		q.setParameter("nroCuenta",nroCuenta);
	    q.executeUpdate();
	    
		session.getTransaction().commit();
	}
    
	@Override
	public List<Cuentas> obtenerCuentasPorCliente(int idCliente) // Ejemplo de metodo para traer datos por HQL
	{	   
		Session session = ch.abrirConexion();
		String hql = "FROM Cuentas WHERE Usuario = :idCliente AND estado = true";
		Query q = (Query) session.createQuery(hql);
		q.setParameter("Usuario", idCliente);
		List<Cuentas> listaCuentas = q.list();    
		
		for (Cuentas _cue : listaCuentas ) {
		    System.out.println(_cue.toString());
		}

		return listaCuentas; 
	}
	
	@Override
    public Cuentas obtenerCuenta(String cbu) {
		Session session = ch.abrirConexion();		 
		String hql = "FROM Cuentas WHERE cbu = :cbu";
		Query q = (Query) session.createQuery(hql);
		q.setParameter("cbu", cbu);
		
		Cuentas cuenta = (Cuentas) q.uniqueResult();
		
		return cuenta;
		
	}
    
	//HAY QUE REVISAR ESTA QUERY
	
	@Override
	public boolean checkCuentaIsFromUsuarioLogueado(Usuario usuarioLogueado, String num_cuenta) // Ejemplo de metodo para traer datos por HQL
	{	   
		Session session = ch.getConexion();
		String hql = " FROM Cuentas as cue INNER JOIN cue.cliente as cli INNER JOIN cli.usuario as usr WHERE cue.num_cuenta = :num_cuenta AND cue.eliminado = 0";
		Query q = session.createQuery(hql);
		q.setParameter("num_cuenta", num_cuenta);
		Object[] resultado = (Object[]) q.uniqueResult();
		boolean esCuentaDelUsuarioLogueado = false;
		if(resultado != null) {
			Usuario usr = (Usuario) resultado[2];
			if(usr.getId() == usuarioLogueado.getId()) {
				esCuentaDelUsuarioLogueado = true;
			}
		}
		
		return esCuentaDelUsuarioLogueado;
		
	}
    
	
}
