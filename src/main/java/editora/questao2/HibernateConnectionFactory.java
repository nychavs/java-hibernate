/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editora.questao2;

/**
 *
 * @author ht3015955
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateConnectionFactory {
    private static EntityManagerFactory emf;
    public static EntityManager getEntityManager() {
       try {
         if (emf == null)
              emf = Persistence.createEntityManagerFactory("editoralivros");
       } catch(Exception e) {
         e.printStackTrace();
       }
       return emf.createEntityManager();    
    }
}