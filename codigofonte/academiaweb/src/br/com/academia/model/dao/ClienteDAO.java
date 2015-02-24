package br.com.academia.model.dao;

import java.util.List;

import br.com.academia.model.bean.Cliente;

public class ClienteDAO extends AbstractDAO<Cliente, Integer> {

	
	public ClienteDAO() {
		super(Cliente.class);
		// TODO Auto-generated constructor stub
	}

	public List<Cliente> buscarNome(){
		return null;
	}
	
	
}
