package br.com.academia.model.dao;

import javax.persistence.EntityManager;

import br.com.academia.model.bean.Turma;
import br.com.academia.util.JPAUtil;

public class TurmaDAO implements GenericDAO {

	Turma turma = new Turma();

	@Override
	public void Salvar() {
		EntityManager manager = new JPAUtil().getEntityManager();
		try {
			manager.persist(turma);
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
			manager.merge(turma);
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
			manager.remove(turma);
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
			manager.find(Turma.class, turma.getId());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
	}

}
