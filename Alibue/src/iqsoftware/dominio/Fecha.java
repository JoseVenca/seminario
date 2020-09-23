package iqsoftware.dominio;

import java.sql.Date;
import java.time.LocalDate;

public class Fecha {
	
	private int id_fecha;
	private String Estado;
	private String Faltas;
	private Date Fecha;
	private String Comentario;
	private int id_empleados;
	
	public Fecha() {
		super();
	}

	public Fecha(String estado, String faltas, Date fecha, String comentario, int id_empleados) {
		super();

		Estado = estado;
		Faltas = faltas;
		Fecha = fecha;
		Comentario = comentario;
		this.id_empleados = id_empleados;
	}

	public int getId_fecha() {
		return id_fecha;
	}

	public void setId_fecha(int id_fecha) {
		this.id_fecha = id_fecha;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getFaltas() {
		return Faltas;
	}

	public void setFaltas(String faltas) {
		Faltas = faltas;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date date) {
		Fecha = date;
	}

	public String getComentario() {
		return Comentario;
	}

	public void setComentario(String comentario) {
		Comentario = comentario;
	}

	public int getId_empleados() {
		return id_empleados;
	}

	public void setId_empleados(int id_empleados) {
		this.id_empleados = id_empleados;
	}

	@Override
	public String toString() {
		return "Fecha [id_fecha=" + id_fecha + ", Estado=" + Estado + ", Faltas=" + Faltas + ", Fecha=" + Fecha
				+ ", Comentario=" + Comentario + ", id_empleados=" + id_empleados + "]";
	}
	
	

}
