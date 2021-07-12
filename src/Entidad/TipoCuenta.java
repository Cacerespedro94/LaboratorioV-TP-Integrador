package Entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoCuenta")
public class TipoCuenta  implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TipoDeCuenta")
	private int nroTipoDeCuenta;
	private String descripcion;
	
	public TipoCuenta() {
		// TODO Auto-generated constructor stub
	}
	public TipoCuenta(String descripcion) {
		this.descripcion=descripcion;
	}


	public int getNroTipoDeCuenta() {
		return nroTipoDeCuenta;
	}

	public void setNroTipoDeCuenta(int nroTipoDeCuenta) {
		this.nroTipoDeCuenta = nroTipoDeCuenta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoCuenta [nroTipoDeCuenta=" + nroTipoDeCuenta + ", descripcion=" + descripcion + "]";
	}

}
