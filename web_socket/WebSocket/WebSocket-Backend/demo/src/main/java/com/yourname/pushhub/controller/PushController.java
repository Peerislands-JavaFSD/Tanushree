package com.yourname.pushhub.controller;

import com.yourname.pushhub.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class PushController {
    
    @MessageMapping("/send")
    @SendTo("/topic/push")
    public Message sendPush(Message msg) {
        if (msg.getUser() == null) {
            msg.setUser("Student");
        }
        return msg;
    }
}
