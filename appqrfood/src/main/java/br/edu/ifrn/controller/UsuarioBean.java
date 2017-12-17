package br.edu.ifrn.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class UsuarioBean {
	
	private static Integer NUMERO = 0;
	
	public UsuarioBean() {
		NUMERO ++;
	}
	
	public Integer getNumero() {
		return NUMERO;
		
	}

}
