package br.com.rtsistema.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

/**
 *
 * @author Helton
 */
public class GerenciadorPersistencia {

    private static EntityManagerFactory entityManager;

    static {
        entityManager = Persistence.
                createEntityManagerFactory("rtisuportePU");
    }

    public static EntityManager getEntityManager() {
        return entityManager.createEntityManager();
    }

    public static void main(String[] args) {
        new GerenciadorPersistencia();
    }

}
