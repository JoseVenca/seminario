package iqsoftware.interfaz;

import java.sql.SQLException;
import java.util.List;

import iqsoftware.dominio.Empleados;
import iqsoftware.dominio.Granja;

public interface GranjaDAO {
	
	public boolean addGranja(Granja granja) throws SQLException;
	public boolean updateGranja(Granja granja) throws SQLException;
	public Granja getNombre(Granja granja) throws SQLException;

}
