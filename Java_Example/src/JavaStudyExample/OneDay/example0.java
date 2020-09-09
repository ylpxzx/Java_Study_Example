package JavaStudyExample.OneDay;

import java.util.Scanner;

public class example0 {
    // TODO 连续输入6个整数，存入数组；计算其最小值、最大值、总和，最后输出平均值。
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner input_score = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("please input the" + (i + 1) + "score:");
            arr[i] = input_score.nextInt();
        }
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
        int avg = (sum - max - min) / (arr.length - 2);
        System.out.println("finally avg score:" + avg);

    }
    public static int getMax(int[] arr) {
        int max_score = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max_score) {
                max_score = arr[i];
            }
        }
        return max_score;
    }
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
        }
        return sum;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        return min;
    }
}
