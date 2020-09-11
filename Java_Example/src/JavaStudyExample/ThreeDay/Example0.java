package JavaStudyExample.ThreeDay;

import java.util.Scanner;

public class Example0 {
    // TODO 统计段落中出现某一个词的次数
    public static void wordCount() {
        Scanner scanner = new Scanner(System.in);
        int count = 0, index = 0;
        System.out.println("Please input str:");
        String s = scanner.nextLine();
        System.out.println("输入要查询的词：");
        String card = scanner.next();
        while ((index = s.indexOf(card, index)) != -1) {
            index = index + card.length();
            count ++;
        }
        System.out.println(card + "在句子中出现了" + count + "次");
    }

    public static void main(String[] args) {
        Example0.wordCount();
    }
}
