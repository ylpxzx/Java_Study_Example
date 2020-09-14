package JavaStudyExample.FourDay;

import java.util.Scanner;

public class Example1 {
    public static void letterUpperLower() {
        // TODO 设定一个有大小写字母的字符串，先将字符串的大写字符输出，再将字符串中的小写字符输
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input String: ");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        System.out.println("Upper: ");
        for (char a:chars) {
            if (Character.isUpperCase(a)) {
                System.out.println(a);
            }
        }
        System.out.println("Lower: ");
        for (char a:chars) {
            if (Character.isLowerCase(a)) {
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {
        Example1.letterUpperLower();
    }
}
