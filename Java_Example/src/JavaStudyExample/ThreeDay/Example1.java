package JavaStudyExample.ThreeDay;

import java.util.Scanner;

public class Example1 {
    // TODO 输入字符串，判断有多少个字母、多少个数字、多少个特殊符号
    public static void letterAndnum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入随机字符串：");
        String s = scanner.nextLine();
        int len = s.length();
        int num = 0, let = 0, te = 0;
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {  // 判读是否是数字
                num ++;
            }
            else if (Character.isLetter(s.charAt(i))) {   // 判读是否是字母
                let ++;
            }else {  // 判读是否是符号
                te ++;
            }
        }
        System.out.println("数字：" + num + " 字母：" + let + " 特殊符号：" + te);
    }

    public static void main(String[] args) {
        Example1.letterAndnum();
    }
}
