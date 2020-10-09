package JavaStudyExample.SixDay;

public class Example0 {
    // TODO 判断101-200之间有多少个素数，并输出所有素数
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 101; i <= 200; i++){
            if (rightsum(i)) {
                System.out.print(i + " ");
                sum++;
                if (sum % 10 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println("一共" + sum + "个素数");
    }

    static boolean rightsum(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++){
            if (i % j == 0)
                return false;
        }
        return true;
    }
}
