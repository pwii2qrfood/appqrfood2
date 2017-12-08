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
@Table ( name = "telefone" )
public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY )
	@Column ( name = "id_telefone")
	private int idTelefone;
	
	@Column ( name = "numero", nullable = false, length = 14 )
	private String numero;
	
	@ManyToOne
	@JoinColumn ( name = "id_usuario", nullable = false )
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn ( name = "id_funcionario", nullable = false)
	private Funcionario funcionario;

	public Telefone() {
		//super();
	}

	public Telefone(int idTelefone, String numero, Usuario usuario, Funcionario funcionario) {
		super();
		this.idTelefone = idTelefone;
		this.numero = numero;
		this.usuario = usuario;
		this.funcionario = funcionario;
	}

	public int getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(int idTelefone) {
		this.idTelefone = idTelefone;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTelefone;
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
		Telefone other = (Telefone) obj;
		if (idTelefone != other.idTelefone)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", numero=" + numero + ", usuario=" + usuario + ", funcionario="
				+ funcionario + "]";
	}
}
