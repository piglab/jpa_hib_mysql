package com.olitho.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by thomas on 02/01/2017.
 */
public class Run
{
    public static void main(String[] args)
    {
        try
        {
            System.out.print("start......................");
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(new User("toto@titi.fr_"+System.currentTimeMillis()));
            em.getTransaction().commit();            System.out.print("end......................");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
