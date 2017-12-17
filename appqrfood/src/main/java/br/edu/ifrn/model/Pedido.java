package br.edu.ifrn.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table ( name = "pedido" )
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY )
	@Column ( name = "id_pedido" )
	private int idPedido;
	
	@Column ( name = "numero_pedido", nullable = false, length = 10 )
	private String numeroPedido;
	
	@Column ( name = "quantidade", nullable = false, length = 3 )
	private String quantidade;
	
	@Temporal ( TemporalType.DATE )
	@Column ( name = "data_pedido", nullable = false )
	private Date dataPedido;
	
	@Temporal ( TemporalType.TIME )
	@Column ( name = "hora_pedido", nullable = false )
	private Date horaPedido;
	
	@ManyToOne
	@JoinColumn ( name = "id_situacao_pedido", nullable = false )
	private SituacaoPedido situacaopedido;
	
	@ManyToOne 
	@JoinColumn ( name = "id_forma_pagamento", nullable = false )
	private FormaPagamento formapagamento;
	
	@OneToMany ( mappedBy = "pedido" )
	private List<ProdutoHasPedido> produtohaspedido = new ArrayList<ProdutoHasPedido>();
	
	@OneToMany ( mappedBy = "produto" )
	private List<ProdutoHasPedido> produtohaspedido1 = new ArrayList<ProdutoHasPedido>();
	
	@OneToMany ( mappedBy = "usuario" )
	private List<ProdutoHasPedido> produtohaspedido2 = new ArrayList<ProdutoHasPedido>();
	
	public Pedido() {
		//super();
	}

	public Pedido(int idPedido, String numeroPedido, String quantidade, Date dataPedido, Date horaPedido,
			SituacaoPedido situacaopedido, FormaPagamento formapagamento, List<ProdutoHasPedido> produtohaspedido,
			List<ProdutoHasPedido> produtohaspedido1, List<ProdutoHasPedido> produtohaspedido2) {
		//super();
		this.idPedido = idPedido;
		this.numeroPedido = numeroPedido;
		this.quantidade = quantidade;
		this.dataPedido = dataPedido;
		this.horaPedido = horaPedido;
		this.situacaopedido = situacaopedido;
		this.formapagamento = formapagamento;
		this.produtohaspedido = produtohaspedido;
		this.produtohaspedido1 = produtohaspedido1;
		this.produtohaspedido2 = produtohaspedido2;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Date getHoraPedido() {
		return horaPedido;
	}

	public void setHoraPedido(Date horaPedido) {
		this.horaPedido = horaPedido;
	}

	public SituacaoPedido getSituacaopedido() {
		return situacaopedido;
	}

	public void setSituacaopedido(SituacaoPedido situacaopedido) {
		this.situacaopedido = situacaopedido;
	}

	public FormaPagamento getFormapagamento() {
		return formapagamento;
	}

	public void setFormapagamento(FormaPagamento formapagamento) {
		this.formapagamento = formapagamento;
	}

	public List<ProdutoHasPedido> getProdutohaspedido() {
		return produtohaspedido;
	}

	public void setProdutohaspedido(List<ProdutoHasPedido> produtohaspedido) {
		this.produtohaspedido = produtohaspedido;
	}

	public List<ProdutoHasPedido> getProdutohaspedido1() {
		return produtohaspedido1;
	}

	public void setProdutohaspedido1(List<ProdutoHasPedido> produtohaspedido1) {
		this.produtohaspedido1 = produtohaspedido1;
	}

	public List<ProdutoHasPedido> getProdutohaspedido2() {
		return produtohaspedido2;
	}

	public void setProdutohaspedido2(List<ProdutoHasPedido> produtohaspedido2) {
		this.produtohaspedido2 = produtohaspedido2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPedido;
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
		Pedido other = (Pedido) obj;
		if (idPedido != other.idPedido)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", numeroPedido=" + numeroPedido + ", quantidade=" + quantidade
				+ ", dataPedido=" + dataPedido + ", horaPedido=" + horaPedido + ", situacaopedido=" + situacaopedido
				+ ", formapagamento=" + formapagamento + ", produtohaspedido=" + produtohaspedido
				+ ", produtohaspedido1=" + produtohaspedido1 + ", produtohaspedido2=" + produtohaspedido2 + "]";
	}	
}
