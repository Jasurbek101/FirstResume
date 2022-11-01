package org.example.uz.pdp.dto;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDto {
    public static void printMonths(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2001,0,1);
        for (int i = 0; i < 12; i++) {
            calendar.add(Calendar.MONTH,1);
            System.out.print(simpleDateFormat.format(calendar.get(Calendar.MONTH)) + "\t");
        }
    }

    public static void main(String[] args) {
        printMonths();
    }
}
