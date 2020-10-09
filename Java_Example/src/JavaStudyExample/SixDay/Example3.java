package JavaStudyExample.SixDay;

import java.util.Scanner;

public class Example3 {
    // todo 输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数
    public static void main(String[] args) {
        System.out.println("请输入一行字符：");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] arr = input.toCharArray();
        int stringsum = 0;
        int nullsum = 0;
        int numsum = 0;
        int othersum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>='a'&&arr[i]<='z'||arr[i]>='A'&&arr[i]<='Z'){
                stringsum++;
            }
            else if (arr[i] == 32)
                nullsum++;
            else if (arr[i]>=48&&arr[i]<=57)
                numsum++;
        }
        othersum=arr.length-(stringsum+nullsum+numsum);
        System.out.println("字母数为： "+stringsum+"数字数为： "+numsum+"空格数为： "+nullsum+"其他数字为： "+othersum);
    }
}
