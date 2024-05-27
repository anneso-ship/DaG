package com.example.demo.exceptions;

public class ProcedureNotFoundException extends RuntimeException{

    public ProcedureNotFoundException(String message) {
        super(message);
    }
}
