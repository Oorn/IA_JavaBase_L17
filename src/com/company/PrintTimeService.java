package com.company;

import java.util.Calendar;

public class PrintTimeService {
    private static PrintTimeService instance = null;
    public static PrintTimeService getInstance() {
        if (instance == null)
            instance = new PrintTimeService();
        return instance;
    }

    private PrintTimeService() {}
    public void printTime() {
        System.out.println(Calendar.getInstance().getTime());
    }
}
