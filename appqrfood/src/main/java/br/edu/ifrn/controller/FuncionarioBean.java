package br.edu.ifrn.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;

import javax.inject.Named;


import br.edu.ifrn.model.Funcionario;


@Named (value = "funcionarioBean")
@ViewScoped
public class FuncionarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Funcionario funcionario;
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	
	public String ajuda() {
		return "cadastrousuarios?faces-redirect=true";
	}
	
	public void salvar() {
		System.out.println("Nome Funcionario: " + getFuncionario());
	}
}
