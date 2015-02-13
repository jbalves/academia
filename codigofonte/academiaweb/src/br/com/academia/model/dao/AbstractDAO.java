package br.com.academia.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.academia.model.bean.AbstractBean;
import br.com.academia.util.JPAUtil;

public abstract class AbstractDAO<T extends AbstractBean, k> {
	
	private EntityManager manager;
	private final Class<T> persistent;
	
	public AbstractDAO(Class<T> typo) {
		manager = new JPAUtil().getEntityManager();
		persistent = typo;
	}
	
	public void salvar(T bean){
		
		try {
			manager.getTransaction().begin();
			manager.persist(bean);
			manager.getTransaction().commit();
		} catch (Exception e) {
			e.getStackTrace();
		}finally{
			manager.close();
		}
		
	}
	
	public List<T> buscarTodos(){
		try {
			Query query = manager.createQuery("SELECT m FROM "+ persistent.getName() +" m");
			List<T> lista = query.getResultList();
			return lista;
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}finally{
			manager.close();
		}
		
	}
	
	public void alterar(T bean, k id){
		
		
		try {
			bean.setId((Integer)id);
			manager.getTransaction().begin();
			manager.merge(bean);
			manager.getTransaction().commit();
		} catch (Exception e) {
			e.getStackTrace();
		}finally{
			manager.close();
		}
		
	}
	
	public void deletar(T bean){
		try {
			manager.getTransaction().begin();
			manager.remove(manager.getReference(persistent, bean).getId());
			manager.getTransaction().commit();
		} catch (Exception e) {
			e.getStackTrace();
		}finally{
			manager.close();
		}
		
	}

}
