package iqsoftware.dominio;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;

public class Gestion {
	
	private int id_gestion;
	private Date fecha_ingreso;
	private Date fecha_egreso;
	private int Neto;
	private int Bruto;
	private int Tara;
	private int cant_jaula;
	private int cant_jaulav;
	private int cant_polloj;
	private float promedio;
	private int total_carga;
	private int id_usuario;
	private int id_granja;
	

	public Gestion(Date fecha_ingreso, Date fecha_egreso, int neto, int bruto, int tara, int cant_jaula,
			int cant_jaulav, int cant_polloj, float promedio, int total_carga,int id_usuario, int id_granja) {
		super();
		
		this.fecha_ingreso = fecha_ingreso;
		this.fecha_egreso = fecha_egreso;
		Neto = neto;
		Bruto = bruto;
		Tara = tara;
		this.cant_jaula = cant_jaula;
		this.cant_jaulav = cant_jaulav;
		this.cant_polloj = cant_polloj;
		this.promedio = promedio;
		this.total_carga = total_carga;
		this.id_usuario = id_usuario;
		this.id_granja = id_granja;
	}
	


	public int getId_gestion() {
		return id_gestion;
	}

	public void setId_gestion(int id_gestion) {
		this.id_gestion = id_gestion;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Date getFecha_egreso() {
		return fecha_egreso;
	}

	public void setFecha_egreso(Date fecha_egreso) {
		this.fecha_egreso = fecha_egreso;
	}

	public int getNeto() {
		return Neto;
	}

	public void setNeto(int neto) {
		Neto = neto;
	}

	public int getBruto() {
		return Bruto;
	}

	public void setBruto(int bruto) {
		Bruto = bruto;
	}

	public int getTara() {
		return Tara;
	}

	public void setTara(int tara) {
		Tara = tara;
	}

	public int getCant_jaula() {
		return cant_jaula;
	}

	public void setCant_jaula(int cant_jaula) {
		this.cant_jaula = cant_jaula;
	}

	public int getCant_jaulav() {
		return cant_jaulav;
	}

	public void setCant_jaulav(int cant_jaulav) {
		this.cant_jaulav = cant_jaulav;
	}

	public int getCant_polloj() {
		return cant_polloj;
	}

	public void setCant_polloj(int cant_polloj) {
		this.cant_polloj = cant_polloj;
	}

	public float getPromedio() {
		return promedio;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	public int getTotal_carga() {
		return total_carga;
	}

	public void setTotal_carga(int total_carga) {
		this.total_carga = total_carga;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getId_granja() {
		return id_granja;
	}

	public void setId_granja(int id_granja) {
		this.id_granja = id_granja;
	}

	@Override
	public String toString() {
		return "Gestion [id_gestion=" + id_gestion + ", fecha_ingreso=" + fecha_ingreso + ", fecha_egreso="
				+ fecha_egreso + ", Neto=" + Neto + ", Bruto=" + Bruto + ", Tara=" + Tara + ", cant_jaula=" + cant_jaula
				+ ", cant_jaulav=" + cant_jaulav + ", cant_polloj=" + cant_polloj + ", promedio=" + promedio
				+ ", total_carga=" + total_carga + ", id_usuario=" + id_usuario + ", id_granja=" + id_granja + "]";
	}
	
	
	

}
