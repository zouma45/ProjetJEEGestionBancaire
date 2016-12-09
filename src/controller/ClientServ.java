package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.categorie.Categorie;
import beans.client.Client;
import beans.client.ClientServices;
import beans.client.ClientServicesImpl;
import beans.produits.Produit;
import beans.produits.ProduitServicesImpl;

/**
 * Servlet implementation class ClientServ
 */
@WebServlet("/ClientServ")
public class ClientServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClientServ() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ClientServicesImpl clientServices = new ClientServicesImpl();

		if ((request.getParameter("nom") != null) && (request.getParameter("adresse") != null)) {

			String nom = request.getParameter("nom");
			String description = request.getParameter("adresse");

			Client client = new Client(nom, description);
			clientServices.add(client);
			List<Client> clients = clientServices.show();
			HttpSession session = request.getSession(true);
			session.setAttribute("clients", clients);

			response.sendRedirect("clientView.jsp");

		} else if ((request.getParameter("mnom") != null) && (request.getParameter("madresse") != null)) {

			String nom = request.getParameter("mnom");
			String adresse = request.getParameter("madresse");

			Client client = clientServices.getById(Integer.parseInt(request.getParameter("idClient")));
			client.setAdresse(adresse);
			client.setNom(nom);
			clientServices.update(client);
			List<Client> clients = clientServices.show();
			HttpSession session = request.getSession(true);
			session.setAttribute("clients", clients);

			response.sendRedirect("clientView.jsp");

		} else if (request.getParameter("compteIdSup") != null) {
			Client c = clientServices.getById(Integer.parseInt(request.getParameter("compteIdSup")));
			clientServices.remove(c);
			List<Client> clients = clientServices.show();
			HttpSession session = request.getSession(true);
			session.setAttribute("clients", clients);

			response.sendRedirect("clientView.jsp");
		} else if (request.getParameter("compteIdModif") != null) {
			Client c = clientServices.getById(Integer.parseInt(request.getParameter("compteIdModif")));
			HttpSession session = request.getSession(true);
			session.setAttribute("client", c);
			response.sendRedirect("updateClient.jsp");
		} else {
			List<Client> clients = clientServices.show();
			HttpSession session = request.getSession(true);
			session.setAttribute("clients", clients);

			response.sendRedirect("clientView.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
