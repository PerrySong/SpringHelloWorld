package com.spring.uber.domain;

public class Message {

    private String name;
    private String test;

    public Message(String name, String text) {
        this.name = name;
        this.test = text;
    }

    public String getName() {
        return this.name;
    }

    public String getText() {
        return this.test;
    }
}
