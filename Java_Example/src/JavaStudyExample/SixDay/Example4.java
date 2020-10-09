package JavaStudyExample.SixDay;

import java.util.Scanner;

public class Example4 {
    // todo 求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。输出结果的形式如：2+22+222=246
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("亲输入数字a：");
        int a=scanner.nextInt();
        System.out.print("亲输入数字n：");
        int n=scanner.nextInt();
        int sum=0;
        int[] array=new int[n];
        array[0]=a;
        for(int i=1;i<n;i++) {
            array[i]=a+array[i-1]*10;
        }
        for(int j=0;j<n;j++) {
            sum+=array[j];
            System.out.print(array[j]);
            if(j!=n-1)
                System.out.print("+");
        }
        System.out.println("="+sum);
    }
}
