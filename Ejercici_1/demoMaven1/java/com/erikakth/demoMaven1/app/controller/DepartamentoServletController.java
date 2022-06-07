package com.erikakth.demoMaven1.app.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.erikakth.demoMaven1.app.facade.Imp.DepartamentoImp;
import com.erikakth.demoMaven1.app.model.Departamento;

/**
 * Servlet implementation class DepartamentoServletController
 */
public class DepartamentoServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Departamento> listDepartamentos = new ArrayList<Departamento>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DepartamentoServletController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String option = request.getParameter("option");
		if (option.equals("crear")) {
			System.out.println("@crear");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/departamento/crear.jsp");
			requestDispatcher.forward(request, response);

		} else if (option.equals("listar")) {
			DepartamentoImp departamentoImp = new DepartamentoImp();
			try {
				listDepartamentos = departamentoImp.buscarTodos();
				for (Departamento departamento : listDepartamentos) {
					System.out.println(departamento);
				}
				request.setAttribute("listDepartamentos", listDepartamentos);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/departamento/list.jsp");
				requestDispatcher.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("@listar");
		} else if (option.equals("meditar")) {
			int id_Depart = Integer.parseInt(request.getParameter("id_Depart"));
			System.out.println("Editar id: " + id_Depart);
			DepartamentoImp departamentoImp = new DepartamentoImp();
			Departamento departamento = new Departamento();
			try {
				departamento = departamentoImp.buscarPorId(id_Depart);
				System.out.println(departamento);
				request.setAttribute("departamento", departamento);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/departamento/editar.jsp");
				requestDispatcher.forward(request, response);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opcion = request.getParameter("opcion");
		Date fechaActual = new Date();
		if (opcion.equals("guardar")) {
			DepartamentoImp departamentoImp = new DepartamentoImp();
			Departamento departamento = new Departamento();
			long depart_codigo = Integer.parseInt(request.getParameter("cod_depart"));
			departamento.setDepart_nombre(request.getParameter("name_depart"));
			departamento.setFecha_hora_crea(new java.sql.Date(fechaActual.getTime()));
			try {
				departamentoImp.crearDepartamento(departamento);
				System.out.println("Registro guardado satisfactoriamente");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
				requestDispatcher.forward(request, response);
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		} else if (opcion.equals("editar")) {
			Departamento departamento = new Departamento();
			DepartamentoImp departamentoImp = new DepartamentoImp();
			departamento.setId_Depart(Integer.parseInt(request.getParameter("id_Depart")));
			long depart_codigo = Integer.parseInt(request.getParameter("cod_depart"));
			departamento.setDepart_nombre(request.getParameter("name_depart"));
			departamento.setFecha_hora_modf(new java.sql.Date(fechaActual.getTime()));
			try {
				departamentoImp.actualizarDepartamento(departamento);
				System.out.println("Actualizacion satisfactoria");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
				requestDispatcher.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		

	}

}
