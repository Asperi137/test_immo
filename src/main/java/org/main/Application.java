package org.main;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    public static void main(String[] args) throws SQLException {

        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.jerome.pu");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        Immeuble I = new Immeuble("3", "rue 3", "ville 3");
        Immeuble I2 = new Immeuble("6", "rue 6", "ville 6");

        entityManager.getTransaction().begin();
        Immeuble immo = (Immeuble) entityManager.find(Immeuble.class, I.getNoImm());
        if (immo == null) {
            entityManager.persist(I);
        }

        immo = (Immeuble) entityManager.find(Immeuble.class, I2.getNoImm());
        if (immo == null) {
            entityManager.persist(I2);
        }
        entityManager.getTransaction().commit();

    }

}
