package br.edu.ifrn.DAO;

import java.io.Serializable;

import javax.persistence.EntityManager;

public class ProdutoHasPedidoDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public ProdutoHasPedidoDAO() {
		
	}
	
	public ProdutoHasPedidoDAO(EntityManager manager) {
		this.manager = manager;
	}

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}	
}
