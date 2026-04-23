package com.example.whatsapp_chatbot;

import org.springframework.stereotype.Service;

@Service
public class BotService {

    public String getReply(String message) {

        System.out.println("Received message: " + message);

        if (message == null) {
            return "No message received";
        }

        switch (message.toLowerCase()) {
            case "hi":
                return "Hello ";
            case "bye":
                return "Goodbye ";
            default:
                return "Invalid input. supported messsages: Hi,Bye";
        }
    }
}