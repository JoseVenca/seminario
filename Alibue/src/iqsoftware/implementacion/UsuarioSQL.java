package iqsoftware.implementacion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import iqsoftware.conexion.Conexion;
import iqsoftware.dominio.Usuario;
import iqsoftware.interfaz.UsuarioDAO;

public class UsuarioSQL implements UsuarioDAO{
	
	private Statement st;
	private String query;
	private Connection cn;
	
	public UsuarioSQL() {
		cn=Conexion.getConector();
	

}

	@Override
	public boolean addUsuario(Usuario usuario) throws SQLException {
		// TODO Auto-generated method stub
		
		query="insert into Usuario values ('"+usuario.getUsername()+"','"+usuario.getPassword()+"', '"+usuario.getDni()+"','"+usuario.getPregunta1()+"','"+usuario.getRespuesta1()+"','"+usuario.getPregunta2()+"','"+usuario.getRespuesta2()+"')";
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
	public boolean updateUsuario(Usuario usuario) throws SQLException {
		
		query="update Usuario set Username='"+usuario.getUsername()+"', password='"+usuario.getPassword()+
				"' where Dni="+usuario.getDni();
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
	public boolean deleteUsuario(Usuario usuario) throws SQLException {
		
		query="delete from Usuario where Dni="+usuario.getDni();
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
	public boolean recuperacionUsuario(Usuario usuario) throws SQLException {
		
		return false;
	}
	
}

