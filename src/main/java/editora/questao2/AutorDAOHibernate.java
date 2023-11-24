/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editora.questao2;

import javax.persistence.EntityManager;

/**
 *
 * @author ht3015955
 */
public class AutorDAOHibernate {
    public void inserir(Autor autor){
        EntityManager em = HibernateConnectionFactory.getEntityManager();
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }
    
}
