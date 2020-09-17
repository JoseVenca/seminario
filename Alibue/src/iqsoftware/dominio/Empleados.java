package iqsoftware.dominio;

public class Empleados {

	private int id_empleados;
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	private String email;
	private String sector;
	private String estado;
	private String comentario;
	private int id_usuario;
	

	public Empleados() {
		super();
	}
	
	

	public Empleados(String dni) {
		super();
		this.dni = dni;
	}
	
	

	public Empleados(String nombre, String apellido, String dni, String telefono, String email, String sector,
			String estado, String comentario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.sector = sector;
		this.estado = estado;
		this.comentario = comentario;
	}



	public Empleados(String nombre, String apellido, String dni, String telefono, String email,
			String sector, String estado, String comentario, int id_usuario) {
		super();
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.sector = sector;
		this.estado = estado;
		this.comentario = comentario;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
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
		return "Empleados [ nombre=" + nombre + ", apellido=" + apellido + ", dni="
				+ dni + ", telefono=" + telefono + ", email=" + email + ", sector=" + sector + ", estado=" + estado
				+ ", comentario=" + comentario + "]";
	}

}