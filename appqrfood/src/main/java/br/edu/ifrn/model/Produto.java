package br.edu.ifrn.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table ( name = "produto" )
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY )
	@Column ( name = "id_produto" )
	private int idProduto;
	
	@Column ( name = "nome_produto", nullable = false, length = 45 )
	private String nomeProduto;
	
	@Column ( name = "valor", nullable = false )
	private Double valor;
	
	@Column ( name = "descricao", nullable = false, length = 100 )
	private String descricao;
	
	@ManyToOne
	@JoinColumn ( name = "id_situacao", nullable = false )
	private Situacao situacao;
	
	@ManyToMany ( mappedBy = "produto" )
	private List<Pedido> pedido = new ArrayList<Pedido>();
	
	public Produto () {
		
	}
	
	public Produto ( int idProduto, String nomeProduto, Double valor, String descricao, Situacao situacao ) {
		this.idProduto   = idProduto;
		this.nomeProduto = nomeProduto;
		this.valor       = valor;
		this.descricao   = descricao;
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProduto;
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
		Produto other = (Produto) obj;
		if (idProduto != other.idProduto)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", valor=" + valor + ", descricao="
				+ descricao + ", situacao=" + situacao + "]";
	}
}
