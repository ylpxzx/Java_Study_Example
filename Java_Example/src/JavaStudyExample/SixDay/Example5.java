package JavaStudyExample.SixDay;

        import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("请输入次数和高度：");
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        float hight = scanner.nextFloat();
        float sum = hight;
        float hg = hight;
        for (int i = 0; i < n; i++) {
            sum = hg / 2 + sum;
            hg /= 2;
        }
        System.out.print("在" + hight + "米，经过" + n + "次反弹，一共经过" + sum + "米，第" + n + "次反弹了" + hg);

    }
}
