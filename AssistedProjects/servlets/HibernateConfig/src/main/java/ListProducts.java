
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.EProduct;
import com.example.HibernateUtil;

/**
 * Servlet implementation class ListProducts
 */
@WebServlet("/ListProducts")
public class ListProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListProducts() {
		super();
		// TODO Auto-generated constructor stub	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			
			Session session = factory.openSession();
						
			List<EProduct> list = session.createQuery("from com.example.EProduct", EProduct.class).list();
			
			session.close();
			
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			
			out.println("<b>Product Listing</b>");
			out.println("<table style='width:20%'><tr style=text-align:left><th>ID</th><th>Name</th><th>Price</th><th>Date Added</th></tr>");

			for(EProduct p: list ) {
				out.println("<tr><td>" + String.valueOf(p.getID() + "</td><td>" + p.getName() 
				+ "</td><td>" + String.valueOf(p.getPrice() + "</td><td>" + p.getDateAdded().toString() 
						+ "</td><br>")));
				
			}
			out.println("</table><br/>");

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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
