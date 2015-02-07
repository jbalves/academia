package br.com.academia.util;

import br.com.academia.model.bean.Academia;
import br.com.academia.model.dao.AcademiaDAO;

public class PopulaAcademia {
	public static void main(String[] args) {
		AcademiaDAO academiaDAO = new AcademiaDAO();
		Academia academia = new Academia();

		academia.setNome("PELES E OSSOS");

		academiaDAO.salvar(academia);
	}

}
