package br.com.sistema.models;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.util.SystemPropertyUtils;

@Entity
public class Gasto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private BigDecimal valor;
	private Calendar data;
	

	public Calendar getData() {
		return data;
	}
	public void setData(String data) {
		Date dataDoUsuario = new Date();
		System.out.println(data);;
		
		Calendar c = Calendar.getInstance();
		c.setTime(dataDoUsuario);
		c.add(Calendar.DATE, +1);
	//	System.out.println(data);
		this.data = c;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	 
	
  
	
}
