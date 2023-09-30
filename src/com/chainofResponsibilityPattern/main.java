package com.chainofResponsibilityPattern;

public class main {
    public static void main(String[] args) {
         Logger logger = new errorLogger(new debug(new Info(null)));
         logger.log("Updated successfully", 1);
         logger.log("Package Completed in 2.49s", 2);
         logger.log("Message Failed Error 404", 3);
    }
}
