package JavaStudyExample.FourDay;

import java.util.GregorianCalendar;

public class Example2 {
    // todo 计算并输出21世纪的闰年，以及程序的执行时间
    public static void leapYeay21() {
        long start = System.currentTimeMillis();
        GregorianCalendar calendar = new GregorianCalendar();
        for (int i = 2000; i < 2100; i++) {
            if (calendar.isLeapYear(i)){
                System.out.println(i + "是闰年");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("程序的执行时间为： " + (end - start) + "毫秒");
    }

    public static void main(String[] args) {
        Example2.leapYeay21();
    }
}
