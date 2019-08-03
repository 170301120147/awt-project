package com.maren.DemosecB.controller;

import java.io.IOException;

/**
 * Servlet implementation class HelloCtrl
 */
@WebServlet("/HelloCtrl")
public class HelloCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloCtrl() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("HELLO WORLD");
	}

}
