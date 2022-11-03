package com.author.books.exception;

public class HndException extends Throwable {
    String msg;

    public HndException(String msg){
        this.msg = msg;

    }
    public String getMessage(){
        return this.msg;
    }
}
