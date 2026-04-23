package com.example.whatsapp_chatbot;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private BotService botService;


    @PostMapping
    public String handleMessage(@RequestBody Map<String, String> request) {

        String message = request.get("message");
        System.out.println("Recieved messages:"+message);

        return botService.getReply(message);
    }
}