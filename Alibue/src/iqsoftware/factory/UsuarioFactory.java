package iqsoftware.factory;

import iqsoftware.implementacion.UsuarioSQL;
import iqsoftware.interfaz.UsuarioDAO;

public class UsuarioFactory {
	
	public static UsuarioDAO getUsuario(String info) {
		if(info.equals("sql")) {
			return new UsuarioSQL();
		}
		return null;
	}


}
