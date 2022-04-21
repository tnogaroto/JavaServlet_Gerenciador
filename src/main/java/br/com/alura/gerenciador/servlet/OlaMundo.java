package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/teste")
public class OlaMundo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
		
		PrintWriter novaMensagem= resp.getWriter();
		
		novaMensagem.println("<html>");
		novaMensagem.println("<body>");
		novaMensagem.println("Mensagem 1");
		novaMensagem.println("Mensagem2 ");
		novaMensagem.println("</body>");
		novaMensagem.println("</html>");
		
		
	}

}
