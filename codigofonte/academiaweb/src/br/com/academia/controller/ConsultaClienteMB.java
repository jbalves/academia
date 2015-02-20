package br.com.academia.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.academia.model.bean.Cliente;
import br.com.academia.model.dao.ClienteDAO;

@ManagedBean
public class ConsultaClienteMB {

	private Cliente cliente = new Cliente();
	private ClienteDAO clienteDAO =  new ClienteDAO();
	private List<Cliente> clientes;
	
	public ConsultaClienteMB() {
		clientes = clienteDAO.buscarTodos();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	
}
