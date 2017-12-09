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
@Table ( name = "forma_pagamento" )
public class FormaPagamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY )
	@Column ( name = "id_forma_pagamento" )
	private int idFormaPagamento;
	
	@Column ( name = "tipo_pagamento" )
	private String tipoPagamento;
	
	@Column ( name = "descricao" )
	private String descricao;
	
	@ManyToOne
	@JoinColumn ( name = "id_situacao", nullable = false )
	private Situacao situacao;

	public FormaPagamento() {
		//super();
	}

	public FormaPagamento(int idFormaPagamento, String tipoPagamento, String descricao, Situacao situacao) {
		super();
		this.idFormaPagamento = idFormaPagamento;
		this.tipoPagamento = tipoPagamento;
		this.descricao = descricao;
		this.situacao = situacao;
	}

	public int getIdFormaPagamento() {
		return idFormaPagamento;
	}

	public void setIdFormaPagamentp(int idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idFormaPagamento;
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
		FormaPagamento other = (FormaPagamento) obj;
		if (idFormaPagamento != other.idFormaPagamento)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FormaPagamento [idFormaPagamento=" + idFormaPagamento + ", tipoPagamento=" + tipoPagamento
				+ ", descricao=" + descricao + ", situacao=" + situacao + "]";
	}
}
