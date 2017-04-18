/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yassir.restapimessanger.restapimessanger002.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author yassir
 */
@Path("/")
public class CommentResource {
    
    @GET
    public String getAllComments(){
        return "Test";
    }
    
    @GET
    @Path("/{commentsId}")
    public String getComment(@PathParam("messageId") long messageId, @PathParam("commentsId") long commentsId){
        return "Message Id : " + messageId + "\nComments Id : " + commentsId;
    }
}