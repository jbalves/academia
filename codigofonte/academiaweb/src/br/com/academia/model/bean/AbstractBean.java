package br.com.academia.model.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractBean {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	public AbstractBean() {
		// TODO Auto-generated constructor stub
	}

	public AbstractBean(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
