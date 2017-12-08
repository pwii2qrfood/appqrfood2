package br.edu.ifrn.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table ( name = "pedido")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private int idPedido;
	
	
	@OneToOne
	@JoinColumn ( name = "id_situacao_pedido")
	private SituacaoPedido situacaopedido;

}
