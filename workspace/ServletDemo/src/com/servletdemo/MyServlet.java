package com.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	  public void init() throws ServletException
	  {
	     
	  }


	
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		PrintWriter pw=response.getWriter();
		pw.println("Welcome"+uname);


	}

}
