package br.edu.ifrn.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "situacao" )
public class Situacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int idSituacao;
	
	@Column( name = "tipo_situacao", nullable = false  )
	private String tipoSituacao;
	
	@Column( name = "descricao", nullable = false )
	private String descricao;
	
	public Situacao() {
		
	}
	
	public int getIdSituacao() {
		return idSituacao;
	}

	public void setIdSituacao(int idSituacao) {
		this.idSituacao = idSituacao;
	}

	public String getTipoSituacao() {
		return tipoSituacao;
	}

	public void setTipoSituacao(String tipoSituacao) {
		this.tipoSituacao = tipoSituacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idSituacao;
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
		Situacao other = (Situacao) obj;
		if (idSituacao != other.idSituacao)
			return false;
		return true;
	}	
}
