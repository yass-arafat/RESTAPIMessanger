/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yassir.restapimessanger.restapimessanger002.database;

import com.yassir.restapimessanger.restapimessanger002.entity.Message;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yassir
 */
public class DatabaseClass {
    private static Map<Long, Message> messages = new HashMap<>();

    public DatabaseClass() {
    }
    
    
    public static Map<Long, Message> getMappedMessages(){
        return messages;
    }
}
