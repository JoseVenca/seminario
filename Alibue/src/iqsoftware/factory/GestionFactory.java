package iqsoftware.factory;

import iqsoftware.implementacion.GestionSQL;
import iqsoftware.interfaz.GestionDAO;

public class GestionFactory {
	
	public static GestionDAO getGestion(String info) {
		if(info.equals("sql")) {
			return new GestionSQL();
		}
		return null;
	}

}
