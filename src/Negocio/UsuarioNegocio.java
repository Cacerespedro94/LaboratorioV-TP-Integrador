package Negocio;

import java.util.List;

import org.hibernate.Session;

import DAO.UsuarioDAO;
import Entidad.Provincia;
import Entidad.Usuario;
import InterfacesNegocio.UsuarioInterfazNegocio;
import entidades.Cliente;

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
	
	public Usuario getUsuarioxId(int id) {
		 
		return usuarioDao.getUsuarioXid(id);
	}

	@Override
	public Usuario getUsuarioLogueado() {
		return usuarioLogueado;
	}

	@Override
	public void setUsuarioLogueado(Usuario usuarioLogueado) {
		UsuarioNegocio.usuarioLogueado = usuarioLogueado;
	}

	@Override
	public Usuario getUsuarioByNombreUsuario(String usuario) {
		Usuario _usuario = (Usuario) usuarioDao.getUsuarioByNombreUsuario(usuario);
		return _usuario;
	}

	@Override
	public boolean GuardarUsuario(Usuario usuarioNuevo) {
		usuarioDao.guardarUsuario(usuarioNuevo);
		return true;
	}

	@Override
	public List<Usuario> getUsuariosActivos() {
		return usuarioDao.getUsuariosActivos();
	}
	
	@Override
	public void modificarUsuario (Usuario user) {
		dao.modificarUsuario(user);
	}
	
	 public Usuario parametrizarUsuario(int id, String nombre, String apellido, String dni,
				String fecha, String sexo, String provincia, String localidad,
				String domicilio, String telefono, String cuil, String email) {
	    	
	    	Usuario u = usuarioDao.getUsuarioXid(id);
	    	Provincia nuevaProvincia = new Provincia();
	    	
	    	
	    	if (nombre != null) u.setNombre(nombre);
	    	if (apellido != null) u.setApellido(apellido);
	    	if (dni != null) u.setDni(dni);
	    	if (fecha != null) u.setFechaNacimiento(fecha);
	    	if (sexo != null) u.setSexo(sexo);
	    	if (provincia != null) nuevaProvincia.setNombre(provincia);
	    	u.setProvincia(nuevaProvincia);
	    	if (localidad != null) u.setLocalidad(localidad);
	    	if (domicilio != null) u.setDireccion(domicilio);
	    	if (telefono != null) u.setTelefono(telefono);
	    	if (email != null) u.setEmail(email);
	    	
			return u; 
	    }
	 
	 public boolean validarUsuario(String nombre, String apellido, String dni,
				String fecha, String sexo, String provincia, String localidad,
				String domicilio, String telefono, String cuil, String email) {
	    	  
	    	if (nombre == null) return false;
	    	if (apellido == null) return false;
	    	if (dni == null) return false;
	    	if (fecha == null) return false;
	    	if (sexo == null) return false;
	    	if (provincia == null) return false;
	    	if (localidad == null) return false;
	    	if (domicilio == null) return false;
	    	if (telefono == null) return false;
	    	if (cuil == null) return false;
	    	if (email == null) return false;
	    	
			return true; 
	    }


}
