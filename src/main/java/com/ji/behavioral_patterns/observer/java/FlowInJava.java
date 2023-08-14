package com.ji.behavioral_patterns.observer.java;

import java.util.concurrent.Flow;

public class FlowInJava {

    public static void main(String[] args) {
        Flow.Publisher<String> publisher = new Flow.Publisher<String>() {

            @Override
            public void subscribe(Flow.Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello flow");
                subscriber.onComplete();
            }
        };

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {

            @Override
            public void onSubscribe(Flow.Subscription subscription) {

            }

            @Override
            public void onNext(String item) {
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("completed");
            }
        };

        publisher.subscribe(subscriber);
    }
}
