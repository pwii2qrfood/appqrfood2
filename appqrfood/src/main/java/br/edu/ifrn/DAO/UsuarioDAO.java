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
		manager.merge(novousuario);
	}
	
	public Usuario pesquisarPorId(int idCliente) {
		return manager.find(Usuario.class, idCliente);
	}
	
	public void remover(Usuario usuario) {
		usuario = pesquisarPorId(usuario.getIdCliente());
		manager.remove(usuario);
	}
	
	public List<Usuario> pesquisar (String nome){
		TypedQuery<Usuario> consulta =
				manager.createQuery("from Usuario where nome_completo like :nome_completo", Usuario.class);
		consulta.setParameter("nome_completo", nome + "%");
		return consulta.getResultList();
	}

}
