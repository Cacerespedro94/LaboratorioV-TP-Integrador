package Entidad;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Cuentas implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int nroCuenta;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="Usuario")
	private Usuario usuario;
	private String cbu;
	private String fechaCreacion;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="idTipoCuenta")
	private TipoCuenta tipoCuenta=new TipoCuenta();
	
	private boolean estado;
	private float saldo;
	
	





	@Override
	public String toString() {
		return "Cuentas [nroCuenta=" + nroCuenta + ", usuario=" + usuario + ", cbu=" + cbu + ", fechaCreacion="
				+ fechaCreacion + ", tipoCuenta=" + tipoCuenta + ", estado=" + estado + ", saldo=" + saldo + "]";
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public TipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}


	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public int getNroCuenta() {
		return nroCuenta;
	}



	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
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



	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}



	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public Cuentas() {
		
	}
}
