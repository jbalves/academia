package br.com.academia.model.dao;

import br.com.academia.model.bean.AbstractBean;

public class AdapterDAO<T extends AbstractBean, K> extends AbstractDAO<T, K> {

	public AdapterDAO(Class<T> typo) {
		super(typo);
		// TODO Auto-generated constructor stub
	}
	
	

}
