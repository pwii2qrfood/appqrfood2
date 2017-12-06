package br.edu.ifrn.view;

import javax.persistence.EntityManager;

import br.edu.ifrn.model.JpaUtil;

public class testePersistencia {

	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
	}

}
