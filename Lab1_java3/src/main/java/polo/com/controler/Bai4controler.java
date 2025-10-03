package polo.com.controler;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet({"/bai4","/crud/them","/crud/sua","/crud/xoa"})
public class Bai4controler extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String uri = req.getRequestURI();
	// kieemr tra dduongwf daanx vaf xuanr thong bao tung ung
	if(uri.contains("/crud/them"))
		resp.getWriter().println("<h1>Creating a new record...</h1>");
	else if(uri.endsWith("/crud/sua"))
		resp.getWriter().println("<h1>Updating an existing  record...</h1>");
	else if(uri.endsWith("/crud/xoa"))
		resp.getWriter().println("<h1>Deleting a record...</h1>");
	else 
		resp.getWriter().println("<h1>not know</h1>");
}
}
