package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Logger {
    private static Logger logger;
    protected int num = 1;

    public void log(String msg) {
        Date data = new Date();
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy.MM.dd  hh:mm:ss ");
        System.out.println("["+ myFormat.format(data) + " " + num++ + "] " + msg);
    }

    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

}