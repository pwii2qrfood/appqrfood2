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
@Table ( name = "situacao" )
public class Situacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column ( name = "id_situacao" )
	private int idSituacao;
	
	@Column( name = "tipo_situacao", nullable = false  )
	private String tipoSituacao;
	
	@Column( name = "descricao", nullable = false )
	private String descricao;
	
	@OneToMany ( mappedBy = "situacao" )
	private List<Usuario> usuario = new ArrayList<Usuario>();
	
	@OneToMany ( mappedBy = "situacao" )
	private List<Funcionario> funcionario = new ArrayList<Funcionario>();
	
	@OneToMany ( mappedBy = "situacao" )
	private List<FormaPagamento> formapagamento = new ArrayList<FormaPagamento>();
	
	@OneToMany ( mappedBy = "situacao" )
	private List<Produto> produto = new ArrayList<Produto>();
	
	public Situacao() {
		
	}
	
	public Situacao(int idSituacao, String tipoSituacao, String descricao, List<Usuario> usuario,
			List<Funcionario> funcionario, List<FormaPagamento> formapagamento) {
		//super();
		this.idSituacao = idSituacao;
		this.tipoSituacao = tipoSituacao;
		this.descricao = descricao;
		this.usuario = usuario;
		this.funcionario = funcionario;
		this.formapagamento = formapagamento;
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

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public List<FormaPagamento> getFormapagamento() {
		return formapagamento;
	}

	public void setFormapagamento(List<FormaPagamento> formapagamento) {
		this.formapagamento = formapagamento;
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

	@Override
	public String toString() {
		return "Situacao [idSituacao=" + idSituacao + ", tipoSituacao=" + tipoSituacao + ", descricao=" + descricao
				+ "]";
	}
}
