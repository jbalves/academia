package br.com.academia.controller;

import javax.faces.bean.ManagedBean;

import br.com.academia.model.bean.Cliente;
import br.com.academia.model.dao.ClienteDAO;

@ManagedBean
public class ClienteMB {

	private Cliente cliente = new Cliente();
	private ClienteDAO clienteDAO = new ClienteDAO();
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void salvar(){
		System.out.println("Nome: " +cliente.getNome());
	}
}
