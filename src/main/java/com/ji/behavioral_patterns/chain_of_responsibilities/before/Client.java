package com.ji.behavioral_patterns.chain_of_responsibilities.before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);
    }
}
