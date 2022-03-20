package com.company;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class currentTime {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();


        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        System.out.println("Date in Your current Timezone : " + dtf.format(now));


        Date today = new Date();


        DateFormat dtf2 = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");



        dtf2.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String PST = dtf2.format(today);
        System.out.println("Date in USA Timezone : " + PST);




    }
}