package Negocio;

import java.util.List;

import org.hibernate.Session;

import DAO.ConfigHibernate;
import DAO.UsuarioDAO;
import Entidad.Cuentas;
import Entidad.Usuario;

public class UsuarioNegocio {
	
    UsuarioDAO dao = new UsuarioDAO();
	
	public boolean altaUsuario(Usuario usuario) {
		if(dao.altaUsuario(usuario))return true;
		else return false;
	}

	public List<Usuario> getUsuariosActivos() {
		List<Usuario> listaUsuarios = dao.getUsuariosActivos();
		return listaUsuarios;
	}
	
	public void modificarUsuario(Usuario user) {
		dao.modificarUsuario(user);
	}

	public void eliminarUsuario(Usuario user) {
		dao.eliminarUsuario(user);
	}
	
	public Usuario getUsuarioXid (int id)
	{	
		return dao.getUsuarioXid(id);
	}
	


}
