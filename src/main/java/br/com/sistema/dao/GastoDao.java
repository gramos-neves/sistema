package br.com.sistema.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.sistema.models.Gasto;

public interface GastoDao extends CrudRepository<Gasto, Integer> {

}
