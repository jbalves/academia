package br.com.academia.model.bean;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private long inscEstadual;

	public PessoaJuridica(String nome, Endereco endereco, String[] telefone,
			String[] email, Date dataCadastral) {

		super(nome, endereco, telefone, email, dataCadastral);
		// TODO Auto-generated constructor stub
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public long getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(long inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

}