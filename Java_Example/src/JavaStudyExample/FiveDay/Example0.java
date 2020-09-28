package JavaStudyExample.FiveDay;

import java.util.Scanner;

public class Example0 {
//    古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子
    public static void main(String[] args) {
        System.out.println("请输入月份");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n + "月，兔子数为：" + sum(n));
    }
    static int sum(int n){
        if (n == 1|n == 2)
            return 1;
        else
            return sum(n - 1) + sum( n - 2);
    }
}
