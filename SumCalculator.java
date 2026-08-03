package Loop;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("请输入数字（输入0退出）");
        while (true){
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }
            sum = sum + num;
        }
        System.out.println("所有数字之和: " + sum);
        scanner.close();
    }
}
