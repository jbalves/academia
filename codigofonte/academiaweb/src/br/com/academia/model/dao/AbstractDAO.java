package br.com.academia.model.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.academia.model.bean.AbstractBean;
import br.com.academia.util.JPAUtil;



public abstract class AbstractDAO<T extends AbstractBean, K> {

		
	private EntityManager entityManager ;

	private Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public AbstractDAO() {
		ParameterizedType type = (ParameterizedType)getClass().getGenericSuperclass();
		persistentClass = (Class<T>)type.getActualTypeArguments()[0];
		entityManager = new JPAUtil().getEntityManager();
	}
	
	public void salvar(T entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
	}

	public void editar(T entity) {
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
	}

	public void excluir(T entity) {
		entityManager.getTransaction().begin();
		//evitar o erro de enviar objeto do tipo detached, pois so pode ser removido do tipo managent
		entityManager.remove(entityManager.getReference(persistentClass, entity).getId());
		entityManager.getTransaction().commit();

	}
	
	public List<T> listar() {
		return entityManager.createQuery(("From " + persistentClass.getName()))
				.getResultList();
	}
	
	public List<T> listarTodos() {
		Query query = entityManager.createQuery(("Select t FROM " + persistentClass.getName() + " t"));
		List<T> lista = query.getResultList();
		return lista;
	}
	
	
	public T getByPrimaryKey(T entity) {
		return entityManager.find(persistentClass, entity.getId());
	}
	
	public T getByPrimaryKey(K key) {
		return entityManager.find(persistentClass, key);
	}



	public EntityManager getEntityManager() {
		return entityManager;
	}

}
