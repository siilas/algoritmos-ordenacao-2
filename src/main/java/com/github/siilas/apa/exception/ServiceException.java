package com.github.siilas.apa.exception;

public class ServiceException extends RuntimeException {
    
    private static final long serialVersionUID = -1860054066624651344L;

    public ServiceException(String message) {
        super(message);
    }

}
