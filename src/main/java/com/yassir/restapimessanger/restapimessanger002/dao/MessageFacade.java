/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yassir.restapimessanger.restapimessanger002.dao;

import com.yassir.restapimessanger.restapimessanger002.entity.Message;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author yassir
 */
public class MessageFacade {
    
    private final EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("MessangerPU");
    private final EntityManager em = emFactory.createEntityManager();
    
    
    
    public MessageFacade() {
    }
    
    public List<Message> getMessages(){
        List<Message> list = em.createNamedQuery("Message.findAll", Message.class).getResultList();
        return list;
    }

    public void addNewMessage(Message message) {
        em.getTransaction().begin();
        em.persist(message);
        em.getTransaction().commit();
    }
    
    public void updateNewMessage(Message message) {
        System.out.println("........."+message.getId() + message.getMessage());
        em.getTransaction().begin();
        em.createQuery("UPDATE Message msg SET msg.message = :updatedMessage WHERE msg.id = :id")
                .setParameter("updatedMessage", message.getMessage())
                .setParameter("id", message.getId())
                .executeUpdate();
        em.getTransaction().commit();
    }

    public void removeMessage(int id) {
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Message AS m WHERE m.id = :id")
                .setParameter("id", id)
                .executeUpdate();
        em.getTransaction().commit();
    }
    
    
    public void close(){
        em.close();
    }
}
