package Scanner;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入你的身高（米）:");
        double height = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("请输入你的体重（公斤）:");
        double weight = scanner.nextDouble();

        double bmi = weight/(height*height);

        if(bmi<18.5){
            System.out.println("体重偏轻");
        }else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("体重正常");
        }else if(bmi>=25.0 && bmi<=29.9){
            System.out.println("超重");
        }else if(bmi>=30.0){
            System.out.println("肥胖");
        }
        scanner.close();
    }
}
