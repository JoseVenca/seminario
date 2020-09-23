package iqsoftware.interfaz;

import java.sql.SQLException;

import iqsoftware.dominio.Gestion;


public interface GestionDAO {
	
	public boolean addGestion(Gestion ges) throws SQLException;

}
