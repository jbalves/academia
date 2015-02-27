package br.com.academia.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.academia.model.bean.Cliente;
import br.com.academia.model.dao.ClienteDAO;

@ManagedBean
@ViewScoped
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

	public String visualizar() {
		return "/visualizarCliente.xhtml?faces-redirect=true";
	}
	
	
	public String alterar() {
		clienteDAO.alterar(cliente, cliente.getId());
		return "/cadastroCliente.xhtml?faces-redirect=true";
	}

	public String mensalidade() {
		// clienteDAO.alterar(cliente, cliente.getId());
		return "/mensalidade.xhtml?faces-redirect=true";
	}

	public void salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		clienteDAO.salvar(cliente);
		context.addMessage(null, new FacesMessage("Salvo com sucesso !!!"));
	}
}