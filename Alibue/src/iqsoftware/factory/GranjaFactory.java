package iqsoftware.factory;

import iqsoftware.implementacion.GranjaSQL;
import iqsoftware.interfaz.GranjaDAO;

public class GranjaFactory {
	
	public static GranjaDAO getGranja(String info) {
		if(info.equals("sql")) {
			return new GranjaSQL();
		}
		return null;
	}

}
