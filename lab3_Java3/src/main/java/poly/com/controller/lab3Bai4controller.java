package poly.com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/lab3bai4")
public class lab3Bai4controller extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	Map<String, Object> map = new HashMap<>(); 
	map.put("title", "Tiêu đề bản tin"); 
	map.put("content", "Nội dung bản tin thường rất dài"); 
	req.setAttribute("item", map); 
	
	req.getRequestDispatcher("lab3bai4.jsp").forward(req, resp);
	
}
}
