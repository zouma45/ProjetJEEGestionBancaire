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
import beans.categorie.CategorieServicesImpl;
import beans.client.Client;
import beans.client.ClientServicesImpl;
import beans.produits.Produit;
import beans.produits.ProduitServicesImpl;
import util.HibernateUtil;


/**
 * Servlet implementation class EntryServlet
 */
@WebServlet("/ProduitServlet")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HibernateUtil hb;
	List<Produit> produits ; 
	HttpSession session ; 
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProduitServlet() {
		super();
		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ProduitServicesImpl produitServices = new  ProduitServicesImpl(); 
		CategorieServicesImpl categServices = new CategorieServicesImpl(); 
		List<Categorie> categs = categServices.show();  
		session = request.getSession(true);
		session.setAttribute("cats", categs);

		if((request.getParameter("nom") != null ) && (request.getParameter("description") != null ) && (request.getParameter("prix") != null ) && (request.getParameter("quantite") != null )  ){
		
				String nom= request.getParameter("nom")  ; 
				String description= request.getParameter("description")  ; 
				double prix= Double.parseDouble(request.getParameter("prix") ) ; 
				int  quantite=Integer.parseInt(request.getParameter("quantite") )  ; 
				Categorie c =  categServices.getById(Integer.parseInt(request.getParameter("idCateg") )) ;
				
				
				
				java.util.Date utilDate = new java.util.Date();
			    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
				Produit produit = new Produit(nom, description, prix, sqlDate, quantite , c ) ; 
				produitServices.add(produit);
				
				
				 produits = produitServices.show();
					session = request.getSession(true);
					session.setAttribute("produits", produits);
					response.sendRedirect("produitView.jsp"); 
			}
				else
			if((request.getParameter("mnom") != null ) && (request.getParameter("mdescription") != null ) && (request.getParameter("mprix") != null ) && (request.getParameter("mquantite") != null )  ){
				
				String nom= request.getParameter("mnom")  ; 
				String description= request.getParameter("mdescription")  ; 
				double prix= Double.parseDouble(request.getParameter("mprix") ) ; 
				int  quantite=Integer.parseInt(request.getParameter("mquantite") )  ; 
				Categorie c =  new Categorie(); 
				//c.setIdCateg(Integer.parseInt(request.getParameter("categorie") ));
				c.setIdCateg(2);
				
				java.util.Date utilDate = new java.util.Date();
			    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			    
			    Produit p = produitServices.getById(Integer.parseInt(request.getParameter("idProd"))) ; 
	
				p.setCategorie(c);
				p.setPrix(prix);
				p.setDate(sqlDate);
				p.setQuantite(quantite);
				p.setTitre(nom);
				p.setDescription(description);
			
				produitServices.update(p);
				
				
				 produits = produitServices.show();
				 	session = request.getSession(true);
					session.setAttribute("produits", produits);
					response.sendRedirect("produitView.jsp"); 
				
		
		}
		else 
		
		if((request.getParameter("produitIdSup") != null )) {
			
			Produit p =  produitServices.getById(Integer.parseInt(request.getParameter("produitIdSup") )) ;
			
			produitServices.remove(p);
			
			response.sendRedirect("produitView.jsp"); 
			
			 produits = produitServices.show();
				 session = request.getSession(true);
				session.setAttribute("produits", produits);
				response.sendRedirect("produitView.jsp"); 
		}
		else 
			if((request.getParameter("produitIdModif") != null )) {
				
				System.out.println(request.getParameter("produitIdModif"));
				Produit p = produitServices.getById(Integer.parseInt(request.getParameter("produitIdModif"))) ; 
				 session = request.getSession(true);
				session.setAttribute("produit", p);
				response.sendRedirect("modifView.jsp");;
				
				
			}
			else {
					produits = produitServices.show();
					session = request.getSession(true);
					session.setAttribute("produits", produits);
					response.sendRedirect("produitView.jsp"); 
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
