package com.project.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.project.dao.CompteImpl;
import com.project.dao.DroitImpl;
import com.project.dao.ICompte;
import com.project.dao.IDroit;
import com.project.dto.Compte;
import com.project.dto.Droit;

@WebServlet(value="/compte/add", name="CompteAddServlet")
public class CompteAddServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    public CompteAddServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IDroit droitdao = new DroitImpl();
		List<Droit> droits = droitdao.getAllDroit();
		request.setAttribute("droits", droits);
		request.getServletContext().getRequestDispatcher("/WEB-INF/view/compte/add.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int droit_id = Integer.parseInt(request.getParameter("droit"));
		
		IDroit droitdao = new DroitImpl();
		Compte compte = new Compte();
		compte.setUsername(username);
		compte.setPassword(password);
		
		List<Droit> droits = new ArrayList<Droit>();
		droits.add(droitdao.getDroitById(droit_id));
		compte.setDroits(droits);
		
		ICompte comptedao = new CompteImpl();
		comptedao.saveComptes(compte);
		//System.out.println(compte.toString());
		
		String successfully_msg = "User successfully added !!!";
		request.setAttribute("successfully_msg", successfully_msg);
		response.sendRedirect(request.getContextPath()+"/compte/list");
			
	}

}
