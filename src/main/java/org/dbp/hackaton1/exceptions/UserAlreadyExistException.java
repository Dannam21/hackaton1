package org.dbp.hackaton1.exceptions;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String message) {
        super(message);}
}