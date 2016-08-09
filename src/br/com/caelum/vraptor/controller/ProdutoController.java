package br.com.caelum.vraptor.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.bean.Produto;
import br.com.caelum.vraptor.dao.ProdutoDAO;

@Resource
public class ProdutoController {
	
	private Result result;
	@SuppressWarnings("unused")
	private ProdutoDAO produtoDao;
	
	public ProdutoController(Result result, ProdutoDAO produtoDao){
		this.result = result;
		this.produtoDao = produtoDao;
	}
	
	public List<Produto> lista(){
		return new ProdutoDAO().lista();
	}
	
	public void adiciona(Produto produto){
		new ProdutoDAO().adiciona(produto);
		result.redirectTo(ProdutoController.class).lista();
	}
	
	public void altera(Produto produto){
		new ProdutoDAO().atualiza(produto);
		result.redirectTo(ProdutoController.class).lista();
	}
	
	public void formulario(){
	}
	
	public void remove(Produto p){
		new ProdutoDAO().remove(p);
	}
	
	public Produto edita(Long id){
		return new ProdutoDAO().carrega(id);
	}
}
