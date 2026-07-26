import java.util.Scanner;

public class TemperatureConverter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入华氏度:");
        double fahrenheit = scanner.nextDouble();

        //转换公式: 摄氏 = （华氏-32）*5/9
        double celsius = (fahrenheit-32)*5/9;

        //1.输出原始转换结果 （小数）
        System.out.println("摄氏度（小数）:" + celsius);

        //2.强制转换为int，观察精度丢失
        int celsiuslnt = (int)celsius;
        System.out.println("摄氏度（整数，强制转换）:" + celsiuslnt);

        scanner.close();
    }

}
