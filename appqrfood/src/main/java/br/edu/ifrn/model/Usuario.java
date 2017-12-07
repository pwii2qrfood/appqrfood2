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
	@Column ( name = "id_usuario" )
	private int idUsuario;
	
	@Column( name = "nome_completo_usuario", nullable = false )
	private String nomeCompletoUsuario;
	
	@Column( name = "cpf_usuario", nullable = false, length = 14 )
	private String cpfUsuario;
	
	@Column( name = "rg_usuario", nullable = false, length = 10 )
	private String rgUsuario;
		
	@Column( name = "tipo_usuario", nullable = false, length = 1 )
	private String tipoUsuario;
	
	@Column( name = "nome_usuario", nullable = false, length = 20 )
	private String nomeUsuario;
	
	@Column( name = "sobrenome_usuario", nullable = false, length = 20 )
	private String sobrenomeUsuario;

	@Column( name = "senha_usuario", nullable = false, length = 8 )
	private String senhaUsuario;

	@ManyToOne
	@JoinColumn( name = "id_situacao" )
	private Situacao situacao;

	public Usuario() {
		
	}
	
	public Usuario(int idUsuario, String nomeCompletoUsuario, String cpfUsuario, String rgUsuario, String tipoUsuario,
			String nomeUsuario, String sobrenomeUsuario, String senhaUsuario, Situacao situacao) {
		super();
		this.idUsuario = idUsuario;
		this.nomeCompletoUsuario = nomeCompletoUsuario;
		this.cpfUsuario = cpfUsuario;
		this.rgUsuario = rgUsuario;
		this.tipoUsuario = tipoUsuario;
		this.nomeUsuario = nomeUsuario;
		this.sobrenomeUsuario = sobrenomeUsuario;
		this.senhaUsuario = senhaUsuario;
		this.situacao = situacao;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeCompletoUsuario() {
		return nomeCompletoUsuario;
	}

	public void setNomeCompletoUsuario(String nomeCompletoUsuario) {
		this.nomeCompletoUsuario = nomeCompletoUsuario;
	}

	public String getCpfUsuario() {
		return cpfUsuario;
	}

	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

	public String getRgUsuario() {
		return rgUsuario;
	}

	public void setRgUsuario(String rgUsuario) {
		this.rgUsuario = rgUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSobrenomeUsuario() {
		return sobrenomeUsuario;
	}

	public void setSobrenomeUsuario(String sobrenomeUsuario) {
		this.sobrenomeUsuario = sobrenomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
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
		result = prime * result + idUsuario;
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
		if (idUsuario != other.idUsuario)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nomeCompletoUsuario=" + nomeCompletoUsuario + ", cpfUsuario="
				+ cpfUsuario + ", rgUsuario=" + rgUsuario + ", tipoUsuario=" + tipoUsuario + ", nomeUsuario="
				+ nomeUsuario + ", sobrenomeUsuario=" + sobrenomeUsuario + ", senhaUsuario=" + senhaUsuario
				+ ", situacao=" + situacao + "]";
	}	
}
