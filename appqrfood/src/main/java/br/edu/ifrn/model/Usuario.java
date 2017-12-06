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
@Table(name=" usuario")

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int idCliente;
	
	@Column( name = "nome_completo", nullable = false )
	private String nomeCompletoCliente;
	
	@Column( name = "cpf_cliente", nullable = false, length = 14 )
	private String cpfCliente;
	
	@Column( name = "rg_cliente", nullable = false, length = 10 )
	private String rgCliente;
		
	@Column( name = "tipo_cliente", nullable = false, length = 1 )
	private String tipoCliente;
	
	@Column( name = "nome_cliente", nullable = false, length = 20 )
	private String nomeCliente;
	
	@Column( name = "sobrenome_cliente", nullable = false, length = 20 )
	private String sobrenomeCliente;

	@Column( name = "senha_cliente", nullable = false, length = 8 )
	private String senhaCliente;

	@ManyToOne
	@JoinColumn( name = "id_situacao" )
	private Situacao situacao;

	public Usuario() {
		
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCompletoCliente() {
		return nomeCompletoCliente;
	}

	public void setNomeCompletoCliente(String nomeCompletoCliente) {
		this.nomeCompletoCliente = nomeCompletoCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getRgCliente() {
		return rgCliente;
	}

	public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}

	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
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
		result = prime * result + idCliente;
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
		Usuario other = (Usuario) obj;
		if (idCliente != other.idCliente)
			return false;
		return true;
	}
	
	
}
