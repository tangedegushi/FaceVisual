package com.ubtrobot.facevisual.net.error;

/**
 * @auther tangedegushi
 * @creat 2020/8/28
 * @Decribe
 */
public class ServerException extends RuntimeException {

    private int errorCode;
    public String message;

    public ServerException(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }
}