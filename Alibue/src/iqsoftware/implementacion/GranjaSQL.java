package iqsoftware.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import iqsoftware.conexion.Conexion;
import iqsoftware.dominio.Granja;
import iqsoftware.interfaz.GranjaDAO;

public class GranjaSQL implements GranjaDAO {
	
	private String query;
	private Connection cn;
	private Statement st;
	private PreparedStatement ps;
	
	public GranjaSQL() {
		cn=Conexion.getConector();
	}

	@Override
	public boolean addGranja(Granja granja) throws SQLException {
		query="insert into Granja values ('"+granja.getNombre()+"','"+granja.getFecha_ingreso().toString()+"', '"+granja.getCuit()+"','"+granja.getTelefono()+"','"+granja.getCrianza()+"','"+granja.getId_usuario()+"')";
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

	@Override
	public boolean updateGranja(Granja granja) throws SQLException {
		cn=null;
		cn=Conexion.getConector();
		query="update Granja set nombre_granja='"+granja.getNombre()+"', fecha_ingreso='"+granja.getFecha_ingreso().toString()+"', cuit='"+granja.getCuit()+"', Telefono='"+granja.getTelefono()+"',Cant_crianza='"+granja.getCrianza()+"' where cuit="+granja.getCuit();
		st=cn.createStatement();
		int r=st.executeUpdate(query);
		if(r==1) {
			st.close();
			cn.close();
			return true;
		}
		st.close();
		cn.close();
		return false;
	}

	@Override
	public Granja getNombre(Granja granja) throws SQLException {
	
		cn=null;
		cn=Conexion.getConector();
		ArrayList<Granja> granjas= new ArrayList<>();
		query="select * from Granja where nombre_granja=?";
		ps=cn.prepareStatement(query);
		ps.setString(1, granja.getNombre());
		ResultSet set=ps.executeQuery();
		Granja g= new Granja();
		while(set.next()) {
			g.setNombre(set.getString(2));
			g.setCuit(set.getString(4));
			g.setTelefono(set.getString(5));
			g.setCrianza(set.getInt(6));
			granjas.add(g);
			System.out.println(g.toString());
		}
		set.close();
		ps.close();
		cn.close();
		return granja;
	}

}
