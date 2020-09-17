package iqsoftware.dominio;

public class Usuario {
	
	private int id_usuario;
	private String username;
	private String password;
	private String dni;
	private String Pregunta1;
	private String respuesta1;
	private String Pregunta2;
	private String respuesta2;
	
	public Usuario() {
		super();
	}
	
	
	public Usuario(String dni) {
		super();
		this.dni = dni;
	}

	public Usuario(String username, String password, String dni) {
		super();
		this.username = username;
		this.password = password;
		this.dni = dni;
	}

	public Usuario(String username, String password, String dni, String pregunta1, String respuesta1,
			String pregunta2, String respuesta2) {
		super();

		this.username = username;
		this.password = password;
		this.dni = dni;
		Pregunta1 = pregunta1;
		this.respuesta1 = respuesta1;
		Pregunta2 = pregunta2;
		this.respuesta2 = respuesta2;
	}



	public int getId_usuario() {
		return id_usuario;
	}



	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getPregunta1() {
		return Pregunta1;
	}



	public void setPregunta1(String pregunta1) {
		Pregunta1 = pregunta1;
	}



	public String getRespuesta1() {
		return respuesta1;
	}



	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}



	public String getPregunta2() {
		return Pregunta2;
	}



	public void setPregunta2(String pregunta2) {
		Pregunta2 = pregunta2;
	}



	public String getRespuesta2() {
		return respuesta2;
	}



	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}
	
	
	
	
	
	
	

}
