package Controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Ciudad;
import negocio.CiudadImp;

/**
 * Servlet implementation class CiudadServletController
 */
@WebServlet("/CiudadServletController")
public class CiudadServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Ciudad> listaCiudades= new ArrayList<>();
   
	String listar="ciudades/listCiudades.jsp";
    public CiudadServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acceso="";
		String action=request.getParameter("accion");
		if(action.equalsIgnoreCase("listar")) {
			acceso=listar;
		}
		
		RequestDispatcher ciudades=request.getRequestDispatcher(acceso);
		ciudades.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
