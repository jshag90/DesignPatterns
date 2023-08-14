package com.ji.behavioral_patterns.observer.java;

import org.springframework.context.ApplicationEvent;

public class MyEvent {

    private String message;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public MyEvent(String message) {

        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
