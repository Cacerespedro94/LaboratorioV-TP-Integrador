package Negocio;

import java.util.List;


import DAO.UsuarioDAO;
import Entidad.Usuario;
import InterfacesNegocio.UsuarioInterfazNegocio;

public class UsuarioNegocio implements UsuarioInterfazNegocio{


	static UsuarioDAO usuarioDao;
	static Usuario usuarioLogueado;

	public UsuarioDAO getUsuarioDao() {
		return usuarioDao;
	}

	UsuarioDAO dao = new UsuarioDAO();

	@Override
	public boolean altaUsuario(Usuario usuario) {
		if(dao.altaUsuario(usuario))return true;
		else return false;
	}

	@Override
	public Usuario getUsuarioLogueado() {
		// TODO Auto-generated method stub
		return usuarioLogueado;
	}

	@Override
	public void setUsuarioLogueado(Usuario usuarioLogueado) {
		// TODO Auto-generated method stub
		UsuarioNegocio.usuarioLogueado = usuarioLogueado;
	}

	@Override
	public Usuario getUsuarioByNombreUsuario(String usuario) {
		// TODO Auto-generated method stub
		Usuario _usuario = (Usuario) usuarioDao.getUsuarioByNombreUsuario(usuario);
		return _usuario;
	}

	@Override
	public boolean GuardarUsuario(Usuario usuarioNuevo) {
		// TODO Auto-generated method stub
		usuarioDao.guardarUsuario(usuarioNuevo);
		return true;
	}


}
