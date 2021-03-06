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
@Table ( name =  "funcionario" )
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY )
	@Column ( name = "id_funcionario" )
	private int idFuncionario;
	
	@Column ( name = "matricula", nullable = false, length = 13 )
	private int matricula;
	
	@Column ( name = "nome_completo_funcionario", nullable = false, length = 150 )
	private String nomeCompletoFuncionario;
	
	@Column ( name = "nome_funcionario", nullable = false, length = 20 )
	private String nomeFuncionario;
	
	@Column ( name = "sobrenome_funcionario", nullable = false, length = 20 )
	private String sobrenomeFuncionario;
	
	@Column ( name = "senha_funcionario", nullable = false,  length = 8 )
	private String senhaFuncionario;

	@Column ( name = "email_funcionario", nullable = false, length = 90 )
	private String emailFuncionario;
	
	@Column ( name = "cpf_funcionario", nullable = false, length = 14 )
	private String cpfFuncionario;
	
	@Column ( name = "rg_funcionario", nullable = false, length = 10 )
	private String rgFuncionario;
	
	@Temporal ( TemporalType.DATE )
	@Column ( name = "data_nascimento", nullable = false )
	private Date dataNascimento;
	
	@Temporal ( TemporalType.DATE )
	@Column ( name = "data_admissao", nullable = false )
	private Date dataAdmissao;
	
	@Temporal ( TemporalType.DATE )
	@Column ( name = "data_demissao", nullable = false )
	private Date dataDemissao;
	
	@ManyToOne
	@JoinColumn ( name = "id_situacao", nullable = false )
	private Situacao situacao;
	
	@OneToMany ( mappedBy = "funcionario" )
	private List<Telefone> telefone = new ArrayList<Telefone>();
		
	public Funcionario() {
	
	}

	public Funcionario(int idFuncionario, int matricula, String nomeCompletoFuncionario, String nomeFuncionario,
			String sobrenomeFuncionario, String senhaFuncionario, String emailFuncionario, String cpfFuncionario, String rgFuncionario,
			Date dataNascimento, Date dataAdmissao, Date dataDemissao, Situacao situacao) {
		super();
		this.idFuncionario           = idFuncionario;
		this.matricula               = matricula;
		this.nomeCompletoFuncionario = nomeCompletoFuncionario;
		this.nomeFuncionario         = nomeFuncionario;
		this.sobrenomeFuncionario    = sobrenomeFuncionario;
		this.senhaFuncionario        = senhaFuncionario;
		this.emailFuncionario        = emailFuncionario;
		this.cpfFuncionario          = cpfFuncionario;
		this.rgFuncionario           = rgFuncionario;
		this.dataNascimento          = dataNascimento;
		this.dataAdmissao            = dataAdmissao;
		this.dataDemissao            = dataDemissao;
		this.situacao                = situacao;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNomeCompletoFuncionario() {
		return nomeCompletoFuncionario;
	}

	public void setNomeCompletoFuncionario(String nomeCompletoFuncionario) {
		this.nomeCompletoFuncionario = nomeCompletoFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getSobrenomeFuncionario() {
		return sobrenomeFuncionario;
	}

	public void setSobrenomeFuncionario(String sobrenomeFuncionario) {
		this.sobrenomeFuncionario = sobrenomeFuncionario;
	}

	public String getSenhaFuncionario() {
		return senhaFuncionario;
	}

	public void setSenhaFuncionario(String senhaFuncionario) {
		this.senhaFuncionario = senhaFuncionario;
	}

	public String getEmailFuncionario() {
		return emailFuncionario;
	}

	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}

	public String getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public String getRgFuncionario() {
		return rgFuncionario;
	}

	public void setRgFuncionario(String rgFuncionario) {
		this.rgFuncionario = rgFuncionario;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
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
		result = prime * result + idFuncionario;
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
		Funcionario other = (Funcionario) obj;
		if (idFuncionario != other.idFuncionario)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", matricula=" + matricula + ", nomeCompletoFuncionario="
				+ nomeCompletoFuncionario + ", nomeFuncionario=" + nomeFuncionario + ", sobrenomeFuncionario="
				+ sobrenomeFuncionario + ", senhaFuncionario=" + senhaFuncionario + ", emailFuncionario="
				+ emailFuncionario + ", cpfFuncionario=" + cpfFuncionario + ", rgFuncionario=" + rgFuncionario + ", dataNascimento=" + dataNascimento
				+ ", dataAdmissao=" + dataAdmissao + ", dataDemissao=" + dataDemissao + ", situacao=" + situacao + "]";
	}

	
}
