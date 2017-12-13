package br.edu.ifrn.DAO;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifrn.model.Situacao;

public class SituacaoDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public SituacaoDAO() {
		
	}
	
	public SituacaoDAO (EntityManager manager) {
		this.manager = manager;
	}
	
	public void adicionar (Situacao novasituacao) {
		manager.persist(novasituacao);
	}

	public Situacao editar (Situacao situacao) {
		return situacao = pesquisarPorID(situacao.getIdSituacao());
	}
	
	public void excluir (Situacao situacao) {
		situacao = pesquisarPorID(situacao.getIdSituacao());
		manager.remove(situacao);
	}

	public Situacao pesquisarPorID (int idSituacao){
		return manager.find(Situacao.class, idSituacao);
	}
	
	public List<Situacao> pesquisarPorNome(){
		TypedQuery<Situacao> resultado = 
				manager.createQuery("from Situacao where tipoSituacao like:tipoSituacao", Situacao.class);
		resultado.setParameter("tipoSituacao", "%");
		return resultado.getResultList();
	}
}
