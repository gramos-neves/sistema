package br.com.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistema.dao.ProdutoDao;
import br.com.sistema.models.Produto;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoDao dao;
	
	@GetMapping(value="/api/public/produtos")
	public Iterable<Produto> listaProduto(){
		return dao.findAll();
	}
	
	@PostMapping(value="/api/public/produto/salvo")
	public String salvarProduto(@RequestBody Produto produto){
		dao.save(produto);
		return "Sucesso Produto";
	}
	
	
	
	
}
