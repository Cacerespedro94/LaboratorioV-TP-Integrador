package Entidad;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Movimientos")
public class Movimientos implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int nroMovimiento;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="CuentaOrigen")
	private Cuentas cuentaOrigen=new Cuentas();
	private String fecha;
	private String detalle;
	private float importe;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="CuentaDestino")
	private Cuentas cuentaDestino=new Cuentas();
	
	public Movimientos() {
		// TODO Auto-generated constructor stub
	}
	
	public Cuentas getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(Cuentas cuenta) {
		this.cuentaOrigen = cuenta;
	}

	public Cuentas getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(Cuentas cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public int getNroMovimiento() {
		return nroMovimiento;
	}
	public void setNroMovimiento(int nroMovimiento) {
		this.nroMovimiento = nroMovimiento;
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

	@Override
	public String toString() {
		return "Movimientos [nroMovimiento=" + nroMovimiento + ", cuentaOrigen=" + cuentaOrigen + ", fecha=" + fecha
				+ ", detalle=" + detalle + ", importe=" + importe + ", cuentaDestino=" + cuentaDestino + "]";
	}
	

}
