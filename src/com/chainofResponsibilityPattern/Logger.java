package com.chainofResponsibilityPattern;

public class Logger {

    static int INFO = 1;
    static int DEBUG = 2;
    static int ERROR = 3;


    Logger nextLogger;

    Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(String message, int logLevel) {
         if(nextLogger != null)
              nextLogger.log(message, logLevel);
    }

}
