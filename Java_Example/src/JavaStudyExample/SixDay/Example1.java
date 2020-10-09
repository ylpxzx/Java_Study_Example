package JavaStudyExample.SixDay;

import java.util.Scanner;

public class Example1 {
    // TODO 将一个正整数分解质因数.比如90=2*3*5
    public static void main(String[] args) {
        System.out.println("请输入正整数：");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print(x + "=");
        for (int i = 2; i <= x; i++){
            if (x % i == 0 && x != i) {
                System.out.print(i);
                if (x % i == 0)
                    System.out.print("*");
                x = x / i;
            }
            if (x == i){
                System.out.print(x);
                break;
            }
        }
    }
}
