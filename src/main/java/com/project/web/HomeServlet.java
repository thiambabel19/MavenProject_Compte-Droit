package com.project.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.project.dao.CompteImpl;
import com.project.dao.ICompte;
import com.project.dto.Compte;

@WebServlet(value="/home", name="HomeServlet")
public class HomeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public HomeServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
		request.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    
	    ICompte comptedao = new CompteImpl();
	    
	    try {
	    	
		      Compte c = comptedao.login(username, password);
		      
		      // Démarrer la session 
		      request.getSession().setAttribute("nom", username);
		      
		      // Stocker les infos de l'utilisateur connecté
		      HttpSession session = request.getSession();
		      session.setAttribute("compte", c);
		      
		      request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
	      
	    } catch (Exception e) {
	      response.sendRedirect("index.jsp");
	      e.printStackTrace();
	    }
	    
	}

}
