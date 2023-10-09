package org.project2.userservice.exception.handler;

import org.project2.userservice.exception.UnAuthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

public class RestTemplateHandler implements ResponseErrorHandler {
    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().is4xxClientError() || response.getStatusCode().is5xxServerError();
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        if(response.getStatusCode() == HttpStatus.SERVICE_UNAVAILABLE){
            throw new HttpServerErrorException(HttpStatus.SERVICE_UNAVAILABLE, "Service in unavailable, pleas come back later...");
        }
        else if(response.getStatusCode() == HttpStatus.UNAUTHORIZED){
            throw new HttpServerErrorException(HttpStatus.UNAUTHORIZED, "You are un-authorized..");
        }

    }
}
