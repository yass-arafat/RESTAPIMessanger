/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yassir.restapimessanger.restapimessanger002.resource;

import com.yassir.restapimessanger.restapimessanger002.entity.Message;
import com.yassir.restapimessanger.restapimessanger002.service.MessageService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author yassir
 */
@Path("messages")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class MessageResource {
    
    MessageService messagesService = new MessageService();
    
    @GET
    public List<Message> getAllMessages(){
        return messagesService.getAllMessages();
    }
    
    @GET
    @Path("/{messageId}")
    public Message getMessageById(@PathParam("messageId") long messageId){
        return messagesService.getMessage(messageId);
    }
    
    @POST
    public Message addMessage(Message message){
        return messagesService.addMessage(message);
    }
    
    @PUT
    @Path("/{messageId}")
    public Message updateMessage(@PathParam("messageId") Integer id, Message message){
        message.setId(id);
        return messagesService.updateMessage(message);
    }
    
    @DELETE
    @Path("/{messageId}")
    public void deleteMessage(@PathParam("messageId") Integer id){
        messagesService.removeMessage(id);
    }
    
    @Path("/{messageId}/comments")
    public CommentResource getCommentResource(){
        return new CommentResource();
    }
}
