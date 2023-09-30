package com.chainofResponsibilityPattern;

public class Info extends Logger{

    Info(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(String message, int logLevel) {
        if(logLevel == INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(message, logLevel);
        }
    }
}
