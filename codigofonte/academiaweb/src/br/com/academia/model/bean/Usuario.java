package br.com.academia.model.bean;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private Date dataLogin;
	
	public boolean isLogado() {
		return nome !=null;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataLogin() {
		return dataLogin;
	}
	public void setDataLogin(Date dataLogin) {
		this.dataLogin = dataLogin;
	}
	
	
	

}
