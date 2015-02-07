package br.com.academia.util;

import javax.persistence.EntityManager;

import br.com.academia.model.bean.Academia;
import br.com.academia.model.dao.AcademiaDAO;

public class PopulaEndereco {
	public static void main(String[] args) {
		AcademiaDAO academiaDAO = new AcademiaDAO();
		Academia academia = new Academia();

		
		academia.setNome("PELES E OSSOS");
		academia.setCnpj("77625064204");
		academiaDAO.salvar(academia);
	
	}

}
