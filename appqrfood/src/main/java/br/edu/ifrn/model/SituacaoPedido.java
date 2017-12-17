package br.edu.ifrn.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table ( name = "situacao_pedido" )
public class SituacaoPedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY )
	@Column ( name = "id_situacao_pedido" )
	private int idSituacaoPedido;
	
	@Column ( name = "tipo_situacao_pedido", nullable = false, length = 1 )
	private String tipoSituacaoPedido;
	
	@Column ( name = "descricao", nullable = true, length = 100 )
	private String descricao;
	
	@OneToMany ( mappedBy = "situacaopedido" )
	private List<Pedido> pedido = new ArrayList<Pedido>();

	public SituacaoPedido() {
		//super();
	}
		
	public SituacaoPedido(int idSituacaoPedido, String tipoSituacaoPedido, String descricao, List<Pedido> pedido) {
		super();
		this.idSituacaoPedido = idSituacaoPedido;
		this.tipoSituacaoPedido = tipoSituacaoPedido;
		this.descricao = descricao;
		this.pedido = pedido;
	}

	public int getIdSituacaoPedido() {
		return idSituacaoPedido;
	}

	public void setIdSituacaoPedido(int idSituacaoPedido) {
		this.idSituacaoPedido = idSituacaoPedido;
	}

	public String getTipoSituacaoPedido() {
		return tipoSituacaoPedido;
	}

	public void setTipoSituacaoPedido(String tipoSituacaoPedido) {
		this.tipoSituacaoPedido = tipoSituacaoPedido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		result = prime * result + idSituacaoPedido;
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
		SituacaoPedido other = (SituacaoPedido) obj;
		if (idSituacaoPedido != other.idSituacaoPedido)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SituacaoPedido [idSituacaoPedido=" + idSituacaoPedido + ", tipoSituacaoPedido=" + tipoSituacaoPedido
				+ ", descricao=" + descricao + ", pedido=" + pedido + "]";
	}
}
