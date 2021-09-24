package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.currencyConverter;
import model.tempConverter;

/**
 * Servlet implementation class getTemp
 */
@WebServlet("/getTemp")
public class getTemp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTemp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String temp = request.getParameter("temp");
		
		tempConverter temp1 = new tempConverter(Double.parseDouble(temp));
		
		request.setAttribute("userTmp", temp1);
		getServletContext().getRequestDispatcher("/results2.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(temp1.toString());
	}

}
