package br.com.sistema.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_cliente;
	private String nome;
	private String x_cnpj;
	private String x_ie;
	private String cpf;
	private String telefone;
	private String celular;
	private String x_lgr;
	private String x_numero;
	private String x_cep;
	private String x_bairro;
	private String x_mun;
	private String x_uf;
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getX_lgr() {
		return x_lgr;
	}
	public void setX_lgr(String x_lgr) {
		this.x_lgr = x_lgr;
	}
	public String getX_numero() {
		return x_numero;
	}
	public void setX_numero(String x_numero) {
		this.x_numero = x_numero;
	}
	public String getX_cep() {
		return x_cep;
	}
	public void setX_cep(String x_cep) {
		this.x_cep = x_cep;
	}
	public String getX_bairro() {
		return x_bairro;
	}
	public void setX_bairro(String x_bairro) {
		this.x_bairro = x_bairro;
	}
	public String getX_mun() {
		return x_mun;
	}
	public void setX_mun(String x_mun) {
		this.x_mun = x_mun;
	}
	public String getX_uf() {
		return x_uf;
	}
	public void setX_uf(String x_uf) {
		this.x_uf = x_uf;
	}
	public String getX_cnpj() {
		return x_cnpj;
	}
	public void setX_cnpj(String x_cnpj) {
		this.x_cnpj = x_cnpj;
	}
	public String getX_ie() {
		return x_ie;
	}
	public void setX_ie(String x_ie) {
		this.x_ie = x_ie;
	}
	
   
	
	
	
}
