package com.erikakth.demoMaven1.app.facade.Imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.erikakth.demoMaven1.app.data.Conexion;
import com.erikakth.demoMaven1.app.facade.IDepartamento;
import com.erikakth.demoMaven1.app.model.Departamento;

public class DepartamentoImp implements IDepartamento {

	private PreparedStatement pstDepartamento = null;
	private ResultSet rsDepartamento = null;
	private Connection connection;
	private List<Departamento> listDepartamentos = new ArrayList<Departamento>();
	private boolean estadoOperación;

	// OBTENER TODOS LOS DEPARTAMENTOS
	public List<Departamento> buscarTodos() throws SQLException {

		String query = "";
		estadoOperación = false;
		connection = obtenerConnection();
		try {
			query = "SELECT * FROM Departamentos";
			pstDepartamento=connection.prepareStatement(query);
			rsDepartamento = pstDepartamento.executeQuery(query);
			while (rsDepartamento.next()) {
				Departamento departamento = new Departamento();
				departamento.setId_Depart(rsDepartamento.getLong("Id_Depart"));
				departamento.setDepart_codigo(rsDepartamento.getLong(2));
				departamento.setDepart_nombre(rsDepartamento.getString(3));
				departamento.setFecha_hora_crea(rsDepartamento.getDate(4));
				departamento.setFecha_hora_modf(rsDepartamento.getDate(5));
				listDepartamentos.add(departamento);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listDepartamentos;
	}

	// OBTENER DEPARTAMENTO
	public Departamento buscarPorId(long id_Depart) throws SQLException {
		Departamento departamento = new Departamento();
		String query = "";
		estadoOperación = false;
		connection = obtenerConnection();
		try {
			query = "SELECT * FROM Departamentos WHERE Id_Depart=?";
			pstDepartamento=connection.prepareStatement(query);
			pstDepartamento.setLong(1, id_Depart);
			rsDepartamento=pstDepartamento.executeQuery();
			if (rsDepartamento.next()) {
				
				departamento.setId_Depart(rsDepartamento.getLong(1));
				departamento.setDepart_codigo(rsDepartamento.getLong(2));
				departamento.setDepart_nombre(rsDepartamento.getString(3));
				departamento.setFecha_hora_crea(rsDepartamento.getDate(4));
				departamento.setFecha_hora_modf(rsDepartamento.getDate(5));
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return departamento;

		
	}

	// GUARDAR O CREAR UN NUEVO DEPARTAMENTO
	public boolean crearDepartamento(Departamento departamento) throws SQLException {
		String query = "";
		estadoOperación = false;
		connection = obtenerConnection();
		try {
			connection.setAutoCommit(false);
			query = "INSERT INTO Departamentos (Id_Depart, depart_codigo,depart_nombre,fecha_hora_crea,fecha_hora_modf)VALUE(?,?,?,?,?)";
			pstDepartamento = connection.prepareStatement(query);
			pstDepartamento.setString(1, null);
			pstDepartamento.setLong(2, departamento.getDepart_codigo());
			pstDepartamento.setString(3, departamento.getDepart_nombre());
			pstDepartamento.setDate(4, departamento.getFecha_hora_crea());
			pstDepartamento.setDate(5, departamento.getFecha_hora_modf());
			estadoOperación = pstDepartamento.executeUpdate() > 0;
			connection.commit();
			pstDepartamento.close();
			connection.close();
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
		return estadoOperación;

	}

	// EDITAR DEPARTAMENTOS
	public boolean actualizarDepartamento(Departamento departamento) throws SQLException {
		String query = "";
		estadoOperación = false;
		connection = obtenerConnection();
		try {
			connection.setAutoCommit(false);
			query = "UPDATE Departamentos SET depart_codigo=?,depart_nombre=?, fecha_hora_modf=? WHERE Id_Depart";
			pstDepartamento = connection.prepareStatement(query);
			pstDepartamento.setLong(1, departamento.getDepart_codigo());
			pstDepartamento.setString(2, departamento.getDepart_nombre());
			pstDepartamento.setDate(3, departamento.getFecha_hora_modf());
			pstDepartamento.setLong(4, departamento.getId_Depart());

			estadoOperación = pstDepartamento.executeUpdate() > 0;
			connection.commit();
			pstDepartamento.close();
			connection.close();

		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
		return estadoOperación;
	}

	// ELIMINAR DEPARTAMENTOS
	public boolean eliminarDepartamento(long id_Depart) throws SQLException {
		String query = "";
		estadoOperación = false;
		connection = obtenerConnection();
		try {
			connection.setAutoCommit(false);
			query = "DELETE FROM Departamentos WHERE Id_Depart=?";
			pstDepartamento = connection.prepareStatement(query);
			pstDepartamento.setLong(1, id_Depart);
			estadoOperación = pstDepartamento.executeUpdate() > 0;
			connection.commit();
			pstDepartamento.close();
			connection.close();

		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
		return estadoOperación;

	}

	public Connection obtenerConnection() throws SQLException {
		return Conexion.getConnection();

	}

}
