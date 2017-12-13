package br.edu.ifrn.teste;


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
		 * EntityManager manager = JpaUtil.getEntityManager();
		 */

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("appqrfood");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// Declarando os Repostitórios ou, para mim, declarando DAO

		SituacaoDAO situacaodao = new SituacaoDAO(em);
		UsuarioDAO usuariodao = new UsuarioDAO(em);

		// Buascando as informações no banco

		List<Situacao> listadesituacao = situacaodao.pesquisarPorNome();
		List<Usuario> listadeusuario = usuariodao.pesquisarPorNome("");
		System.out.println(listadeusuario);

		// Criando uma Usuario

		Usuario usuario = new Usuario();

		usuario.setNomeCompletoUsuario("Nonato Aguiar");
		usuario.setNomeUsuario("Nonato");
		usuario.setSobrenomeUsuario("Aguiar");
		usuario.setSenhaUsuario("ocara");
		usuario.setEmailUsuario("aguiar@globo.com");
		usuario.setCpfUsuario("111.111.111-11");
		usuario.setRgUsuario("11.111.111");
		usuario.setDataNascimento(new Date());
		usuario.setTipoUsuario("F");
		usuario.setSituacao(listadesituacao.get(0));

		// Salva Usuario

		usuariodao.adicionar(usuario);

		// Finalizar transação

		em.getTransaction().commit();

		// Verificar se a inserção funcionou!

		List<Usuario> listaEmpresa2 = usuariodao.pesquisarPorNome("");

		System.out.println(listaEmpresa2);

	}

}
