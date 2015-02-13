package br.com.academia.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.tomcat.util.modeler.ManagedBean;

import br.com.academia.model.bean.Cliente;
import br.com.academia.model.dao.AdapterDAO;
import br.com.academia.util.JPAUtil;

public class Teste {

	public static void main(String[] args) {
	
		Cliente c= new Cliente();
		c.setNome("Teste Cliente");
		//AdapterDAO<Cliente, Integer> dao = new AdapterDAO<Cliente, Integer>(Cliente.class);
		
		//dao.salvar(c);
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("academia");
//		EntityManager em= emf.createEntityManager();
//		em.getTransaction().begin();
//	em.persist(c);
//	em.getTransaction().commit();
//	
	}

}
