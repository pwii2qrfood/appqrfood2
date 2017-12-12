package br.edu.ifrn.teste;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifrn.DAO.SituacaoDAO;
import br.edu.ifrn.DAO.UsuarioDAO;
import br.edu.ifrn.model.Situacao;
import br.edu.ifrn.model.Usuario;


public class testePersistencia {

	public static void main(String[] args) {
		/*
		EntityManager manager = JpaUtil.getEntityManager();
		*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("appqrfood");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		// Declarando os Repostitórios ou, para mim, declarando DAO
		
		SituacaoDAO situacaodao = new SituacaoDAO(em);
		UsuarioDAO usuariodao = new UsuarioDAO(em);
		
		//Buascando as informações no banco
		
		List<Situacao> listadesituacao = situacaodao.pesquisarPorNome("");
		List<Usuario> listadeusuario = usuariodao.pesquisarPorNome("");
		System.out.println(listadeusuario);
		
		//Criando uma empresa
		
		//SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Usuario usuario = new Usuario();
		
		usuario.setNomeCompletoUsuario("Saci2");
		usuario.setNomeUsuario("Saci Preto2");
		usuario.setSobrenomeUsuario("silva2");
		usuario.setSenhaUsuario("chupa2");
		usuario.setEmailUsuario("saci2@globo.com");
		usuario.setCpfUsuario("976.567.654-33");
		usuario.setRgUsuario("33.543.234");
		usuario.setDataNascimento(new Date());
		usuario.setTipoUsuario("J");
		usuario.setSituacao(listadesituacao.get(0));
		
		//Salva Usuario
		
		usuariodao.adicionar(usuario);
		
		//Finalizar transação
		
		em.getTransaction().commit();
		
		//Verificar se a inserção funcionou!
		
		List<Usuario> listaEmpresa2 = usuariodao.pesquisarPorNome("");
		
		System.out.println(listaEmpresa2);
		
	}

}
