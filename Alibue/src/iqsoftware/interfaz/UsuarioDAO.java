package iqsoftware.interfaz;

import java.sql.SQLException;

import iqsoftware.dominio.Usuario;

public interface UsuarioDAO {
	
	public boolean addUsuario(Usuario usuario) throws SQLException;
	public boolean updateUsuario(Usuario usuario) throws SQLException;
	public boolean deleteUsuario(Usuario usuario) throws SQLException;
	public boolean recuperacionUsuario(Usuario usuario) throws SQLException;

}
