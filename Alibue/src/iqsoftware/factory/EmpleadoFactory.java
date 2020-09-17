package iqsoftware.factory;

import iqsoftware.implementacion.EmpleadoSQL;
import iqsoftware.interfaz.EmpleadoDAO;

public class EmpleadoFactory {
	
	public static EmpleadoDAO getEmpleado(String info) {
		if(info.equals("sql")) {
			return new EmpleadoSQL();
		}
		return null;
	}



}
