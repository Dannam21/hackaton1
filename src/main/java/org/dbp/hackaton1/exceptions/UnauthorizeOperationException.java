package org.dbp.hackaton1.exceptions;

public class UnauthorizeOperationException extends RuntimeException{
    public UnauthorizeOperationException(String message) {
        super(message);
    }
}
