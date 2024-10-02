package mywebapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/save")

public class ServletSave extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("pid"));
		String brand = req.getParameter("pbrand");
		double price = Integer.parseInt(req.getParameter("pprice"));
		double discount = Integer.parseInt(req.getParameter("pdiscount"));
		
		
	}

}
