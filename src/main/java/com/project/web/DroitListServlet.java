package com.project.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import com.project.dao.DroitImpl;
import com.project.dao.IDroit;
import com.project.dto.Droit;

@WebServlet(value="/droit/list", name="DroitListServlet")
public class DroitListServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public DroitListServlet() {
		super();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		IDroit droitdao = new DroitImpl();
		List<Droit> droits = droitdao.getAllDroit();
		request.setAttribute("droits", droits);
		request.getServletContext().getRequestDispatcher("/WEB-INF/view/droit/list.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    request.getRequestDispatcher("/WEB-INF/view/droit/list.jsp").forward(request, response);
	}

}
