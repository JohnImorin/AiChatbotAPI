package com.chatbot.Ai.chatbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chatbot")
public class ChatbotController {

    private final ChatbotService chatbotService;

    @Autowired
    public ChatbotController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    // Send message to AI and save conversation
    @PostMapping("/chat")
    public Chatbot sendMessage(@RequestBody Chatbot request) {
        return chatbotService.sendMessage(request.getUserMessage());
    }

    // Get all chat messages
    @GetMapping("/chat")
    public List<Chatbot> getAllMessages() {
        return chatbotService.getAllMessages();
    }

    // Get one chat message by ID
    @GetMapping("/chat/{id}")
    public Chatbot getMessageById(@PathVariable Long id) {
        return chatbotService.getMessageById(id);
    }

    // Delete one chat message
    @DeleteMapping("/chat/{id}")
    public void deleteMessage(@PathVariable Long id) {
        chatbotService.deleteMessage(id);
    }

    // Delete all chat history
    @DeleteMapping("/chat")
    public void deleteAllMessages() {
        chatbotService.deleteAllMessages();
    }
}