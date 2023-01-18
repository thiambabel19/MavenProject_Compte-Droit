package com.project.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.project.dao.CompteImpl;
import com.project.dao.ICompte;
import com.project.dto.Compte;

@WebServlet(value="/compte/list", name="CompteListServlet")
public class CompteListServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    public CompteListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ICompte comptedao = new CompteImpl();
		List<Compte> comptes = comptedao.getAllComptes();
		request.setAttribute("comptes", comptes);
		request.getServletContext().getRequestDispatcher("/WEB-INF/view/compte/list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/WEB-INF/view/compte/list.jsp").forward(request, response);
	}

}
