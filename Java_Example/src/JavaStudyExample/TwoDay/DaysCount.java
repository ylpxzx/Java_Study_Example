package JavaStudyExample.TwoDay;

import java.util.*;

public class DaysCount {
    // TODO 输入某年某月某日，判断这一天是这一年的第几天
    public static void main(String[] args) {
        List<Integer> list_month_31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> list_month_30 = Arrays.asList(4, 6, 9, 11);
//        Map<String, Object> dict = new HashMap<String, Object>();
//        dict.put("31", list_month_31);
//        dict.put("30", list_month_30);

        System.out.println("输入年：");
        Scanner sc_year = new Scanner(System.in);
        int year = sc_year.nextInt();

        System.out.println("输入月：");
        Scanner sc_month = new Scanner(System.in);
        int month = sc_month.nextInt();

        System.out.println("输入日：");
        Scanner sc_day = new Scanner(System.in);
        int day = sc_day.nextInt();

        int count = 0;
        boolean index;
        int days = 0;
        if ((year < 0) || (month < 0) || (month > 12) || (day < 0) || (day > 31)){
            index = false;
            System.out.println("输入有误，重新输入。");
        }else {
            index = true;
        }

        if (index) {
            for (int i = 1; i < month; i++) {
                boolean result_31 = list_month_30.contains(i);
                boolean result_30 = list_month_31.contains(i);
                if (result_31){
                    days = 31;
                }else if (result_30) {
                    days = 30;
                }else {
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        days = 29;
                    }else {
                        days = 28;
                    }
                }
                count += days;
            }
        }
        System.out.println("这一年的第" + count + day + "天");
    }
}
