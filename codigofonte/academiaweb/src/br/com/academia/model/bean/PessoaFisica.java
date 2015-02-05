package br.com.academia.model.bean;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class PessoaFisica extends Pessoa {
	private int rg;
	private long cpf;
	private int idade;
	private char sexo;

	public PessoaFisica(String nome, Endereco endereco, String[] telefone,
			String[] email, Date dataCadastral) {

		super(nome, endereco, telefone, email, dataCadastral);
		// TODO Auto-generated constructor stub
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}