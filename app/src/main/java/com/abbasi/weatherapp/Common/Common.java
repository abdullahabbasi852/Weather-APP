package com.abbasi.weatherapp.Common;

import org.jetbrains.annotations.NotNull;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static String API_KEY = "2f5f6412c3022096d03d549c4dc30ea9";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    @NotNull
    public static String apiRequest(String lat, String lon){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lon,API_KEY));
        return sb.toString();
    }

    @NotNull
    public static String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat dateFormat = new SimpleDateFormat("h:mm a");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    @NotNull
    public static String getImage(String icon){
        return String.format("http://openweathermap.org/img/w/%s.png",icon);
    }

    @NotNull
    public static String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy  h:mm a");
        Date date = new Date();
        return dateFormat.format(date);
    }

    @NotNull
    public static String getCurrentDate(){
        DateFormat dateFormat = new SimpleDateFormat("EEE, MMMM dd");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
