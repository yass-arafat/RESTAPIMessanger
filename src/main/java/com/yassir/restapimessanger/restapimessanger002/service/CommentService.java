/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yassir.restapimessanger.restapimessanger002.service;

import com.yassir.restapimessanger.restapimessanger002.database.DatabaseClass;
import com.yassir.restapimessanger.restapimessanger002.entity.Comment;
import com.yassir.restapimessanger.restapimessanger002.entity.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author yassir
 */
public class CommentService {
    private Map<Long, Message> messages = DatabaseClass.getMappedMessages();

    
//    public List<Comment> getAllComments(long messageId){
//        Map<Long, Comment> comments = messages.get(messageId).getComments();
//        return new ArrayList<Comment>(comments.values());
//    }
//    
//    public Comment getComment(long messageId, long commentId){
//        Map<Long, Comment> comments = messages.get(messageId).getComments();
//        return comments.get(commentId);
//    }
//    
//    public Comment addComment(long messageId, Comment comment){
//        Map<Long, Comment> comments = messages.get(messageId).getComments();
//        comment.setId(comments.size() + 1);
//        comments.put(comment.getId(), comment);
//        return comment;
//    }
//    
//    public Comment updateComment(long messageId, Comment comment){
//        Map<Long, Comment> comments = messages.get(messageId).getComments();
//        if(comment.getId() <= 0){
//            return null;
//        }
//        comments.put(comment.getId(), comment);
//        return comment;
//    }
//    
//    public Comment removeComment(long messageId, long commentId){
//        Map<Long, Comment> comments = messages.get(messageId).getComments();
//        return comments.remove(commentId);
//    }
}
