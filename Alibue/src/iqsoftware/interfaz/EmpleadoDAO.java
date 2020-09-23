package iqsoftware.interfaz;

import java.sql.SQLException;

import iqsoftware.dominio.Empleados;
import iqsoftware.dominio.Fecha;

public interface EmpleadoDAO {
	
	public boolean addEmpleado(Empleados emp) throws SQLException;
	public boolean deleteEmpleado(Empleados emp) throws SQLException;
	public boolean updateEmpleado(Empleados emp) throws SQLException;
	public boolean addFaltas(Fecha fec) throws SQLException;
	public Empleados getDNI(Empleados emp) throws SQLException;
	public Empleados getFalta(Empleados emp) throws SQLException;
	

}
