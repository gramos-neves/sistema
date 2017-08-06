package br.com.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistema.dao.TransportadoraDao;
import br.com.sistema.models.Transportadora;

@RestController
public class TransportadoraController {

	@Autowired
	private TransportadoraDao dao;
	
	
	  @GetMapping(value="/api/public/transportadora/lista")
	  public Iterable<Transportadora> listaTranspotadora(){
		  return dao.findAll();
	  }
	  
	  @PostMapping(value="/api/public/transportadora/salvo")
	  public String salvarTransportadora(@RequestBody Transportadora transportadora){
		  dao.save(transportadora); 
		  return "Salvo com Sucesso";
	  }
	
	
}
