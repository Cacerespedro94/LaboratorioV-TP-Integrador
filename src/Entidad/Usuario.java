package Entidad;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
@Table(name="Usuarios")
public class Usuario implements Serializable {
	
		private static final long serialVersionUID = 1L;
		@Id
		private String nombreUsuario;
		private String contrasena;
		@ManyToOne(cascade = {CascadeType.ALL})
		@JoinColumn(name="TipoUsuario")
		private TipoUsuario tipoUsuario;
		private String dni;
		private String cuil;
		private String sexo;
		private String fechaNacimiento;
		private String direccion;
		private String localidad;	
		@ManyToOne(cascade = {CascadeType.ALL})
		@JoinColumn(name="idProvincia")
		private Provincia provincia;
		private String email;
		private String telefono;	
		private String nombre;	
		private String apellido;		
		private boolean estado;
		
		
		public Usuario() {
			
		}



		public Usuario(String nombreUsuario, String contrasena, TipoUsuario tipoUsuario, String dni, String cuil,
				String sexo, String fechaNacimiento, String direccion, String localidad, Provincia provincia,
				String email, String telefono, String nombre, String apellido, boolean estado) {
			super();
			this.nombreUsuario = nombreUsuario;
			this.contrasena = contrasena;
			this.tipoUsuario = tipoUsuario;
			this.dni = dni;
			this.cuil = cuil;
			this.sexo = sexo;
			this.fechaNacimiento = fechaNacimiento;
			this.direccion = direccion;
			this.localidad = localidad;
			this.provincia = provincia;
			this.email = email;
			this.telefono = telefono;
			this.nombre = nombre;
			this.apellido = apellido;
			this.estado = estado;
		}






		@Override
		public String toString() {
			return "Usuario [nombreUsuario=" + nombreUsuario + ", contrasena=" + contrasena + ", tipoUsuario="
					+ tipoUsuario + ", dni=" + dni + ", cuil=" + cuil + ", sexo=" + sexo + ", fechaNacimiento="
					+ fechaNacimiento + ", direccion=" + direccion + ", localidad=" + localidad + ", provincia="
					+ provincia + ", email=" + email + ", telefono=" + telefono + ", nombre=" + nombre + ", apellido="
					+ apellido + ", estado=" + estado + "]";
		}

		public TipoUsuario getTipoUsuario() {
			return tipoUsuario;
		}


		public void setTipoUsuario(TipoUsuario tipoUsuario) {
			this.tipoUsuario = tipoUsuario;
		}



		public Provincia getProvincia() {
			return provincia;
		}


		public void setProvincia(Provincia provincia) {
			this.provincia = provincia;
		}


		public String getNombreUsuario() {
			return nombreUsuario;
		}

		public void setNombreUsuario(String nombreUsuario) {
			this.nombreUsuario = nombreUsuario;
		}

		public String getContrasena() {
			return contrasena;
		}

		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}

		public String getDni() {
			return dni;
		}


		public void setDni(String dni) {
			this.dni = dni;
		}

		public String getCuil() {
			return cuil;
		}

		public void setCuil(String cuil) {
			this.cuil = cuil;
		}


		public String getTelefono() {
			return telefono;
		}


		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}


		public boolean isEstado() {
			return estado;
		}


		public void setEstado(boolean estado) {
			this.estado = estado;
		}


		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}



		public String getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(String fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getLocalidad() {
			return localidad;
		}

		public void setLocalidad(String localidad) {
			this.localidad = localidad;
		}



		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}



		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}



	}