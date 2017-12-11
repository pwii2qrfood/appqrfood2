package br.edu.ifrn.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifrn.model.Telefone;

public class TelefoneDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public TelefoneDAO() {
		
	}
	
	public TelefoneDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	public void adicionar(Telefone telefone) {
		manager.persist(telefone);
	}
	
	public Telefone editar(Telefone telefone) {
		return telefone = pesquisaPorId(telefone.getIdTelefone());
	}
	
	public void excluir(Telefone telefone) {
		telefone = pesquisaPorId(telefone.getIdTelefone());
		manager.remove(telefone);
	}
	
	public Telefone pesquisaPorId(int idTelefone) {
		return manager.find(Telefone.class, idTelefone);
	}
	
	public List<Telefone> pesquisarPorTelefone(String numero){
		TypedQuery<Telefone> resultado =
				manager.createQuery("from telefone where numero like: numero", Telefone.class);
		resultado.setParameter("numero", numero + "%");
		return resultado.getResultList();
	}
}
