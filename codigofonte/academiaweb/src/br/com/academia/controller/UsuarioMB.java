package br.com.academia.controller;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.academia.model.bean.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioMB {
	private Usuario usuario = new Usuario();
	private String nomeUsuario;
	private String senha;

	public String login() {
		FacesContext context = FacesContext.getCurrentInstance();

		if ("admin".equals(this.nomeUsuario) && "123".equals(this.senha)) {

			this.usuario.setNome(this.nomeUsuario);
			this.usuario.setDataLogin(new Date());

			return "index.xhtml?faces-redirect=true";

		} else {
			FacesMessage mensagem = new FacesMessage("Usuário/Senha inválidos!");
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		}

		return null;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext()
				.invalidateSession();
		return "login.xhtml?faces-redirect=true";
	}

}
