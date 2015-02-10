package br.com.academia.controller.mb;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.academia.model.bean.Academia;
import br.com.academia.model.dao.AdapterDAO;

@ManagedBean
@ViewScoped
public class AcademiaMB {

	private Academia academia = new Academia();
	AdapterDAO<Academia,Integer> academiaDAO = new AdapterDAO<Academia, Integer>();
	

	
	public Academia getAcademia() {
		return academia;
	}

	public void salvar() {
		academiaDAO.salvar(academia);
	}
}
