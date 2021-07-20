package DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import DAO.ConfigHibernate;
import Entidad.Usuario;
import InterfacesDAO.UsuarioInterfaz;



public class UsuarioDAO implements UsuarioInterfaz {


	private static ConfigHibernate ch;

	public ConfigHibernate getCh() {
		return ch;
	}

	public void setCh(ConfigHibernate ch) {
		this.ch = ch;
	}

	public UsuarioDAO() {

	}

	@Override
	public Usuario getUsuarioByNombreUsuario(String usuario)
	{
		String hql = "FROM Usuario WHERE nombre = :usuario";
		Session session = ch.getConexion();
		Query q = session.createQuery(hql);
		q.setParameter("usuario", usuario);
		Usuario _usuario = (Usuario) q.uniqueResult();

		return _usuario;
	}

	@Override
	public void guardarUsuario (Usuario usuarioNuevo)
    {
    	Session session = ch.getConexion();
		session.beginTransaction();
    	session.save(usuarioNuevo);
    	session.getTransaction().commit();

    }

	@Override
	public List<Usuario> getUsuariosActivos() {
		Session session=ch.abrirConexion();
    	Criteria cr = session.createCriteria(Usuario.class);
    	cr.add(Restrictions.eq("estado", false));
    	List<Usuario> results = cr.list();
    	return results;
	}

	@Override
    public boolean altaUsuario (Usuario user)
    {

			Session session = ch.abrirConexion();
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
		Session session = ch.abrirConexion();
		return (Usuario)session.get(Usuario.class,id);
	}


	@Override
	public void modificarUsuario (Usuario user) {

		Session session = ch.abrirConexion();
		session.beginTransaction();
    	session.update(user);
    	session.getTransaction().commit();
	}

	@Override
	public void eliminarUsuario (Usuario user) {

		Session session=ch.abrirConexion();
		int id = user.getId();
		String hql = "UPDATE Usuario SET estado = false WHERE id = :id";
		Query q = session.createQuery(hql);
		q.setParameter("id", id);
		int r = q.executeUpdate();
    	session.getTransaction().commit();
	}

	


}
