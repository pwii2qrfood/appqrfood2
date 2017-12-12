package br.edu.ifrn.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifrn.model.Pedido;

public class PedidoDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public PedidoDAO () {
		
	}
	
	public PedidoDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	public void adicionar (Pedido novopedido) {
		manager.persist(novopedido);
	}
	
	public Pedido editar(Pedido pedido) {
		return pedido = pesquisarPorId(pedido.getIdPedido());
	}
	
	public void excluir(Pedido pedido) {
		pedido = pesquisarPorId(pedido.getIdPedido());
		manager.remove(pedido);
	}
	
	public Pedido pesquisarPorId(int idPedido) {
		return manager.find(Pedido.class, idPedido);
	}
	
	public List<Pedido> pesquisarPorNome(String numeroPedido){
		TypedQuery<Pedido> resultado = 
				manager.createQuery("from pedido where numero_pedido like: numero_peddo", Pedido.class);
		resultado.setParameter("numero_pedido", numeroPedido);
		return resultado.getResultList();
	}
	
	
	

}
