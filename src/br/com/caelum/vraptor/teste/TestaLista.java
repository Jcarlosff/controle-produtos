package br.com.caelum.vraptor.teste;

import br.com.caelum.vraptor.bean.Produto;
import br.com.caelum.vraptor.dao.ProdutoDAO;

public class TestaLista {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		for (Produto produto : dao.lista()) {
			System.out.println(produto);
		}
	}
}
