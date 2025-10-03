package polo.com.controler;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/bai3")
public class Bai3controler extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	resp.getWriter().print("  System.out.println(\"===== Thông tin URL =====\");\r\n"
			+ "        System.out.println(\"URL: \" + req.getRequestURL().toString());\r\n"
			+ "        System.out.println(\"URI: \" + req.getRequestURI());\r\n"
			+ "        System.out.println(\"QueryString: \" + req.getQueryString());\r\n"
			+ "        System.out.println(\"ServletPath: \" + req.getServletPath());\r\n"
			+ "        System.out.println(\"ContextPath: \" + req.getContextPath());\r\n"
			+ "        System.out.println(\"PathInfo: \" + req.getPathInfo());\r\n"
			+ "        System.out.println(\"Method: \" + req.getMethod());");
	
}
}
