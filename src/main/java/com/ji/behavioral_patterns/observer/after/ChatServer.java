package com.ji.behavioral_patterns.observer.after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber subscriber){
        if(subscribers.containsKey(subject)){
            subscribers.get(subject).add(subscriber);
        } else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            this.subscribers.put(subject, list);
        }

    }

    public void unregister(String subject, Subscriber subscriber){
        if(subscribers.containsKey(subject)){
            subscribers.get(subject).remove(subscriber);
        }
    }

    public void sendMessage(User user, String subject, String message){
        String userMessage = user.getName() + ":" +message;
        if(subscribers.containsKey(subject)){
            this.subscribers.get(subject).forEach(s -> s.handleMessage(userMessage));
        }
    }

}
