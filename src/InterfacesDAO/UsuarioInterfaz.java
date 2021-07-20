package InterfacesDAO;

import Entidad.Usuario;

public interface UsuarioInterfaz {
	 
    public boolean altaUsuario (Usuario user);

	public Usuario getUsuarioXid (int id);

	public void modificarUsuario (Usuario user);

	public void eliminarUsuario (Usuario user);
}
