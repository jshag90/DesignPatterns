package com.ji.behavioral_patterns.chain_of_responsibilities.after;

import com.ji.behavioral_patterns.chain_of_responsibilities.before.Request;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void handle(Request request){
        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
