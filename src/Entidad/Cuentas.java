package Entidad;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cuentas")
public class Cuentas implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="nroCuenta")
	private int nroCuenta;
	@Id
	@Column(name="nombreUsuario")
	private String nombreUsuario;
	@Column(name="cbu")
	private String cbu;
	@Column(name="fechaCreacion")
	private String fechaCreacion;
	@Column(name="codTipoCuenta")
	private int codTipoCuenta;
	@Column(name="saldo")
	private float saldo;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cbu == null) ? 0 : cbu.hashCode());
		result = prime * result + codTipoCuenta;
		result = prime * result + estado;
		result = prime * result + ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
		result = prime * result + ((nombreUsuario == null) ? 0 : nombreUsuario.hashCode());
		result = prime * result + nroCuenta;
		result = prime * result + Float.floatToIntBits(saldo);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuentas other = (Cuentas) obj;
		if (cbu == null) {
			if (other.cbu != null)
				return false;
		} else if (!cbu.equals(other.cbu))
			return false;
		if (codTipoCuenta != other.codTipoCuenta)
			return false;
		if (estado != other.estado)
			return false;
		if (fechaCreacion == null) {
			if (other.fechaCreacion != null)
				return false;
		} else if (!fechaCreacion.equals(other.fechaCreacion))
			return false;
		if (nombreUsuario == null) {
			if (other.nombreUsuario != null)
				return false;
		} else if (!nombreUsuario.equals(other.nombreUsuario))
			return false;
		if (nroCuenta != other.nroCuenta)
			return false;
		if (Float.floatToIntBits(saldo) != Float.floatToIntBits(other.saldo))
			return false;
		return true;
	}


	@Column(name="estado")
	private int estado;
	

	@Override
	public String toString() {
		return "Cuentas [nroCuenta=" + nroCuenta + ", nombreUsuario=" + nombreUsuario + ", cbu=" + cbu
				+ ", fechaCreacion=" + fechaCreacion + ", codTipoCuenta=" + codTipoCuenta + ", saldo=" + saldo
				+ ", estado=" + estado + "]";
	}


	public int getNroCuenta() {
		return nroCuenta;
	}


	public Cuentas(int nroCuenta, String nombreUsuario, String cbu, String fechaCreacion, int codTipoCuenta,
			float saldo, int estado) {
		super();
		this.nroCuenta = nroCuenta;
		this.nombreUsuario = nombreUsuario;
		this.cbu = cbu;
		this.fechaCreacion = fechaCreacion;
		this.codTipoCuenta = codTipoCuenta;
		this.saldo = saldo;
		this.estado = estado;
	}


	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getCbu() {
		return cbu;
	}


	public void setCbu(String cbu) {
		this.cbu = cbu;
	}


	public String getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public int getCodTipoCuenta() {
		return codTipoCuenta;
	}


	public void setCodTipoCuenta(int codTipoCuenta) {
		this.codTipoCuenta = codTipoCuenta;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	public Cuentas() {
		
	}
}
