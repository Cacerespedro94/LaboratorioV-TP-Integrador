package InterfacesNegocio;


import Entidad.Usuario;

public interface UsuarioInterfazNegocio {
	
	public boolean altaUsuario(Usuario usuario);
	
	public Usuario getUsuarioLogueado();

	public void setUsuarioLogueado(Usuario usuarioLogueado);

	public Usuario getUsuarioByNombreUsuario(String usuario);
	
    public boolean GuardarUsuario(Usuario usuarioNuevo);
	
}
