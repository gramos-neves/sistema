package br.com.sistema.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_Produto;
	
	private String descricao;
	private String codigo;
	private String EAN;
	private String EAN_Unid;
	private String Ex_tipi;
	private String genero;
	private String ncm;
	private String Unid_com;
	private String Unid_trib;
	private String V_UN_Com;
	private String V_UN_Trib;
	private String Q_Trib;
	
	public Integer getId_Produto() {
		return id_Produto;
	}
	public void setId_Produto(Integer id_Produto) {
		this.id_Produto = id_Produto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getEAN() {
		return EAN;
	}
	public void setEAN(String eAN) {
		EAN = eAN;
	}
	public String getEAN_Unid() {
		return EAN_Unid;
	}
	public void setEAN_Unid(String eAN_Unid) {
		EAN_Unid = eAN_Unid;
	}
	public String getEx_tipi() {
		return Ex_tipi;
	}
	public void setEx_tipi(String ex_tipi) {
		Ex_tipi = ex_tipi;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNcm() {
		return ncm;
	}
	public void setNcm(String ncm) {
		this.ncm = ncm;
	}
	public String getUnid_com() {
		return Unid_com;
	}
	public void setUnid_com(String unid_com) {
		Unid_com = unid_com;
	}
	public String getUnid_trib() {
		return Unid_trib;
	}
	public void setUnid_trib(String unid_trib) {
		Unid_trib = unid_trib;
	}
	public String getV_UN_Com() {
		return V_UN_Com;
	}
	public void setV_UN_Com(String v_UN_Com) {
		V_UN_Com = v_UN_Com;
	}
	public String getV_UN_Trib() {
		return V_UN_Trib;
	}
	public void setV_UN_Trib(String v_UN_Trib) {
		V_UN_Trib = v_UN_Trib;
	}
	public String getQ_Trib() {
		return Q_Trib;
	}
	public void setQ_Trib(String q_Trib) {
		Q_Trib = q_Trib;
	}
	
	
	
	
	
}
