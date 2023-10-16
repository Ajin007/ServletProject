import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.server.ServerCloneException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	public void doPost(HttpServletRequest Req,HttpServletResponse Res) throws IOException,ServletException{
		
		Res.setContentType("text/html");
		PrintWriter out=Res.getWriter();
	
		//this is the connecting parameter that helps to connect the index.html file  
		String Username=Req.getParameter("U-N");
		String password=Req.getParameter("P-N");
		
		//hardcoded password
		//if no error in password it wil forward the url ------> /servlet2---> this servlet2 will be linked with teh Finalsevlet class
		if (password.equals("servlet")){
			RequestDispatcher RD=Req.getRequestDispatcher("/servlet2");
			RD.forward(Req, Res);
		}
		else{
			RequestDispatcher RDI=Req.getRequestDispatcher("/index.html");
			RDI.include(Req, Res);
		}
	}

}
