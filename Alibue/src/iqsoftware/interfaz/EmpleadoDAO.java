package iqsoftware.interfaz;

import java.sql.SQLException;
import java.util.List;

import iqsoftware.dominio.Empleados;

public interface EmpleadoDAO {
	
	public boolean addEmpleado(Empleados emp) throws SQLException;
	public boolean deleteEmpleado(Empleados emp) throws SQLException;
	public boolean updateEmpleado(Empleados emp) throws SQLException;
	public Empleados getDNI(Empleados emp) throws SQLException;
	public List<Empleados> getByDNI(Empleados emp) throws SQLException;

}
