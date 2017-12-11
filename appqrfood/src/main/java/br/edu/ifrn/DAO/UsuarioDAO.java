package br.edu.ifrn.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifrn.model.Usuario;

public class UsuarioDAO implements Serializable {

private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public UsuarioDAO() {
		
	}
	
	public UsuarioDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	public void adicionar(Usuario novousuario) {
		manager.persist(novousuario);
	}

	public Usuario editar(Usuario usuario) {
		return usuario = pesquisarPorId(usuario.getIdUsuario());
	}

	public void excluir(Usuario usuario) {
		usuario = pesquisarPorId(usuario.getIdUsuario());
		manager.remove(usuario);
	}
	
	public Usuario pesquisarPorId(int idUsuario) {
		return manager.find(Usuario.class, idUsuario);
	}
	
	public List<Usuario> pesquisarPorNome (String nomeCompletoUsuario){
		TypedQuery<Usuario> resultado =
				manager.createQuery("from Usuario where nome_completo_usuario like :nome_completo_usuario", Usuario.class);
		resultado.setParameter("nome_completo_usuario", nomeCompletoUsuario + "%");
		return resultado.getResultList();
	}
}
