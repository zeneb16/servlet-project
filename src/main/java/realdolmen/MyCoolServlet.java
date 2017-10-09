package realdolmen;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/hello.html")
public class MyCoolServlet extends HttpServlet {
 
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{
		PrintWriter out=resp.getWriter();
		out.println("hello world"+(5*8)+"->"+new Date());
		
	}
}
