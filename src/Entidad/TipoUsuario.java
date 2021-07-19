package Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TipoUsuario {
	@Id
	@GeneratedValue
	private int idTipoUsuario;
	private String Descripcion;
	
	public TipoUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TipoUsuario [idTipoUsuario=" + idTipoUsuario + ", Descripcion=" + Descripcion + "]";
	}
	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

}
