package br.com.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistema.dao.GastoDao;
import br.com.sistema.models.Gasto;

@RestController
public class GastoController {

	@Autowired
	private GastoDao dao;
	
	@CrossOrigin
	@RequestMapping(value ="/api/public/gastos",method= RequestMethod.GET)
	public Iterable<Gasto> ListaProdutos(){
		return dao.findAll();
	}
	
	
	@RequestMapping(value="/api/public/gasto/salvo",method=RequestMethod.POST)
	@CrossOrigin
    public String SalvarGasto(@RequestBody Gasto gasto){
    //	System.out.println(gasto.getDescricao());
    //	System.out.println(gasto.getValor());
    	//System.out.println(gasto.getData());
		dao.save(gasto);
    	return "Salvo com Sucesso";
    }
	
	@RequestMapping(value="/api/public/gasto/deletar",method=RequestMethod.POST)
	@CrossOrigin
	public String RemoveGasto(@RequestBody Gasto gasto){
	//   Gasto gasto = dao.findOne(arg0)
		dao.delete(gasto.getId());
		return "Item removido";
	}
	
}
