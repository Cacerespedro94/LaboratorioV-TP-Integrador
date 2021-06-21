package Entidad;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
@Entity
@Table(name="Usuarios")
public class Usuario implements Serializable {
	
		private static final long serialVersionUID = 1L;
		@Id
		@Column(name="nombreUsuario")
		private String nombreUsuario;
		@Column(name="contrasena")
		private String contrasena;
		@Column(name="codTipoUsuario")
		private int codTipoUsuario;
		@Column(name="dni")
		private int dni;
		@Column(name="cuil")
		private int cuil;
		@Column(name="sexo")
		private String sexo;
		@Column(name="nacionalidad")
		private String nacionalidad;
		@Column(name="fechaNacimiento")
		private LocalDate fechaNacimiento;
		@Column(name="direccion")
		private String direccion;
		@Column(name="localidad")
		private String localidad;
		@Column(name="provincia")
		private String provincia;
		@Column(name="email")
		private String email;
		@Column(name="telefono")
		private int telefono;
		@Column(name="nombre")
		private String nombre;
		@Column(name="apellido")
		private String apellido;
		@Column(name="estado")
		private int estado;
		
		public Usuario() {
			
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

		public int getCodTipoUsuario() {
			return codTipoUsuario;
		}

		public void setCodTipoUsuario(int codTipoUsuario) {
			this.codTipoUsuario = codTipoUsuario;
		}

		public int getDni() {
			return dni;
		}

		public void setDni(int dni) {
			this.dni = dni;
		}

		public int getCuil() {
			return cuil;
		}

		public void setCuil(int cuil) {
			this.cuil = cuil;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public String getNacionalidad() {
			return nacionalidad;
		}

		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}

		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(LocalDate fechaNacimiento) {
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

		public String getProvincia() {
			return provincia;
		}

		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
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

		public int getEstado() {
			return estado;
		}

		public void setEstado(int estado) {
			this.estado = estado;
		}

		@Override
		public String toString() {
			return "Usuario [nombreUsuario=" + nombreUsuario + ", contrasena=" + contrasena + ", codTipoUsuario="
					+ codTipoUsuario + ", dni=" + dni + ", cuil=" + cuil + ", sexo=" + sexo + ", nacionalidad="
					+ nacionalidad + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion
					+ ", localidad=" + localidad + ", provincia=" + provincia + ", email=" + email + ", telefono="
					+ telefono + ", nombre=" + nombre + ", apellido=" + apellido + ", estado=" + estado + "]";
		}		
	}