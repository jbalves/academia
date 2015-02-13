package br.com.academia.teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.academia.model.bean.Cliente;
import br.com.academia.model.bean.Horario;
import br.com.academia.model.bean.Mensalidade;
import br.com.academia.model.bean.Turma;
import br.com.academia.model.dao.AdapterDAO;
import br.com.academia.util.JPAUtil;

public class testeJDBC {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Turma t = new Turma();
		List<Cliente> clientes;
		List<Turma> turmas;
		

		AdapterDAO<Turma, Integer> dao2  = new AdapterDAO<Turma, Integer>(Turma.class);
		AdapterDAO<Cliente, Integer> dao  = new AdapterDAO<Cliente, Integer>(Cliente.class);
	
		turmas = dao2.buscarTodos();
		for (Turma turma : turmas) {
			System.out.println(turma.getModalidade());
		}
//		clientes = dao.buscarTodos();
//		
//		for (Cliente c : clientes) {
//			System.out.println("Nome: "+ c.getNome());
//		}
//		
	}
}
