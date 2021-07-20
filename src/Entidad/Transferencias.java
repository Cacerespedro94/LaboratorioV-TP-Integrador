package Entidad;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Transferencias")
public class Transferencias implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int ID_Transferencia;
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="id_cuenta_origen")
	private Cuentas CuentaOrigen; 
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="id_cuenta_destino")
	private Cuentas CuentaDestino; 
	private String Fecha;
	private String Detalle;
	private float Monto;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="Movimiento")
	private Movimientos movimiento;
	
	
	
	
	public Transferencias(int iD_Transferencia, Cuentas cuentaOrigen, Cuentas cuentaDestino, String fecha,
			String detalle, float monto, Movimientos movimiento) {
		super();
		ID_Transferencia = iD_Transferencia;
		CuentaOrigen = cuentaOrigen;
		CuentaDestino = cuentaDestino;
		Fecha = fecha;
		Detalle = detalle;
		Monto = monto;
		this.movimiento = movimiento;
	}
	
	
	public int getID_Transferencia() {
		return ID_Transferencia;
	}
	public void setID_Transferencia(int iD_Transferencia) {
		ID_Transferencia = iD_Transferencia;
	}
	public Cuentas getCuentaOrigen() {
		return CuentaOrigen;
	}
	public void setCuentaOrigen(Cuentas cuentaOrigen) {
		CuentaOrigen = cuentaOrigen;
	}
	public Cuentas getCuentaDestino() {
		return CuentaDestino;
	}
	public void setCuentaDestino(Cuentas cuentaDestino) {
		CuentaDestino = cuentaDestino;
	}
	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		this.Fecha = fecha;
	}
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
	public float getMonto() {
		return Monto;
	}
	public void setMonto(float monto) {
		Monto = monto;
	}
	public Movimientos getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(Movimientos movimiento) {
		this.movimiento = movimiento;
	}


	@Override
	public String toString() {
		return "Transferencias [ID_Transferencia=" + ID_Transferencia + ", CuentaOrigen=" + CuentaOrigen
				+ ", CuentaDestino=" + CuentaDestino + ", Fecha=" + Fecha + ", Detalle=" + Detalle + ", Monto=" + Monto
				+ ", movimiento=" + movimiento + "]";
	}
	
	
	
	
	
}
