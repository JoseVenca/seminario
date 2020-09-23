package iqsoftware.dominio;

import java.sql.Date;
import java.time.LocalDate;

public class Empleados extends Fecha{

	private int id_empleados;
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	private String email;
	private String sector;
	private int id_usuario;
	

	public Empleados() {
		super();
	}
	
	

	public Empleados(String dni) {
		super();
		this.dni = dni;
	}
	
	

	public Empleados(String nombre, String apellido, String dni, String telefono, String email, String sector) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.sector = sector;
	}



	public Empleados(String nombre, String apellido, String dni, String telefono, String email,
			String sector, int id_usuario, String estado, String faltas, Date fecha, String comentario, int id_empleados) {
		super(estado, faltas, fecha, comentario, id_empleados);
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.sector = sector;
		this.id_usuario = id_usuario;
	
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
	
	public int getId_empleados() {
		return id_empleados;
	}

	public void setId_empleados(int id_empleados) {
		this.id_empleados = id_empleados;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	


	@Override
	public String toString() {
		return "nombre:" + nombre + ", apellido:" + apellido + ", dni:"
				+ dni + ", getEstado()=" + getEstado() + ", getFaltas()="
				+ getFaltas() + ", getFecha()=" + getFecha() + ", getComentario()=" + getComentario() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}