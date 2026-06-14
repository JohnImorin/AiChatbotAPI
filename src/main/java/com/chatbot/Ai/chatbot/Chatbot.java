package com.chatbot.Ai.chatbot;

import jakarta.persistence.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Entity
@Table(name="chat_message")
public class Chatbot {



@Id
@SequenceGenerator(
        name = "chatbot_sequence",
        sequenceName = "chatbot_sequence",
        allocationSize = 1
    )
@GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "chatbot_sequence"
    )
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String userMessage;


    @Column(columnDefinition = "TEXT")
    private String aiResponse;
    private LocalDateTime createAt;


    public Chatbot() {
    }

    public Chatbot(String userMessage, String aiResponse, LocalDateTime createAt) {
        this.userMessage = userMessage;
        this.aiResponse = aiResponse;
        this.createAt = createAt;
    }

    public Chatbot(Long id, String userMessage, String aiResponse, LocalDateTime createAt) {
        this.id = id;
        this.userMessage = userMessage;
        this.aiResponse = aiResponse;
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getAiResponse() {
        return aiResponse;
    }

    public void setAiResponse(String aiResponse) {
        this.aiResponse = aiResponse;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Chatbot{" +
                "id=" + id +
                ", userMessage='" + userMessage + '\'' +
                ", aiResponse='" + aiResponse + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
