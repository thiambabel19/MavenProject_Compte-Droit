package com.project.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.project.dao.DroitImpl;
import com.project.dao.IDroit;
import com.project.dto.Droit;

@WebServlet(value="/droit/add", name="DroitAddServlet")
public class DroitAddServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    public DroitAddServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/WEB-INF/view/droit/add.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		Droit d = new Droit();
		d.setName(name);
		IDroit droitdao = new DroitImpl();
		droitdao.saveDroit(d);
		String successfully_msg = "Droit successfully added !!!";
		request.setAttribute("successfully_msg", successfully_msg);
		response.sendRedirect(request.getContextPath()+"/droit/list");
	}

}
