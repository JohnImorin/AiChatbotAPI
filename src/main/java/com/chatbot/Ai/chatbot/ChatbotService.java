package com.chatbot.Ai.chatbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ChatbotService {

    private final ChatbotRepository chatbotRepository;
    private final AiService aiService;

    @Autowired
    public ChatbotService(ChatbotRepository chatbotRepository, AiService aiService) {
        this.chatbotRepository = chatbotRepository;
        this.aiService = aiService;
    }

    // Send message to AI, save conversation
    public Chatbot sendMessage(String userMessage) {
        String aiResponse = aiService.getAiResponse(userMessage);
        Chatbot chatbot = new Chatbot(userMessage, aiResponse, LocalDateTime.now());
        return chatbotRepository.save(chatbot);
    }

    // Get all chat messages
    public List<Chatbot> getAllMessages() {
        return chatbotRepository.findAll();
    }

    // Get one chat message by ID
    public Chatbot getMessageById(Long id) {
        return chatbotRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chat message not found with id: " + id));
    }

    // Delete one chat message
    public void deleteMessage(Long id) {
        chatbotRepository.deleteById(id);
    }

    // Delete all chat history
    public void deleteAllMessages() {
        chatbotRepository.deleteAll();
    }


}