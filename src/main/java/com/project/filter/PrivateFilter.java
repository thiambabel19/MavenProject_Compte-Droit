package com.project.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(value="/*")
public class PrivateFilter extends HttpFilter implements Filter {
       
    public PrivateFilter() {
        super();
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		
		// Recupérer le nom de la session
		String nom = (String)session.getAttribute("nom");
		
		// Recuperer le chemin demandé par l'utilisateur
		String chemin = req.getServletPath();
		
		// Recuperer la methode HTTP utilisée (GET ou POST)
		String methode = req.getMethod();
		
		if (nom != null || chemin.equals("/") || chemin.equals("/index.jsp") || chemin.startsWith("/") && methode.equals("POST"))
			chain.doFilter(request, response);
		else
			res.sendRedirect(req.getContextPath());//retourne le chemin racine de l'application
		
	}


}
