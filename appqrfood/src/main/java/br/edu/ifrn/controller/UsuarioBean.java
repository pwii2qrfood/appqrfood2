package br.edu.ifrn.controller;


import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private static Integer numero = 0;
	
	public UsuarioBean() {
		numero ++;
		System.out.println(numero);
	}
	
	public Integer getNumero() {
		return numero;
	}
}
