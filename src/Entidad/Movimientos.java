package Entidad;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Movimientos")
public class Movimientos implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="nroMovimiento")
	private int nroMovimiento;
	@Column(name="nroCuenta")
	private int nroCuenta;
	@Column(name="fecha")
	private String fecha;
	@Column(name="detalle")
	private String detalle;
	@Column(name="importe")
	private float importe;
	@Column(name="tipoMovimiento")
	private int tipoMovimiento;
	@Column(name="cbuDestino")
	private String cbuDestino;
	
	public Movimientos() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNroMovimiento() {
		return nroMovimiento;
	}
	public void setNroMovimiento(int nroMovimiento) {
		this.nroMovimiento = nroMovimiento;
	}
	public int getNroCuenta() {
		return nroCuenta;
	}
	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	public int getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(int tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public String getCbuDestino() {
		return cbuDestino;
	}
	public void setCbuDestino(String cbuDestino) {
		this.cbuDestino = cbuDestino;
	}
	
	
	public Movimientos(int nroCuenta, String fecha, String detalle, float importe,
			int tipoMovimiento, String cbuDestino) {
		super();
		this.nroCuenta = nroCuenta;
		this.fecha = fecha;
		this.detalle = detalle;
		this.importe = importe;
		this.tipoMovimiento = tipoMovimiento;
		this.cbuDestino = cbuDestino;
	}

	@Override
	public String toString() {
		return "Movimientos [nroMovimiento=" + nroMovimiento + ", nroCuenta=" + nroCuenta + ", fecha=" + fecha
				+ ", detalle=" + detalle + ", importe=" + importe + ", tipoMovimiento=" + tipoMovimiento
				+ ", cbuDestino=" + cbuDestino + "]";
	}
}