package iqsoftware.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import iqsoftware.conexion.Conexion;
import iqsoftware.dominio.Empleados;
import iqsoftware.dominio.Fecha;
import iqsoftware.interfaz.EmpleadoDAO;


public class EmpleadoSQL implements EmpleadoDAO{
	
	private String query;
	private Connection cn;
	private Statement st;
	private PreparedStatement ps;
	
	public EmpleadoSQL() {
		cn=Conexion.getConector();
	}

	@Override
	public boolean addEmpleado(Empleados emp) throws SQLException {
		query="insert into Empleados values ('"+emp.getNombre()+"','"+emp.getApellido()+"', '"+emp.getDni()+"','"+emp.getTelefono()+"','"+emp.getEmail()+"','"+emp.getSector()+"','"+emp.getId_usuario()+"')";
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
	public boolean deleteEmpleado(Empleados emp) throws SQLException {
		cn=null;
		cn=Conexion.getConector();
		cn.setAutoCommit(false);
		query="delete from Empleados where DNI=?";
		ps=cn.prepareStatement(query);
		ps.setString(1, emp.getDni());
		int r=ps.executeUpdate();
		if(r==1) {
			cn.commit();
			ps.close();
			cn.close();
			return true;
		}
		cn.rollback();
		ps.close();
		cn.close();
		return false;
	}

	@Override
	public boolean updateEmpleado(Empleados emp) throws SQLException {
		cn=null;
		cn=Conexion.getConector();
		query="update Empleados set Nombre='"+emp.getNombre()+"', Apellido='"+emp.getApellido()+"', DNI='"+emp.getDni()+"', Telefono='"+emp.getTelefono()+"',Email='"+emp.getEmail()+"', Sector='"+emp.getSector()+"',Estado='"+emp.getEstado()+"',Comentario='"+emp.getComentario()+"' where DNI="+emp.getDni();
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
	public Empleados getDNI(Empleados emp) throws SQLException {
		cn=null;
		cn=Conexion.getConector();
		ArrayList<Empleados> em= new ArrayList<>();
		query="select * from Empleados where DNI=?";
		ps=cn.prepareStatement(query);
		ps.setString(1, emp.getDni());
		ResultSet set=ps.executeQuery();
		Empleados e= new Empleados();
		while(set.next()) {
			e.setNombre(set.getString(2));
			e.setApellido(set.getString(3));
			e.setDni(set.getString(4));
			e.setTelefono(set.getString(5));
			e.setEmail(set.getString(6));
			e.setSector(set.getString(7));
			em.add(e);
			System.out.println(e.toString());
		}
		set.close();
		ps.close();
		cn.close();
		return emp;
	
	}


	@Override
	public boolean addFaltas(Fecha fec) throws SQLException {
		query="insert into Faltas values ('"+fec.getEstado()+"','"+fec.getFaltas()+"', '"+fec.getFecha()+"','"+fec.getComentario()+"','"+fec.getId_empleados()+"')";
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
	public Empleados getFalta(Empleados emp) throws SQLException {
		cn=null;
		cn=Conexion.getConector();
		ArrayList<Empleados> em= new ArrayList<>();
		query="select Empleados.Nombre, Empleados.Apellido, Empleados.DNI, Empleados.Sector, Faltas.Estado,Faltas.Fecha, Faltas.Comentario FROM Empleados INNER JOIN Faltas ON Empleados.Id_empleados = Faltas.Id_Empleados where Empleados.DNI=?";
		ps=cn.prepareStatement(query);
		ps.setString(1, emp.getDni());
		ResultSet set=ps.executeQuery();
		Empleados e= new Empleados();
		while(set.next()) {
			e.setNombre(set.getString(1));
			e.setApellido(set.getString(2));
			e.setDni(set.getString(3));
			e.setSector(set.getString(4));
			e.setEstado(set.getString(5));
			e.setFecha(set.getDate(6));
			e.setComentario(set.getString(7));
			em.add(e);
			System.out.println(e.toString());
		}
		set.close();
		ps.close();
		cn.close();
		return emp;
	}

}
