package iqsoftware.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import iqsoftware.conexion.Conexion;
import iqsoftware.dominio.Gestion;
import iqsoftware.interfaz.GestionDAO;

public class GestionSQL implements GestionDAO {
	
	private String query;
	private Connection cn;
	private Statement st;
	private PreparedStatement ps;
	
	public GestionSQL() {
		cn=Conexion.getConector();
	}

	@Override
	public boolean addGestion(Gestion ges) throws SQLException {
		query="insert into Gestion (fecha_ingreso, fecha_egreso) values ('"+ges.getFecha_ingreso()+"','"+ges.getFecha_egreso()+"')";
		st=cn.createStatement();
		int r=st.executeUpdate(query);
		if(r==1) {
			st.close();
			cn.close();
			return true;
		}else {
			st.close();
			cn.close();
			return false;
		}
	}

}
