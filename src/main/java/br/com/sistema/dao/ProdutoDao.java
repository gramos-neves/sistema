package br.com.sistema.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.sistema.models.Produto;

public interface ProdutoDao extends CrudRepository<Produto, Integer> {

}
