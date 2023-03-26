package com.ji.behavioral_patterns.chain_of_responsibilities.before;

public class LoggingRequestHandler extends RequestHandler{

    @Override
    public void handler(Request request){
        System.out.println("로깅");
        super.handler(request);
    }

}
