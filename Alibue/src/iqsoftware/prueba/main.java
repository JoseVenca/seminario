package iqsoftware.prueba;

import java.util.Calendar;
import java.util.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import iqsoftware.dominio.Empleados;
import iqsoftware.dominio.Fecha;
import iqsoftware.dominio.Gestion;
import iqsoftware.dominio.Granja;
import iqsoftware.dominio.Usuario;
import iqsoftware.factory.EmpleadoFactory;
import iqsoftware.factory.GestionFactory;
import iqsoftware.factory.GranjaFactory;
import iqsoftware.factory.UsuarioFactory;
import iqsoftware.interfaz.EmpleadoDAO;
import iqsoftware.interfaz.GestionDAO;
import iqsoftware.interfaz.GranjaDAO;
import iqsoftware.interfaz.UsuarioDAO;





public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*UsuarioDAO usuario = UsuarioFactory.getUsuario("sql");
		
		Usuario usu = new Usuario("pablo", "123452", "40404020", "Hola", "hola", "prueba", "prueba1");
		Usuario usu1 = new Usuario("admin", "28345235", "123452");
		Usuario usu2 = new Usuario("123452");
		
		
		try {
			usuario.addUsuario(usu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}*/
	
		/*EmpleadoDAO emp = EmpleadoFactory.getEmpleado("sql");
		Empleados e = new Empleados("Pablo", "Densz", "32052423", "1132332132", "cl@gmail.com", "Playa",1);
		
		try {
			emp.addEmpleado(e);
		} catch (SQLException g) {
			System.out.println("Error "+g.getMessage());
		}
	}*/
		
		/*EmpleadoDAO emp = EmpleadoFactory.getEmpleado("sql");
		Empleados e = new Empleados("40542524");
		
		
		try {
			if(emp.deleteEmpleado(e)) {
				System.out.println("eexito");
			}else {
				System.out.println("fracaso");
			}
		} catch (SQLException g) {
			System.out.println("Error "+g.getMessage());
		}
		*/

		/*EmpleadoDAO emp = EmpleadoFactory.getEmpleado("sql");
		Empleados e = new Empleados("Christian", "Lopes", "40542524", "1132332132", "cl@gmail.com", "Playa","Vacaciones", "Ninguno");
		
		try {
			if(emp.updateLibro(e)) {
				System.out.println("eexito");
			}else {
				System.out.println("farcaso");
			}
		} catch (SQLException g) {
			System.out.println("Error "+g.getMessage());
		}*/
		
		/*EmpleadoDAO emp = EmpleadoFactory.getEmpleado("sql");
		Empleados e = new Empleados("40542524");
		
		try {
			List<Empleados> em=emp.getByDNI(e);
			System.out.println(em.get(0).toString());
	
		} catch (SQLException g) {
			// TODO Auto-generated catch block
			g.printStackTrace();

	} */
		
		/*EmpleadoDAO emp = EmpleadoFactory.getEmpleado("sql");
		Empleados e = new Empleados();
		e.setDni("40542524");
		try {
			e=emp.getDNI(e);
			
		} catch (SQLException g) {
			System.out.println("error en la base de datos: "+g.getMessage());
		}
	}*/
		/*
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		GranjaDAO gr = GranjaFactory.getGranja("sql");
		Granja g = new Granja("asd" , LocalDate.parse("2001-01-01"), "123", "122", 3000,1);
		
		try {
			gr.addGranja(g);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}*/
		
		/*GranjaDAO gr = GranjaFactory.getGranja("sql");
		Granja g = new Granja("alpaca" , LocalDate.parse("2001-01-01"), "123", "122", 3000);
		
		try {
			if(gr.updateGranja(g)) {
				
				System.out.println("eexito");
			}else {
				System.out.println("farcaso");
			}
		} catch (SQLException e) {
			System.out.println("Error "+e.getMessage());
		}*/
		
		/*GranjaDAO emp = GranjaFactory.getGranja("sql");
		Granja e = new Granja();
		e.setNombre("asd");
		try {
			e=emp.getNombre(e);
			
		} catch (SQLException g) {
			System.out.println("error en la base de datos: "+g.getMessage());
		}
	*/
		/*EmpleadoDAO emp = EmpleadoFactory.getEmpleado("sql"); 
		long millis=System.currentTimeMillis();  
	     java.sql.Date date=new java.sql.Date(millis);
	
		
		Fecha fe = new Fecha("vxvx", "asdasd", date , "bnmb", 3);
		
		try {
			emp.addFaltas(fe);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	
		/*EmpleadoDAO emp = EmpleadoFactory.getEmpleado("sql");
		Empleados e = new Empleados();
		Fecha fe = new Fecha();
		e.setDni("32052423");
		try {
			e=(Empleados) emp.getFalta(e);
			
		} catch (SQLException g) {
			System.out.println("error en la base de datos: "+g.getMessage());
		} */
			
		GestionDAO g = GestionFactory.getGestion("sql");
		//DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
		//Date date = new Date(dateFormat.parse("04/04/2014 21:07:13.897").getTime());
		
		//Date dt = new Date();
        //Date utilDate = new Date(dt.getTime());
        //Timestamp sqlTime = new Timestamp(dt.getTime());
		//Gestion ge = new Gestion(utilDate, utilDate, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		
		//try {
		//	g.addGestion(ge);
		//} catch (SQLException e) {
		//	// TODO Auto-generated catch block
		//	e.printStackTrace();
		//} 
	}
	

}
