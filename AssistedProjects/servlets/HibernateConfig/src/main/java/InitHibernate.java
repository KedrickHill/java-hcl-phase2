import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.HibernateUtil;

/**
 * Servlet implementation class InitHibernate
 */
@WebServlet("/init")
public class InitHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InitHibernate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			out.println("<html><body>");

			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();
			out.println("Hibernate Session opened.<br>");
			session.close();
			out.println("Hibernate Session closed.<br>");

			out.println("<a href='index.jsp'> Return to Main Screen.</a><br>");

			out.println("</body></html>");
//			factory.close();
			session.close();

		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		out.println("<html><body>");
		out.println("Greetings " + fname + " " + lname + ". Nice to meet you. <br>");

		out.println("<a href='index.jsp'> Return to Main Screen.</a><br>");
		out.println("</body></html>");
//		doGet(request, response);
	}

}
