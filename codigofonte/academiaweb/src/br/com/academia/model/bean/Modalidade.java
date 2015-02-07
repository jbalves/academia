package br.com.academia.model.bean;

import java.util.Date;
import javax.persistence.Entity;


public class Modalidade extends AbstractBean {
	private String nome;
	private String Instutor;
	private Date horarioInicio;
	private Date horarioFim;
	private Date dias;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstutor() {
		return Instutor;
	}

	public void setInstutor(String instutor) {
		Instutor = instutor;
	}

	public Date getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(Date horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public Date getHorarioFim() {
		return horarioFim;
	}

	public void setHorarioFim(Date horarioFim) {
		this.horarioFim = horarioFim;
	}

	public Date getDias() {
		return dias;
	}

	public void setDias(Date dias) {
		this.dias = dias;
	}

}
