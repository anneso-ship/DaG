package com.example.demo.exceptions;

public class AgentNotFoundException extends RuntimeException{
    public AgentNotFoundException(String message) {
        super(message);
    }
}
