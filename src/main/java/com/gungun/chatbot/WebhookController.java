package com.gungun.chatbot;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class WebhookController {

    @PostMapping("/webhook")
    public Map<String, String> receiveMessage(@RequestBody Map<String, String> request) {

        String message = request.get("message");
        String reply;

        if (message.equalsIgnoreCase("hi")) {
            reply = "Hello";
        } else if (message.equalsIgnoreCase("bye")) {
            reply = "Goodbye";
        } else {
            reply = "I don't understand";
        }

        System.out.println("Incoming: " + message);

        Map<String, String> response = new HashMap<>();
        response.put("reply", reply);

        return response;
    }

@GetMapping("/test")
public String test() {
    return "Working";

}}
