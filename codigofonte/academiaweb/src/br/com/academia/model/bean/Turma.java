package br.com.academia.model.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Turma {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		private String modalidade;
		private String Instrutor;		
		private List<Pessoa> clientes;		
		private Date horarioInicio;
		private Date horarioFim;
		public String getModalidade() {
			return modalidade;
		}
		public void setModalidade(String modalidade) {
			this.modalidade = modalidade;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getInstrutor() {
			return Instrutor;
		}
		public void setInstrutor(String instrutor) {
			Instrutor = instrutor;
		}
		public List<Pessoa> getClientes() {
			return clientes;
		}
		public void setClientes(List<Pessoa> clientes) {
			this.clientes = clientes;
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
				
}
