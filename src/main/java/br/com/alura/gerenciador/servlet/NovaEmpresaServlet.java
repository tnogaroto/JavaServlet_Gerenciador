package br.com.alura.gerenciador.servlet;

import java.awt.image.BandCombineOp;
import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa= request.getParameter("nome");
		Empresa empresa= new Empresa(); // seta a empresa e cria
		empresa.setNome(nomeEmpresa); // emcapsula com base no parametro carregado
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		// chamar jps que possui o código
		
		RequestDispatcher rd= request.getRequestDispatcher("/novaEmpresaCriada.jsp"); // Cria um despachador de request (vincula o arquivo)
		request.setAttribute("empresa", empresa.getNome()); // seta o valor que de fato quer enviar.
		rd.forward(request, response); //despachar a requisicao de dados do arquivo, ou seja vincular, com requisicao e resposta.
		
		
		
	}

}
