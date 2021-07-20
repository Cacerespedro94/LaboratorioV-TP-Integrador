package DAO;

import org.hibernate.Session;

import Entidad.Usuario;
import InterfacesDAO.UsuarioInterfaz;

public class UsuarioDAO implements UsuarioInterfaz {

	public UsuarioDAO() {

	}
	
	@Override
    public void altaUsuario (Usuario user)
    {
		ConfigHibernate config=new ConfigHibernate();
		Session session=config.abrirConexion();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
    }


}
