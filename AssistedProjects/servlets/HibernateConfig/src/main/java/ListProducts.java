
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
			out.println("<b>Product Listing<\b><br>");
			for(EProduct p: list ) {
				out.println("ID: " + String.valueOf(p.getID() + "Name: " + p.getName() 
				+ "Price: " + String.valueOf(p.getPrice() + "Date Added: " + p.getDateAdded().toString() 
						+ "<br>")));
				
			}
			
			out.println("</body></html>");
			factory.close();
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
