
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;

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
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddedProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			PrintWriter out = response.getWriter();

			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			session.beginTransaction();
//			Transaction transaction = session.beginTransaction();
			
			EProduct product = new EProduct();
			product.setName(request.getParameter("pname"));
			product.setPrice(new BigDecimal(Double.parseDouble(request.getParameter("price"))));
			product.setDateAdded(new Date());

			out.println("<html><body><h2>New Registered User</h2>");
			out.println("Adding " + product.getName() + " " + product.getPrice() + " to the product list. <br></br>");

			session.save(product);
			session.getTransaction().commit();
//			transaction.commit();
			session.close();

			out.println("<a href='list'> Show List of Products.</a><br></br>");

			out.println("<a href='index.jsp'> Return to Main Screen.</a><br>");
			out.println("</body></html>");

//			 doGet(request, response);
		} catch (Exception e) {
			throw e;
		}
	}
}
