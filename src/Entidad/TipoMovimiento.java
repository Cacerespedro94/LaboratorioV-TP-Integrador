package Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoMovimiento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TipoMovimiento")
	private int idTipoMovimiento;
	private String Descripcion;
	public TipoMovimiento() {
		super();

	}
	@Override
	public String toString() {
		return "TipoMovimiento [idTipoMovimiento=" + idTipoMovimiento + ", Descripcion=" + Descripcion + "]";
	}
	public int getIdTipoMovimiento() {
		return idTipoMovimiento;
	}
	public void setIdTipoMovimiento(int idTipoMovimiento) {
		this.idTipoMovimiento = idTipoMovimiento;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

}
