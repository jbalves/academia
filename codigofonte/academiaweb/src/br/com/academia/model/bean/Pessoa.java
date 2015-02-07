/**
 *  @author Anderson Moura
 */
package br.com.academia.model.bean;

import java.util.Date;

import javax.persistence.MappedSuperclass;


public abstract class Pessoa {
	private String nome;
	private Endereco endereco;
	private String telefone[];
	private String email[];
	private Date dataCadastral;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, Endereco endereco, String[] telefone,
			String[] email, Date dataCadastral) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.setDataCadastral(dataCadastral);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String[] getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone[]) {
		this.telefone = telefone;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String email[]) {
		this.email = email;
	}

	public Date getDataCadastral() {
		return dataCadastral;
	}

	public void setDataCadastral(Date dataCadastral) {
		this.dataCadastral = dataCadastral;
	}
}