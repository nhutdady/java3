package poly.com.controler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/bai3Formservlet","/form/ud" , "/form/create"})
public class bai3Formservlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	Map<String, Object> map = new HashMap<>();
	map.put("fullname", "Nguyễn Minh Nhựt"); 
	map.put("gender", true); 
	map.put("country", "VN"); 
	req.setAttribute("user", map);
	req.setAttribute("editabled", true); 
	req.getRequestDispatcher("/form/form.jsp").forward(req, resp); 

}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String uri=req.getRequestURI();
	if(uri.contains("/form/form.jsp")) {
	String fullname = req.getParameter("fullname");
	System.out.println(fullname); 
	String gender=req.getParameter("gender");
	String country=req.getParameter("country");
	Map<String, Object> map = new HashMap<>();
	map.put("fullname", fullname); 
	map.put("gender", gender); 
	map.put("country",country); 
	req.setAttribute("user", map);
	req.setAttribute("capnhat", "update success"); 
	req.getRequestDispatcher("/form/form.jsp").forward(req, resp); 
	}
	else if (uri.contains("/form/themmoi.jsp")) {
		String fullname = req.getParameter("fullname");
		String gender=req.getParameter("gender");
		String country=req.getParameter("country");
		Map<String, Object> map = new HashMap<>();
		map.put("fullname", fullname); 
		map.put("gender", gender); 
		map.put("country",country); 
		req.setAttribute("user", map);
		req.setAttribute("capnhat", "update success"); 
		req.getRequestDispatcher("/form/themmoi.jsp").forward(req, resp); 
		
	}
}
}
