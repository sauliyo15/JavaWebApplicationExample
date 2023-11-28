package ejemplos.servlet.curso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//Obtener el parámetro de la solicitud
		String nombreObtenido = request.getParameter("nombre");

		//Establecer el parámetro como un atributo en el objeto request
		request.setAttribute("nombre", nombreObtenido);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/vistas/resultado.jsp");
		requestDispatcher.forward(request, response);

	}
}