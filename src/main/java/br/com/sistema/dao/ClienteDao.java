package br.com.sistema.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.sistema.models.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {

}
