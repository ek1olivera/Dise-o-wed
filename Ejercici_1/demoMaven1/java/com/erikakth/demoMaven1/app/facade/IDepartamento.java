package com.erikakth.demoMaven1.app.facade;

import java.sql.SQLException;
import java.util.List;

import com.erikakth.demoMaven1.app.model.Departamento;





public interface IDepartamento {
	public List<Departamento>buscarTodos() throws SQLException;
	public Departamento buscarPorId(long id_Depart) throws SQLException;
	public boolean crearDepartamento(Departamento departamento) throws SQLException;
	public boolean actualizarDepartamento(Departamento departamento) throws SQLException;
	public boolean eliminarDepartamento(long id_Depart) throws SQLException;
	
	

}
