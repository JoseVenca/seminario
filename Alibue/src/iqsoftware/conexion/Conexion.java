package iqsoftware.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import iqsoftware.util.UtilPropierties;



public class Conexion {
	
	public static Connection getConector() {
		
		Connection cn= null;
		
		try {
			Class.forName(UtilPropierties.getDriver());
		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra el driver de la BD: "+e.getMessage());
		}
		
		try {
			String url=UtilPropierties.getUrl()+UtilPropierties.getIP()+UtilPropierties.getPuerto()+UtilPropierties.getBase();
			cn=DriverManager.getConnection(url, UtilPropierties.getUser(), UtilPropierties.getPassword());
		} catch (SQLException e) {
			System.out.println("Error al conectar a la BD: "+e.getMessage());
		}
		
		return cn;
		
	}

}
