package com.ji.behavioral_patterns.observer.before;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ChatServer {

    private final Map<String, List<String>> messages;

    public ChatServer(Map<String, List<String>> messages) {
        this.messages = messages;
    }

    public void add(String subject, String message) {
        if (messages.containsKey(subject)) {
            messages.get(subject).add(message);
        } else {
            List<String> messageList = new ArrayList<>();
            messageList.add(message);
            messages.put(subject, messageList);
        }
    }


    public List<String> getMessage(String subject) {
        return messages.get(subject);
    }

}
