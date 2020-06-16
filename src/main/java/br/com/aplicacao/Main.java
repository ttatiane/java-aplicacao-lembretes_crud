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

//        // INSERÇÃO (INSERT) =======================================================================
//        Lembrete lembrete = new Lembrete();
//        lembrete.setTitulo("Comprar leite");
//        lembrete.setDescricao("Hoje, 10h30");
//
//        try {
//            em.getTransaction().begin();
//            em.persist(lembrete);
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            em.getTransaction().rollback();
//            System.out.println("INSERT: " + e.getMessage());
//        } finally {
//            em.close();
//            emf.close();
//        }

//        // PROJEÇÃO (SELECT) =======================================================================
//
//        List<Lembrete> lembretes = null;
//
//        try {
//            lembretes = em.createQuery("from Lembrete").getResultList();
//        } catch (Exception e) {
//            System.out.println("LIST ALL: " + e.getMessage());
//        } finally {
//            em.close();
//            emf.close();
//        }
//
//        // exibe resultado
//        if (lembretes != null) {
//            lembretes.forEach(System.out::println);
//        }

//        // SELEÇÃO + PROJEÇÃO (SELECTION) =========================================================================
//
//        Lembrete lembrete = new Lembrete();
//
//        try {
//            lembrete = em.find(Lembrete.class, );
//            System.out.println(lembrete);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            em.close();
//            emf.close();
//        }

//        // SELEÇÃO + PROJEÇÃO (SELECT FROM WHERE) ==========================================
//
//        List<Lembrete> lembretes = null;
//
//        try {
//            lembretes = em.createQuery("from Lembrete l where l.titulo LIKE '%comprar%'").getResultList();
//        } catch (Exception e) {
//            System.out.println("LIST ALL: " + e.getMessage());
//        } finally {
//            em.close();
//            emf.close();
//        }
//
//        if (lembretes != null) {
//            lembretes.forEach(System.out::println);
//        }

//        // ATUALIZAÇÃO (UPDATE) =============================================================
//
//        try {
//            Lembrete lembrete = em.find(Lembrete.class, 1L);
//
//            lembrete.setTitulo("Comprar café");
//            lembrete.setDescricao("Hoje, 8h22");
//
//            em.getTransaction().begin();
//            em.merge(lembrete);
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            em.getTransaction().rollback();
//            System.out.println("UPDATE: " + e.getMessage());
//        } finally {
//            em.close();
//        }

        // REMOÇÃO (DELETE) =============================================================

        try {
            Lembrete lembrete = em.find(Lembrete.class, 1L);

            em.getTransaction().begin();
            em.remove(lembrete);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("DELETE: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }

    }

}
