package org.project2.userservice.exception;

public class UnAuthorizedException extends RuntimeException{
    public UnAuthorizedException(){

    }
    public UnAuthorizedException(String message){
        super(message);
    }
}
