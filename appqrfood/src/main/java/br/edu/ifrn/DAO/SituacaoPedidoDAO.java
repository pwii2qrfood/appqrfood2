package br.edu.ifrn.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifrn.model.SituacaoPedido;

public class SituacaoPedidoDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public SituacaoPedidoDAO () {
		
	}
	
	public SituacaoPedidoDAO (EntityManager manager) {
		this.manager = manager;
	}
	
	public void adicionar(SituacaoPedido novosituacaopedido) {
		manager.persist(novosituacaopedido);
	}
	
	public SituacaoPedido editar(SituacaoPedido situacaopedido) {
		return situacaopedido = pesquisaPorId(situacaopedido.getIdSituacaoPedido());
	}
	
	public void excluir(SituacaoPedido situacaopedido) {
		situacaopedido = pesquisaPorId(situacaopedido.getIdSituacaoPedido());
		manager.remove(situacaopedido);
	}
	
	public SituacaoPedido pesquisaPorId(int idSituacaoPedido) {
		return manager.find(SituacaoPedido.class, idSituacaoPedido);
	}
	
	public List<SituacaoPedido> pesquisaPorNome(String tipoSituacaoPedido){
		TypedQuery<SituacaoPedido> resultado =
				manager.createQuery("select from SituacaoPedido where tipo_situacao_pedido like: tipo_situacao_pedido", SituacaoPedido.class);
		resultado.setParameter("tipo_situacao_pedido", tipoSituacaoPedido + "%");
		return resultado.getResultList();
	}
}
