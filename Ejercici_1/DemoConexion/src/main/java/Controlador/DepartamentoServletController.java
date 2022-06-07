package Controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Modelo.Departamento;
import negocio.DepartamentoImp;

/**
 * Servlet implementation class DepartamentoServletController
 */
@WebServlet("/DepartamentoServletController")
public class DepartamentoServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Departamento> listaDepartamentos= new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartamentoServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DepartamentoImp departamentoImp= new DepartamentoImp();
		this.listaDepartamentos=departamentoImp.findAll();
		request.setAttribute("departamentos", listaDepartamentos);
		request.getRequestDispatcher("departamentos/listDepartamento.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
