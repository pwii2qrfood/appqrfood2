package br.edu.ifrn.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifrn.model.Produto;

public class ProdutoDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public ProdutoDAO() {
		
	}
	
	public ProdutoDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	public void adicionar(Produto produto) {
		manager.persist(produto);
	}
	
	public Produto editar(Produto produto) {
		return produto = pesquisarPorId(produto.getIdProduto());
	}
	
	public void excluir(Produto produto) {
		produto = pesquisarPorId(produto.getIdProduto());
		manager.remove(produto);
	}
	
	public Produto pesquisarPorId(int idProduto) {
		return manager.find(Produto.class, idProduto);
	}
	
	public List<Produto> pesquisarPorNome(String nomeProduto){
		TypedQuery<Produto> resultado = 
				manager.createQuery("from produto where nome_produto like: nome_produto", Produto.class);
		resultado.setParameter("nome_produto", nomeProduto + "%");
		return resultado.getResultList();
	}

}
