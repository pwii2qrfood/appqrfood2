package br.edu.ifrn.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.edu.ifrn.DAO.UsuarioDAO;
import br.edu.ifrn.model.Usuario;
import br.edu.ifrn.util.Transacional;

public class CadastroUsuarioService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioDAO usuariodao;
	
	@Transacional
	public void cadastrar(Usuario usuario) {
		usuariodao.adicionar(usuario);
	}
	
	@Transacional
	public void excluir (Usuario usuario) {
		usuariodao.excluir(usuario);
	}
	
	public Usuario editar (Usuario usuario) {
		usuario = usuariodao.editar(usuario);
		return usuario;
	}
}
