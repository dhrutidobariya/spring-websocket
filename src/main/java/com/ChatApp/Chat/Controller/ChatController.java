package com.ChatApp.Chat.Controller;

import com.ChatApp.Chat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage") // /app/sendMessage //maps the websocket msg to destination
    @SendTo("/topic/messages") //return message of this method send to
    public ChatMessage sendMessage(ChatMessage message)
    {
        return message;
    }

    @GetMapping("/chat")  //route url
    public String chat(){
        return "chat";  //thymeleaf template
    }
}
