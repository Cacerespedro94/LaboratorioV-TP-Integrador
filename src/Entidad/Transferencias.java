package Entidad;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
	private String CBU_Emisor;
	private String CBU_Receptor;
	private String Fecha;
	private float Monto;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="Movimiento")
	private Movimientos movimiento;
	
	public Movimientos getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(Movimientos movimiento) {
		this.movimiento = movimiento;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public int getID_Transferencia() {
		return ID_Transferencia;
	}
	public void setID_Transferencia(int iD_Transferencia) {
		ID_Transferencia = iD_Transferencia;
	}
	public String getCBU_Emisor() {
		return CBU_Emisor;
	}
	public void setCBU_Emisor(String cBU_Emisor) {
		CBU_Emisor = cBU_Emisor;
	}
	public String getCBU_Receptor() {
		return CBU_Receptor;
	}
	public void setCBU_Receptor(String cBU_Receptor) {
		CBU_Receptor = cBU_Receptor;
	}
	public float getMonto() {
		return Monto;
	}
	public void setMonto(float monto) {
		Monto = monto;
	}
	
	public Transferencias(String cBU_Emisor, String cBU_Receptor, float monto) {

		
		CBU_Emisor = cBU_Emisor;
		CBU_Receptor = cBU_Receptor;
		Monto = monto;
	}
	@Override
	public String toString() {
		return "Transferencias [ID_Transferencia=" + ID_Transferencia + ", CBU_Emisor=" + CBU_Emisor + ", CBU_Receptor="
				+ CBU_Receptor + ", Monto=" + Monto + "]";
	}
	
	
	
}
