import java.util.Scanner;

public class TemperatureConverterRevise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入摄氏度:");
        double celsius = scanner.nextDouble();

        //转换公式: 华氏 = （摄氏+32）/5/9
        double fahrenheit = celsius*9/5+32;

        //1.输出原始转换结果 （小数）
        System.out.println("华氏度（小数）:" + fahrenheit);

        //2.强制转换为int，观察精度丢失
        int fahrenheitlnt = (int)fahrenheit;
        System.out.println("华氏度（整数，强制转换）:" + fahrenheitlnt);

        scanner.close();
    }

}
