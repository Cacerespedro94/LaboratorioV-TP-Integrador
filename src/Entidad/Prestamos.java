package Entidad;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Prestamos")
public class Prestamos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="nroPrestamo")
	private int nroPrestamo;
	@Column(name="nombreUsuario")
	private String nombreUsuario;
	@Column(name="cbu")
	private String cbu;
	@Column(name="fecha")
	private LocalDate fecha;
	@Column(name="importeConIntereses")
	private float importeConIntereses;
	@Column(name="importePedido")
	private float importePedido;
	@Column(name="plazoMeses")
	private int plazoMeses;
	@Column(name="montoMensual")
	private float montoMensual;
	@Column(name="cantidadCuotas")
	private int cantidadCuotas;
	@Column(name="codEstadoPrestamo")
	private int codEstadoPrestamo;
	
	public Prestamos() {
		// TODO Auto-generated constructor stub
	}

	public int getNroPrestamo() {
		return nroPrestamo;
	}

	public void setNroPrestamo(int nroPrestamo) {
		this.nroPrestamo = nroPrestamo;
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

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public float getImporteConIntereses() {
		return importeConIntereses;
	}

	public void setImporteConIntereses(float importeConIntereses) {
		this.importeConIntereses = importeConIntereses;
	}

	public float getImportePedido() {
		return importePedido;
	}

	public void setImportePedido(float importePedido) {
		this.importePedido = importePedido;
	}

	public int getPlazoMeses() {
		return plazoMeses;
	}

	public void setPlazoMeses(int plazoMeses) {
		this.plazoMeses = plazoMeses;
	}

	public float getMontoMensual() {
		return montoMensual;
	}

	public void setMontoMensual(float montoMensual) {
		this.montoMensual = montoMensual;
	}

	public int getCantidadCuotas() {
		return cantidadCuotas;
	}

	public void setCantidadCuotas(int cantidadCuotas) {
		this.cantidadCuotas = cantidadCuotas;
	}

	public int getCodEstadoPrestamo() {
		return codEstadoPrestamo;
	}

	public void setCodEstadoPrestamo(int codEstadoPrestamo) {
		this.codEstadoPrestamo = codEstadoPrestamo;
	}

	@Override
	public String toString() {
		return "Prestamos [nroPrestamo=" + nroPrestamo + ", nombreUsuario=" + nombreUsuario + ", cbu=" + cbu
				+ ", fecha=" + fecha + ", importeConIntereses=" + importeConIntereses + ", importePedido="
				+ importePedido + ", plazoMeses=" + plazoMeses + ", montoMensual=" + montoMensual + ", cantidadCuotas="
				+ cantidadCuotas + ", codEstadoPrestamo=" + codEstadoPrestamo + "]";
	}
	


}
