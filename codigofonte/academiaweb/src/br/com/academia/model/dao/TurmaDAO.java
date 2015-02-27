package br.com.academia.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.academia.model.bean.Turma;
import br.com.academia.util.JPAUtil;

public class TurmaDAO extends AbstractDAO<Turma, Integer> {
	private EntityManager manager;

	public TurmaDAO() {
		super(Turma.class);
		manager = new JPAUtil().getEntityManager();
	}

	public List<Turma> buscarNome(Turma turma) {
			
		try{
			Query query = manager
					.createQuery("Select t from Turma t where t.modalidade like :pTurma");
			query.setParameter("pTurma", "%" + turma.getModalidade() + "%");
			return query.getResultList();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			manager.close();
		}
		
	}

}
