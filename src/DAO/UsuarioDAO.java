package DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import Entidad.Pais;
import Entidad.Usuario;
import InterfacesDAO.UsuarioInterfaz;
;

public class UsuarioDAO implements UsuarioInterfaz {

	public UsuarioDAO() {

	}
	
	@Override
    public boolean altaUsuario (Usuario user)
    {
		
			ConfigHibernate config= new ConfigHibernate();
			Session session=config.abrirConexion();
			session.beginTransaction();
			session.save(user);
			try{
				session.getTransaction().commit();
				return true;
				
			}catch(Exception ex){
				ex.printStackTrace();
				return false;
			}
			finally{
				session.close();
			}			
    }
	
	@Override
	public Usuario getUsuarioXid (int id)
	{	
		ConfigHibernate config = new ConfigHibernate();
		Session session = config.abrirConexion();
		return (Usuario)session.get(Usuario.class,id); 
	}
	
	
	@Override
	public void modificarUsuario (Usuario user) {
		ConfigHibernate config= new ConfigHibernate();
		Session session=config.abrirConexion();
		session.beginTransaction();
    	session.update(user);
    	session.getTransaction().commit();
	}
	
	@Override
	public void eliminarUsuario (Usuario user) {
		ConfigHibernate config= new ConfigHibernate();
		Session session=config.abrirConexion();
		int id = user.getId();
		String hql = "UPDATE Usuario SET estado = false WHERE id = :id";
		Query q = session.createQuery(hql);
		q.setParameter("id", id);
		int r = q.executeUpdate();
    	session.getTransaction().commit();
	}
	
	public static List<Usuario> getUsuariosActivos() // Ejemplo de metodo para traer datos por HQL
	{	   
		ConfigHibernate config= new ConfigHibernate();
		Session session=config.abrirConexion();
    	Criteria cr = session.createCriteria(Usuario.class);
    	cr.add(Restrictions.eq("estado", true));
    	List<Usuario> results = cr.list();    	
    	return results;
	}
	
	


}
