package JavaStudyExample.SixDay;

import java.util.Scanner;

public class Example2 {
    // todo 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示
    public static void main(String[] args) {
        System.out.println("请输入成绩：");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        String adv = in >= 90 ? "A" : (in >= 60 ? "B" : "C");
        System.out.print(in + "是属于" + adv + "等级");
    }
}
