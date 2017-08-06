package br.com.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistema.dao.ClienteDao;
import br.com.sistema.models.Cliente;

@RestController
public class ClienteController {

	@Autowired
	private ClienteDao dao;
	
	@GetMapping(value="/api/public/cliente/lista")
	public Iterable<Cliente> listaCliente(){
		return dao.findAll();
	}
	
	@CrossOrigin
	@PostMapping(value="/api/public/cliente/salvo")
	public String salvoCliente(@RequestBody Cliente cliente){
		System.out.println("Nome : " + cliente.getNome());
		System.out.println("Cep :" + cliente.getX_cep());
		System.out.println("Numero " +cliente.getX_numero());
		System.out.println("CPF " + cliente.getCpf());
		System.out.println("CNPJ " + cliente.getX_cnpj());
		System.out.println("IE " + cliente.getX_ie());
		
		System.out.println("Telefone " + cliente.getTelefone());
		System.out.println("Celular " + cliente.getCelular());
		System.out.println("Bairro " + cliente.getX_bairro());
		System.out.println("Municipio " + cliente.getX_mun());
		System.out.println("estado " + cliente.getX_uf());
		System.out.println("Rua  " + cliente.getX_lgr());
		return "Salvo com sucesso";
	}
	
	
}
