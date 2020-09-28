package JavaStudyExample.FiveDay;

public class Example2 {
    // 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 999; i++){
            int bite = i%10;  // 取百位
            int ten = i/10%10;  // 取十位
            int hunster = i/100;  // 取个位
            if (i == (Math.pow(bite, 3) + Math.pow(ten, 3) + Math.pow(hunster, 3))){
                System.out.println("水仙花：" + i + " ");
                sum ++;
            }
        }
        System.out.println("水仙花数为：" + sum);
    }
}
