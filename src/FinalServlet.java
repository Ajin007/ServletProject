import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FinalServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest Req,HttpServletResponse Res) throws IOException,ServletException{
		
		Res.setContentType("text/html");
		PrintWriter out=Res.getWriter();
		
		String name=Req.getParameter("U-N");
		out.println("welcome"+name);
		
		
		
	}

}
