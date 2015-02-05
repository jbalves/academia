package br.com.academia.model.dao;

import javax.persistence.EntityManager;

import br.com.academia.model.bean.Endereco;
import br.com.academia.util.JPAUtil;

public class EnderecoDAO implements GenericDAO {

	Endereco endereco = new Endereco();

	@Override
	public void Salvar() {
		EntityManager manager = new JPAUtil().getEntityManager();
		try {
			manager.persist(endereco);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

	}

	@Override
	public void Alterar() {

		EntityManager manager = new JPAUtil().getEntityManager();
		try {
			manager.merge(endereco);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

	}

	@Override
	public void Deletar() {
		EntityManager manager = new JPAUtil().getEntityManager();
		try {
			manager.remove(endereco);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
	}

	@Override
	public void Buscar() {
		EntityManager manager = new JPAUtil().getEntityManager();
		try {
			manager.find(Endereco.class, endereco.getCep());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
	}

}
