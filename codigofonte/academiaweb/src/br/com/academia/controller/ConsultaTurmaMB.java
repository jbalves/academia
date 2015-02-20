package br.com.academia.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.academia.model.bean.Turma;
import br.com.academia.model.dao.AdapterDAO;

@ManagedBean
public class ConsultaTurmaMB {

	private Turma turma = new Turma();
	private AdapterDAO<Turma, Integer> turmaDAO = new AdapterDAO<Turma, Integer>(Turma.class);
	private List<Turma> turmas;
	
	public ConsultaTurmaMB() {
		 turmas =  turmaDAO.buscarTodos();
	}
	
	public List<Turma> getTurmas() {
		return turmas;
	}
	
	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
}
