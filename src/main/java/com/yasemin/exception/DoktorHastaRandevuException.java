package com.yasemin.exception;

import lombok.Getter;

@Getter
public class DoktorHastaRandevuException extends RuntimeException{

    private final ErrorType errorType;
    public DoktorHastaRandevuException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public DoktorHastaRandevuException(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }

}
