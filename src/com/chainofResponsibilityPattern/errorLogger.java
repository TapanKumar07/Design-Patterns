package com.chainofResponsibilityPattern;

public class errorLogger extends Logger{
    errorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(String message, int logLevel) {
        if(logLevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(message, logLevel);
        }
    }
}
