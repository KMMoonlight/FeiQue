package com.kmmoonlight.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtils {

    private static SimpleDateFormat sdfParse;
    private static SimpleDateFormat sdfFormat;


    public static String formatDateStr(String date) {

        if (sdfParse == null) {
            sdfParse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            sdfFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
        try {
            Date parseDate = sdfParse.parse(date);
            return parseDate != null ?  sdfFormat.format(parseDate) : "";
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }






}
