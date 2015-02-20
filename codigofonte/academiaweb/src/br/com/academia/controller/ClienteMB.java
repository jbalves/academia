package br.com.academia.controller;

import javax.faces.bean.ManagedBean;

import br.com.academia.model.bean.Cliente;
import br.com.academia.model.dao.ClienteDAO;

@ManagedBean
public class ClienteMB {

	private Cliente cliente;
	private ClienteDAO clienteDAO = new ClienteDAO();

	public ClienteMB() {
		cliente = new Cliente();
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void salvar(){
		clienteDAO.salvar(cliente);
	}

}