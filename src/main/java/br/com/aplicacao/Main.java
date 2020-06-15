package br.com.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    private static EntityManagerFactory emf;

    public static void main(String[] args) {

        emf = Persistence.createEntityManagerFactory("aplicacaoPU");
        EntityManager em = emf.createEntityManager();

        // INSERÇÃO (INSERT) =======================================================================
        Lembrete lembrete = new Lembrete();
        lembrete.setTitulo("Comprar leite");
        lembrete.setDescricao("Hoje, 10h30");

        try {
            em.getTransaction().begin();
            em.persist(lembrete);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("INSERT: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }

    }

}
