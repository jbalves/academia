package br.com.academia.model.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class PessoaFisica extends Pessoa {
	
	private int rg;
	private long cpf;
	private int idade;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String rua, int numero, String bairro,
			String complemento, int cep, String telefoneFixo, String telefoneCelular, String email,
			Date dataCadastro, List<Turma> turmas, int rg, long cpf, int idade, Sexo sexo) {
		super(nome, rua, numero, bairro, complemento, cep, telefoneFixo, telefoneCelular, email,
				dataCadastro);
		
		this.rg = rg;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;

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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}