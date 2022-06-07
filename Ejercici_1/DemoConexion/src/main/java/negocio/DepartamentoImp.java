package negocio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Modelo.Departamento;
import data.Conexion;

public class DepartamentoImp extends Conexion{
	//atributos
	private PreparedStatement pstDepartamentos= null;
	private ResultSet rsDepartamentos=null;
	private String query="";
	private List<Departamento> listaDepartamentos=new ArrayList<Departamento>();
	
	public List<Departamento> findAll(){
		this.query="SELECT*FROM Departamentos";
		try{
			if (this.getConnection()!=null) {
				this.pstDepartamentos=this.getConnection().prepareCall(query);
				this.rsDepartamentos=this.pstDepartamentos.executeQuery();
				while (this.rsDepartamentos.next()) {
					Departamento departamento=new Departamento();
					departamento.setId_Depart(this.rsDepartamentos.getLong("Id_Depart"));
					departamento.setDepart_codigo(this.rsDepartamentos.getLong("depart_codigo"));
					departamento.setDepart_nombre(this.rsDepartamentos.getString("depart_nombre"));
					departamento.setFecha_hora_crea(this.rsDepartamentos.getDate("fecha_hora_crea"));
					departamento.setFecha_hora_modf(this.rsDepartamentos.getDate("codigo_hora_modf"));
					this.listaDepartamentos.add(departamento);
										
				}
				
				
			}else {
				System.out.println("Fallo de conexion");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this.listaDepartamentos;
	}

}