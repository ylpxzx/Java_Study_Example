package JavaStudyExample.FourDay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Example3 {
    // todo 当以yyyy-MM-dd格式输入一个日期时，输出其该年是否为闰年，该月有几天，该日是星期几
    public static void isLeapYeay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input data: (format: yyyy-MM-dd)");
        String string = scanner.nextLine();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = dateFormat.parse(string);
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            int year = instance.get(Calendar.YEAR);
            int month = instance.get(Calendar.MONTH) + 1;
            int week = instance.get(Calendar.DAY_OF_WEEK) - 1;
            GregorianCalendar calendar = new GregorianCalendar();
            if (calendar.isLeapYear(year)){
                System.out.println(year + "是闰年");
            }else {
                System.out.println(year + "是平年");
            }
            int max = instance.getActualMaximum(Calendar.DAY_OF_MONTH);
            String s = week == 0 ? "周日" : "周" + week;
            System.out.println(month + "月有" + max + "日，该日是" + s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Example3.isLeapYeay();
    }
}
