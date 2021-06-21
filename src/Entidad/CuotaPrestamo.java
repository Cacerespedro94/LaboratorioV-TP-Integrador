package Entidad;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CuotaPrestamo")
public class CuotaPrestamo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="nroPrestamo")
	private int nroPrestamo;
	@Column(name="nroCuota")
	private int nroCuota;
	@Column(name="nombreUsuario")
	private String nombreUsuario;
	@Column(name="fecha")
	private LocalDate fecha;
	@Column(name="importe")
	private float importe;
	@Column(name="estado")
	private int estado;

	 public CuotaPrestamo() {
		// TODO Auto-generated constructor stub
	}

	public int getNroPrestamo() {
		return nroPrestamo;
	}

	public void setNroPrestamo(int nroPrestamo) {
		this.nroPrestamo = nroPrestamo;
	}

	public int getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "CuotaPrestamo [nroPrestamo=" + nroPrestamo + ", nroCuota=" + nroCuota + ", nombreUsuario="
				+ nombreUsuario + ", fecha=" + fecha + ", importe=" + importe + ", estado=" + estado + "]";
	}
	 
}
