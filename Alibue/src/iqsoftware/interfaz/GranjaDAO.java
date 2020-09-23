package iqsoftware.interfaz;

import java.sql.SQLException;

import iqsoftware.dominio.Granja;

public interface GranjaDAO {
	
	public boolean addGranja(Granja granja) throws SQLException;
	public boolean updateGranja(Granja granja) throws SQLException;
	public Granja getNombre(Granja granja) throws SQLException;

}
