/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yassir.restapimessanger.restapimessanger002.service;

import com.yassir.restapimessanger.restapimessanger002.dao.MessageFacade;
import com.yassir.restapimessanger.restapimessanger002.database.DatabaseClass;
import com.yassir.restapimessanger.restapimessanger002.entity.Message;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import org.eclipse.persistence.internal.databaseaccess.DatabaseAccessor;

/**
 *
 * @author yassir
 */
public class MessageService {
    
    private Map<Long, Message> messages = DatabaseClass.getMappedMessages();

    public MessageService() {
        
    }
    
    public List<Message> getAllMessages(){
        MessageFacade messageFacade = new MessageFacade();
        List<Message> list = messageFacade.getMessages();
        
        messageFacade.close();
        
        for (long i = 1; i <= list.size(); i++) {
            messages.put(i, list.get((int) (i-1)));
        }
        return list;
    }

    public Message getMessage(long messageId) {
        return messages.get(messageId);
    }
    
    public Message addMessage(Message message){
        
        message.setId(messages.size()+1);
        messages.put((long)message.getId(), message);
        
        MessageFacade messageFacade = new MessageFacade();
        messageFacade.addNewMessage(message);
        messageFacade.close();
        
        return message;
    }

    public Message updateMessage(Message message) {
        if(message.getId() <= 0){
            return null;
        }
        messages.put((long)message.getId(), message);
        
        MessageFacade messageFacade = new MessageFacade();
        messageFacade.updateNewMessage(message);
        messageFacade.close();
        
        return message;
    }

    public Message removeMessage(int id) {
        MessageFacade messageFacade = new MessageFacade();
        messageFacade.removeMessage(id);
        messageFacade.close();
        
        return messages.remove((long)id);
    }
    
}
