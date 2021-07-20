package InterfacesDAO;

import java.util.List;

import Entidad.Usuario;

public interface UsuarioInterfaz {
	 
    public boolean altaUsuario (Usuario user);

	public Usuario getUsuarioXid (int id);

	public void modificarUsuario (Usuario user);

	public void eliminarUsuario (Usuario user);
	
	public Usuario getUsuarioByNombreUsuario(String usuario);
	
	public void guardarUsuario (Usuario usuarioNuevo);
	
	public List<Usuario> getUsuariosActivos();
}
