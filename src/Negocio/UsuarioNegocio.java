package Negocio;

import DAO.UsuarioDAO;

import Entidad.Usuario;

public class UsuarioNegocio {
	
	public boolean altaUsuario(Usuario usuario) {
		
		UsuarioDAO dao=new UsuarioDAO();
		if(dao.altaUsuario(usuario))return true;
		else return false;
		
	}


}
