package com.chatbot.Ai.chatbot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatbotRepository extends JpaRepository<Chatbot, Long> {


    List<Chatbot> findAll();
}