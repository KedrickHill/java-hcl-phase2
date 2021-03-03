

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.EProduct;

/**
 * Servlet implementation class AddProduct
 */
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		EProduct product = new EProduct();
		product.setName(request.getParameter("pname"));

		product.setPrice((BigDecimal(Integer.valueOf(request.getParameter("price")));	
		
		out.println("<html><body>");
		out.println("Adding " + pname +" " +  price + ". to the product list. <br>");

		out.println("<a href='index.jsp'> Return to Main Screen.</a><br>");
		out.println("</body></html>");
		
		//		doGet(request, response);
	}

}
