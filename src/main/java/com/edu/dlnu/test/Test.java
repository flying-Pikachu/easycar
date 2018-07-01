package com.edu.dlnu.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @ Author     ：xzp.
 * @ Date       ：Created in 上午10:45 2018/7/1
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
public class Test {

    public static void main(String[] args) throws ParseException {
//        String dateStr = "Mon Jun 18 00:00:00 IST 2012";
////        String dateStr = "Fri Jul 06 00:00:00 CST 2018";
//        DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.CHINA);
//        Date date = (Date)formatter.parse(dateStr);
//        System.out.println(date);
//
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
//        String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" +         cal.get(Calendar.YEAR);
//        System.out.println("formatedDate : " + formatedDate);
        java.util.Date fecha = new java.util.Date("Fri Jul 06 00:00:00 CST 2018");
        DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.US);
        Date date;
        date = formatter.parse(fecha.toString());
        System.out.println(date);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String formatedDate = cal.get(Calendar.DATE) + "/" +
                (cal.get(Calendar.MONTH) + 1) +
                "/" +         cal.get(Calendar.YEAR);
        System.out.println("formatedDate : " + formatedDate);

    }
}
