package com.erikakth.demoMaven1.app.facade.Imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.erikakth.demoMaven1.app.data.Conexion;
import com.erikakth.demoMaven1.app.facade.IDepartamento;
import com.erikakth.demoMaven1.app.model.Departamento;

public class DepartamentoImp extends Conexion implements IDepartamento{
	
	private PreparedStatement pstDepartamento=null;
	private ResultSet rsDepartamento=null;
	private String query="";
	private List<Departamento> listDepartamentos = new ArrayList<Departamento>();

	@Override
	public List<Departamento> buscarTodos() {
		this.query="SELECT*FROM Departamentos";
		try {
			if(this.getConnection()!=null) {
				this.pstDepartamento=this.getConnection().prepareStatement(query);
				this.rsDepartamento=this.pstDepartamento.executeQuery();
				while(this.rsDepartamento.next()) {
					Departamento departamento=new Departamento();
					departamento.setId_Depart(this.rsDepartamento.getLong("id_Depart"));
					departamento.setDepart_codigo(this.rsDepartamento.getLong("depart_codigo"));
					departamento.setDepart_nombre(this.rsDepartamento.getString("depart_nombre"));
					departamento.setFecha_hora_crea(this.rsDepartamento.getDate("fecha_hora_crea"));
					departamento.setFecha_hora_modf(this.rsDepartamento.getDate("fecha_hora_modf"));
					this.listDepartamentos.add(departamento);
				}
			}
		} catch (Exception e) {
			
		}
		return this.listDepartamentos;
	}

	@Override
	public Departamento buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crearDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}

}
