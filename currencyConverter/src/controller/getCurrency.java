/**
 * @author Derek Gibson- ddgibson
 * CIS175 - Fall 2021
 * September 23, 2021
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.currencyConverter;

/**
 * Servlet implementation class getCurrency
 */
@WebServlet("/getCurrency")
public class getCurrency extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCurrency() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userMoney = request.getParameter("userMoney");
		
		currencyConverter userD = new currencyConverter(Double.parseDouble(userMoney));
		
		request.setAttribute("userCash", userD);
		getServletContext().getRequestDispatcher("/results1.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(userD.toString());
	}

}
