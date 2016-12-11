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
import beans.produits.Produit;
import beans.produits.ProduitServicesImpl;

/**
 * Servlet implementation class CategorieServlet
 */
@WebServlet("/CategorieServlet")
public class CategorieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	HttpSession session ; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategorieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		
		CategorieServicesImpl categServices = new CategorieServicesImpl(); 
		List<Categorie> categs = categServices.show();  
		session = request.getSession(true);
		session.setAttribute("categories", categs);

		if(request.getParameter("nom") != null   ){
		
				String nom= request.getParameter("nom")  ; 
				
				
				
				
				
				Categorie categorie = new Categorie(nom); 
				
				categServices.add(categorie);
				
				
				 categs = categServices.show();
					session = request.getSession(true);
					session.setAttribute("categories", categs);
					response.sendRedirect("categorieView.jsp"); 
			}
				else
			if((request.getParameter("mnom") != null ) && (request.getParameter("midCateg") != null )   ){
				
				String nom= request.getParameter("mnom")  ; 
				
			   Categorie c = categServices.getById(Integer.parseInt(request.getParameter("midCateg"))) ; 
			   c.setLabelle(nom);
							
			
				categServices.update(c);
				
				
				 categs = categServices.show();
				 	session = request.getSession(true);
				 	session.setAttribute("categories", categs);
					response.sendRedirect("categorieView.jsp"); 
				
		
		}
		else 
		
		if((request.getParameter("categIdSup") != null )) {
			
			Categorie p =  categServices.getById(2) ;
			
			categServices.remove(p);
			
			
			
			 categs = categServices.show();
			 	session = request.getSession(true);
			 	session.setAttribute("categories", categs);
				response.sendRedirect("categorieView.jsp"); 
				
		}
		else 
			if((request.getParameter("categIdModif") != null )) {
				
				System.out.println(request.getParameter("categIdModif"));
				Categorie p = categServices.getById(Integer.parseInt(request.getParameter("categIdModif"))) ; 
				 session = request.getSession(true);
				session.setAttribute("categorie", p);
				response.sendRedirect("categorieModifView.jsp");;
				
				
			}
			else {
				 categs = categServices.show();
				 	session = request.getSession(true);
				 	session.setAttribute("categories", categs);
					response.sendRedirect("categorieView.jsp"); 
			}
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
