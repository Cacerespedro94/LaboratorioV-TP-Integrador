package Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pais {
	
	@Id
	@GeneratedValue
	private int idPais;
	private String Nombre;
	
	public int getIdPais() {
		return idPais;
	}
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	@Override
	public String toString() {
		return "Pais [idPais=" + idPais + ", Nombre=" + Nombre + "]";
	}
	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}
}
