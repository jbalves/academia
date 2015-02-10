package br.com.academia.model.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private long inscEstadual;



	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaJuridica(String nome, String rua, int numero, String bairro,
			String complemento, int cep, String telefoneFixo, String telefoneCelular, String email,
			Date dataCadastro, List<Turma> turmas, String cnpj, long inscEstadual) {
		super(nome, rua, numero, bairro, complemento, cep, telefoneFixo, telefoneCelular, email,
				dataCadastro);
		this.cnpj=cnpj;
		this.inscEstadual=inscEstadual;
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