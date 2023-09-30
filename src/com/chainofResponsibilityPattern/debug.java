package com.chainofResponsibilityPattern;

public class debug extends Logger{
    debug(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(String message, int logLevel) {
        if(logLevel == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(message, logLevel);
        }
    }
}
