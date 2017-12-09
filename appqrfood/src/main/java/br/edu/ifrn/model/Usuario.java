package br.edu.ifrn.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

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
@Table ( name= "usuario" )

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column ( name = "id_usuario" )
	private int idUsuario;
	
	@Column ( name = "nome_completo_usuario", nullable = false )
	private String nomeCompletoUsuario;
	
	@Column ( name = "nome_usuario", nullable = false, length = 20 )
	private String nomeUsuario;
	
	@Column ( name = "sobrenome_usuario", nullable = false, length = 20 )
	private String sobrenomeUsuario;
	
	@Column ( name = "senha_usuario", nullable = false, length = 8 )
	private String senhaUsuario;
	
	@Column ( name = "email_usuario", nullable = false, length = 90 )
	private String emailUsuario;
	
	@Column ( name = "cpf_usuario", nullable = false, length = 14 )
	private String cpfUsuario;
	
	@Column ( name = "rg_usuario", nullable = false, length = 10 )
	private String rgUsuario;
	
	@Temporal (TemporalType.DATE)
	@Column ( name = "data_nascimento1" )
	private Date dataNascimento;
		
	@Column ( name = "tipo_usuario", nullable = false, length = 1 )
	private String tipoUsuario;
	
	@ManyToOne
	@JoinColumn ( name = "id_situacao", nullable = false )
	private Situacao situacao;
	
	@OneToMany ( mappedBy = "usuario" )
	private List<Telefone> telefone = new ArrayList<Telefone>();

	public Usuario() {
		
	}
	
	public Usuario(int idUsuario, String nomeCompletoUsuario, String nomeUsuario, String sobrenomeUsuario,
			String senhaUsuario, String emailUsuario, String cpfUsuario, String rgUsuario, String tipoUsuario, Situacao situacao) {
		//super();
		this.idUsuario           = idUsuario;
		this.nomeCompletoUsuario = nomeCompletoUsuario;
		this.nomeUsuario         = nomeUsuario;
		this.sobrenomeUsuario    = sobrenomeUsuario;
		this.senhaUsuario        = senhaUsuario;
		this.emailUsuario        = emailUsuario;
		this.cpfUsuario          = cpfUsuario;
		this.rgUsuario           = rgUsuario;
		this.tipoUsuario         = tipoUsuario;
		this.situacao            = situacao;
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

	public String getEmailUsuario() {
		return emailUsuario;
	}
	
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
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
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
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
		return "Usuario ["
				+ "idUsuario=" + idUsuario + ", nomeCompletoUsuario=" + nomeCompletoUsuario + ", nomeUsuario="
				+ nomeUsuario + ", sobrenomeUsuario=" + sobrenomeUsuario + ", senhaUsuario=" + senhaUsuario
				+ ", emailUsuario=" + emailUsuario + ", cpfUsuario=" + cpfUsuario + ", rgUsuario=" + rgUsuario
				+ ", dataNascimento=" + dataNascimento + ", tipoUsuario=" + tipoUsuario + ", situacao=" + situacao
				+ "]";
	}
}
