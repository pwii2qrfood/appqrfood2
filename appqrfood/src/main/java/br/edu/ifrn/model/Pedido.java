package br.edu.ifrn.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@OneToOne
	@JoinColumn ( name = "id_situacao_pedido" )
	private SituacaoPedido situacaopedido;
	
}
