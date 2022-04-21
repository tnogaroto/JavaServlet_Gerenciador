package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class TesteNome
 */
@WebServlet("/testeNome")
public class TesteNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando novo Nome...");
		String novoNome=request.getParameter("nome");
		
		Pessoa novaPessoa = new Pessoa();
		novaPessoa.setNome(novoNome);
		
		PrintWriter saida= response.getWriter();
		
		saida.println("<html><body><h5> O nome "+novoNome+" cadastrado com sucesso </h5></body></html>");
		
	}

}
