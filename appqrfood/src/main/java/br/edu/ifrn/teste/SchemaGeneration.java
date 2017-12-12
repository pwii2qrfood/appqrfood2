package br.edu.ifrn.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifrn.model.Usuario;

public class SchemaGeneration {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("appqrfood");
		
		EntityManager em = emf.createEntityManager();
		
		List<Usuario> lista = em.createQuery("from Usuario", Usuario.class).getResultList();
		
		System.out.println(lista);
		
		em.close();
		emf.close();


	}

}
