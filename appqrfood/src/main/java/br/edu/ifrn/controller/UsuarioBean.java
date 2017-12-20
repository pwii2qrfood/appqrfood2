package br.edu.ifrn.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.edu.ifrn.DAO.SituacaoDAO;
import br.edu.ifrn.model.Situacao;
import br.edu.ifrn.model.Usuario;

@Named(value = "usuarioBean")
@ViewScoped
public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public Situacao[] getSituacao() {
		return Situacao.class();
		
	}
	
	
}