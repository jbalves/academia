package br.com.academia.controller;

import javax.faces.bean.ManagedBean;

import br.com.academia.model.bean.Turma;
import br.com.academia.model.dao.AdapterDAO;

@ManagedBean
public class TurmaMB {

	private Turma turma;
	private AdapterDAO<Turma, Integer> turmaDAO = new AdapterDAO<Turma, Integer>(Turma.class);
	
	public TurmaMB() {
		turma = new Turma();
	}
	
	public void salvar(){
		turmaDAO.salvar(turma);
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
}
