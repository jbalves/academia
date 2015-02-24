package br.com.academia.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.academia.model.bean.Mensalidade;

@ManagedBean
public class MensalidadeMB {

	private Mensalidade mensalidade;
	private List<Mensalidade> mensalidades;

	public Mensalidade getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(Mensalidade mensalidade) {
		this.mensalidade = mensalidade;
	}

	public List<Mensalidade> getMensalidades() {
		return mensalidades;
	}

	public void setMensalidades(List<Mensalidade> mensalidades) {
		this.mensalidades = mensalidades;
	}

}
