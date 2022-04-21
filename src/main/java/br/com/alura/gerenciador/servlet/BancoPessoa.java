package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class BancoPessoa {
	
	private static List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public void adiciona(Pessoa pessoa) {
		lista.add(pessoa);
		
	}
	
	public List<Pessoa> getPessoa(){
		return BancoPessoa.lista;
	}
	

}
