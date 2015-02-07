package br.com.academia.controller.mb;

import javax.faces.bean.ManagedBean;

import br.com.academia.model.bean.Academia;
import br.com.academia.model.dao.AdapterDAO;

@ManagedBean
public class AcademiaMB {

//	private Academia academia = new Academia();
//
//	AdapterDAO<Academia, Integer> academiaDAO = new AdapterDAO<Academia, Integer>();
//	
//	public Academia getAcademia() {
//		return academia;
//	}
//	
//	public void salvar(){
//		
//	}
	
	
////
//	public void salvar() {
//		System.out.println("Salvou: \n" + academia.getNome() + "\n"
//				+ academia.getCnpj() + "\n" + academia.getRua() + "\n"
//				+ academia.getNumero() + "\n" + academia.getBairro() + "\n"
//				+ academia.getComplemento() + "\n" + academia.getCep() + "\n"
//				+ academia.getTelefone());
//	}

	public static void main(String[] args) {
		//AcademiaDAO dao = new AcademiaDAO();
		AdapterDAO<Academia, Integer> dao = new AdapterDAO<Academia, Integer>();
		Academia academia = new Academia();
		academia.setNome("nome academia");
		dao.salvar(academia);
	}

}
