package br.com.academia.model.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turma extends AbstractBean {
	private String modalide;
	private String instrutor;
	@Temporal(TemporalType.TIME)
	private Date horaInicio;
	@Temporal(TemporalType.TIME)
	private Date horaFim;
	@ElementCollection
	@Temporal(TemporalType.DATE)
	private List<Date> dias;
	

	public String getModalide() {
		return modalide;
	}

	public void setModalide(String modalide) {
		this.modalide = modalide;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Date horaFim) {
		this.horaFim = horaFim;
	}

	public List<Date> getDias() {
		return dias;
	}

	public void setDias(List<Date> dias) {
		this.dias = dias;
	}


}
