package com.maren.DemosecB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestCtrl
 */
@WebServlet("/TestCtrl")
public class TestCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TestCtrl() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("REQ" , "Request Scope");
		request.getSession().setAttribute("SES" , "Session Scope");
		getServletContext().setAttribute("APP", "Application Scope");
		request.getRequestDispatcher("/ScopeCtrl2").forward(request , response);
	}

}
