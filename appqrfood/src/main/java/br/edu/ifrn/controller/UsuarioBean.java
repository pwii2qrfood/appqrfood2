package br.edu.ifrn.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.convert.Converter;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


import br.edu.ifrn.DAO.SituacaoDAO;
import br.edu.ifrn.DAO.UsuarioDAO;
import br.edu.ifrn.model.Usuario;
import br.edu.ifrn.service.CadastroUsuarioService;


@Named
@ViewScoped
public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = 1L;
	@Inject
	private UsuarioDAO usuarios;
	@Inject
	private SituacaoDAO situacao;
	@Inject
	private CadastroUsuarioService cadastroUsuarioService;
	@Inject
	private Usuario usuario;
	
	private List<Usuario> listaUsuario;
	
	private String pesquisa;
	 
	private Converter situacaoConverter;
	
	public void pesquisar() {
		listaUsuario = usuarios.pesquisarPorNome(pesquisa);
		
		if(listaUsuario.isEmpty()) {
			System.out.print("Não possui cadastro de usuário");
		}
	}
	
	public void todosUsuarios() {
		listaUsuario = usuarios.ListarTodos();
	}
	
	public void novoUsuario() {
		usuario = new Usuario();
	}
	
	private boolean houvePesquisa() {
		return pesquisa != null && !"".equals(pesquisa);
	}

	public void atualizarRegistros() {
		if (houvePesquisa())
			pesquisar();
		else
			todosUsuarios();		
	}
	
	public void salvar() {
		cadastroUsuarioService.cadastrar(usuario);
		usuario = null;
		atualizarRegistros();
	}
	
	public void excluir() {
		cadastroUsuarioService.excluir(usuario);
		usuario = null;
		atualizarRegistros();
	}
	
	 
}