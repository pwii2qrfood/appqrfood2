package br.edu.ifrn.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table ( name = "produto_has_pedido" )
public class ProdutoHasPedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY )
	@Column ( name = "id" )
	private int id;
	
	@ManyToOne
	@JoinColumn ( name = "id_usuario" )
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn ( name = "id_produto" )
	private Produto produto;
	
	@ManyToOne
	@JoinColumn ( name = "id_pedido" ) 
	private Pedido pedido;
	
	public ProdutoHasPedido() {
		//super();
	}

	public ProdutoHasPedido(int id, Usuario usuario, Produto produto, Pedido pedido) {
		//super();
		this.id      = id;
		this.usuario = usuario;
		this.produto = produto;
		this.pedido  = pedido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoHasPedido other = (ProdutoHasPedido) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProdutoHasPedido [id=" + id + ", usuario=" + usuario + ", produto=" + produto + ", pedido=" + pedido
				+ "]";
	}	
}
