package br.com.stackx.projweb.servlet;

import java.io.IOException;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.stackx.projweb.dao.DAO;
import br.com.stackx.projweb.dao.EstadoDAO;
import br.com.stackx.projweb.exception.StackXException;




/**
 * Servlet implementation class GravaEstado
 */
@WebServlet("/GravaEstado")
public class GravaEstado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GravaEstado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("executando o método init do servelet GravaEstado");
		
		DAO.init();
		System.out.println("DB inicializado com sucesso!");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("executando o método destroy do servelet GravaEstado");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("executando o método doGet do servelet GravaEstado");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
		
			System.out.println("executando o método doPost do servelet GravaEstado");
			
			String nome = request.getParameter("nome");
			String sigla = request.getParameter("sigla");
			String codigoIbge = request.getParameter("codigoIbge");
			
			System.out.println("Nome - " +nome);
			System.out.println("Sigla - " +sigla);
			System.out.println("codigoIbge - " +codigoIbge);
			
			EstadoDAO estadoDAO = new EstadoDAO();
			estadoDAO.setNome(nome);
			estadoDAO.setSigla(sigla);
			estadoDAO.setCodigoIbge(Integer.parseInt(codigoIbge));
			estadoDAO.insert(); 
			
		}
		catch(StackXException stackXException) {
			
			stackXException.getException().printStackTrace();
		}

	}

}
