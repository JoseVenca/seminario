package iqsoftware.dominio;

import java.time.LocalDate;

public class Granja {
	
	private int id_granja;
	private String Nombre;
	private LocalDate fecha_ingreso;
	private String cuit;
	private String telefono;
	private int crianza;
	private int id_usuario;
	public int getId_granja() {
		return id_granja;
	}
	public void setId_granja(int id_granja) {
		this.id_granja = id_granja;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public LocalDate getFecha_ingreso() {
		return fecha_ingreso;
	}
	public void setFecha_ingreso(LocalDate fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getCrianza() {
		return crianza;
	}
	public void setCrianza(int crianza) {
		this.crianza = crianza;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	public Granja(String nombre, LocalDate fecha_ingreso, String cuit, String telefono, int crianza,
			int id_usuario) {
		super();
	
		this.Nombre = nombre;
		this.fecha_ingreso = fecha_ingreso;
		this.cuit = cuit;
		this.telefono = telefono;
		this.crianza = crianza;
		this.id_usuario = id_usuario;
	}
	public Granja() {
		super();
	}
	
	public Granja(String nombre, LocalDate fecha_ingreso, String cuit, String telefono, int crianza) {
		super();
		
		this.Nombre = nombre;
		this.fecha_ingreso = fecha_ingreso;
		this.cuit = cuit;
		this.telefono = telefono;
		this.crianza = crianza;
		
	}
	
	public Granja(String cuit) {
		super();
		
		
		this.cuit = cuit;
	}
	
	@Override
	public String toString() {
		return "Granja [Nombre=" + Nombre + ", fecha_ingreso=" + fecha_ingreso + ", cuit=" + cuit + ", telefono="
				+ telefono + ", crianza=" + crianza + "]";
	}
	
	

}
