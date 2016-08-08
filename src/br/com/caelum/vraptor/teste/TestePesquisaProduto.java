package br.com.caelum.vraptor.teste;

import br.com.caelum.vraptor.bean.Usuario;
import br.com.caelum.vraptor.dao.UsuarioDAO;

public class TestePesquisaProduto {

	public static void main(String[] args) {
	
		Usuario usuario = new Usuario();
		usuario.setLogin("diego");
		usuario.setSenha("123");
		
		UsuarioDAO dao = new UsuarioDAO();
		System.out.println(dao.buscaUsuarioPorLoginESenha(usuario));
	}
}
