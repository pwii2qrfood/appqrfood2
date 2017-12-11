package br.edu.ifrn.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifrn.model.Funcionario;

public class FuncionarioDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public FuncionarioDAO () {
		
	}
	
	public FuncionarioDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	public void adicionar(Funcionario novofuncionario) {
		manager.persist(novofuncionario);
	}

	public Funcionario editar(Funcionario funcionario) {
		return funcionario = pesquisarPorId(funcionario.getIdFuncionario());		
	}
	
	public void excluir(Funcionario funcionario) {
		funcionario = pesquisarPorId(funcionario.getIdFuncionario());
		manager.remove(funcionario);
	}
	
	public Funcionario pesquisarPorId(int idFuncionario){
		return manager.find(Funcionario.class, idFuncionario);		
	}
	
	public List<Funcionario> pesquisarPorNome(String nomeCompletoFuncionario){
		TypedQuery<Funcionario> resultado = 
				manager.createQuery("from from funcionario where nome_Completo_Funcionario like: nome_Completo_Funcionario", Funcionario.class);
		resultado.setParameter("nome_completo_funcionario", nomeCompletoFuncionario + "%");
		return resultado.getResultList();
	}
	

}
