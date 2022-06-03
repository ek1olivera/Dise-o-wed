package com.erikakth.demoMaven1.app.facade;

import java.util.List;

import com.erikakth.demoMaven1.app.model.Departamento;





public interface IDepartamento {
	public List<Departamento>buscarTodos();
	public Departamento buscarPorId(long id);
	public void crearDepartamento(Departamento departamento);
	public void actualizarDepartamento(Departamento departamento);
	public void eliminarDepartamento(Departamento departamento);
	
	

}
