

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletClass2
 */
@WebServlet("/ServletClass2")
public class ServletClass2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletClass2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		String listGen = request.getParameter("toList");
		int listLength = listGen.length();
		String animalPic = request.getParameter("animalChosen");
		response.setContentType("text/html");
		
		out.println("<br>" + "<h1>" + listGen + "</h1>");
		
		//why wont this print listGen.charAt(i)?!?! even if i convert it to a string first, it still refuses to work. I can print it outside of an li tag, but inside it doesnt work.
		out.print("<ul>");
		for (int i = 0; i <= listLength; i++) {
			out.println("<li>" + "this is in place of the letter at index: " + i);
			//out.println("<li>" + listGen.charAt(i) + "</li>");
			//out.println("<li>" + request.getParameter("toList").charAt(i) + "</li>");
			//out.println("<li>" + "<%= listGen.charAt(i)/%>" + "</li>");
			//out.println(listGen.charAt(i));
		}
		out.print("</ul>");
		out.println("<br>" + "<p>Here's your animal!</p>");
		out.println("<br>" + "<img src=\"" + animalPic + ".jpg\">");
		
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String password = request.getParameter("password");
		PrintWriter printWriter = response.getWriter();
		
		if (password == "admin") {
		printWriter.print("<p>All the secrets?</p>");
		} else {
		printWriter.print("<p>Not an admin!</p>");
		}
	}

}
