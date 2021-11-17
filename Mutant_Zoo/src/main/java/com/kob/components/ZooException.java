package com.kob.components;

public class ZooException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ZooException() {
    }

    public ZooException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZooException(String message) {
        super(message);
    }

    public ZooException(Throwable cause) {
        super(cause);
    }

}
