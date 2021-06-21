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
	private LocalDate fechaCreacion;
	@Column(name="codTipoCuenta")
	private int codTipoCuenta;
	@Column(name="saldo")
	private float saldo;
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


	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(LocalDate fechaCreacion) {
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
