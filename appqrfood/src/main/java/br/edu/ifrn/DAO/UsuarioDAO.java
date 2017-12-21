package br.edu.ifrn.DAO;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifrn.model.Usuario;


public class UsuarioDAO implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public UsuarioDAO() {
		
	}
	
	public UsuarioDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	public void adicionar(Usuario usuario) {
		manager.persist(usuario);
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
		
		String jpql = "from Usuario where nomeCompletoUsuario like :nomeCompletoUsuario";
		
		TypedQuery<Usuario> resultado = manager.createQuery(jpql, Usuario.class);
		
		resultado.setParameter("nomeCompletoUsuario", nomeCompletoUsuario + "%");
		
		return resultado.getResultList();
	}
	public List<Usuario> ListarTodos() {
        return manager.createQuery("from Usuario", Usuario.class).getResultList();
   }
}
