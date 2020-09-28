package JavaStudyExample.FiveDay;

public class Example1 {
    public static void main(String[] args) {
        Example1 test = new Example1();
        int sum = 0;
        for (int i = 101; i <= 200; i++){
//            if (rights(i)) //静态方法内调用静态方法
            if (test.rightsum(i)) {  // 静态方法内调用非静态方法，需要先new本类，再调用方法
                System.out.print(i + " ");
                sum++;
                if (sum % 10 == 0)
                    System.out.println();
            }
        }
    }
    public boolean rightsum(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++){
            if (i % j == 0)
                return false;
        }
        return true;
    }
    static boolean rights(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++){
            if (i % j == 0)
                return false;
        }
        return true;
    }
}
