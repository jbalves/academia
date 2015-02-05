package br.com.academia.model.dao;

import javax.persistence.EntityManager;

import br.com.academia.model.bean.Academia;
import br.com.academia.util.JPAUtil;

public class AcademiaDAO implements GenericDAO {

	Academia academia = new Academia();

	@Override
	public void Salvar() {
		EntityManager manager = new JPAUtil().getEntityManager();
		try {
			manager.persist(academia);
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
			manager.merge(academia);
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
			manager.remove(academia);
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
			manager.find(Academia.class, academia.getId());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
	}

}
