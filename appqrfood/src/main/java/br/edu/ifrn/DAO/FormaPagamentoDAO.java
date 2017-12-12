package br.edu.ifrn.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifrn.model.FormaPagamento;

public class FormaPagamentoDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public FormaPagamentoDAO() {
		
	}
	
	public FormaPagamentoDAO(EntityManager manager) {
		this.manager =  manager;
	}
	
	public void adicionar(FormaPagamento novoformapagamento) {
		manager.persist(novoformapagamento);
	}
	
	public FormaPagamento editar(FormaPagamento formapagamento) {
		return formapagamento = pesquisarPorID(formapagamento.getIdFormaPagamento());
	}
	
	public void excluir(FormaPagamento formapagamento) {
		formapagamento = pesquisarPorID(formapagamento.getIdFormaPagamento());
		manager.remove(formapagamento);
	}
	
	public FormaPagamento pesquisarPorID(int idFormaPagamento) {
		return manager.find(FormaPagamento.class, idFormaPagamento);
	}
	
	public List<FormaPagamento> pesquisaPorId(String tipoPagamento){
		TypedQuery<FormaPagamento> resultado = 
				manager.createQuery("from formapagamento where tipo_pagamento like: tipo_pagamento", FormaPagamento.class);
		resultado.setParameter("tipo_pagamento", tipoPagamento);
		return resultado.getResultList();
	}
	
	

}
