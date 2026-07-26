import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        //1.游戏开始：生成一个1-100的随机数
        Random random = new Random();
        int target = random.nextInt(100) + 1;

        //2.准备接收你的输入
        Scanner scanner = new Scanner(System.in);

        //3.记录猜的次数
        int attempts = 0;

        System.out.println("=====欢迎来到猜数字游戏！=====");
        System.out.println("我已经想好了一个1到100之间的数字。");
        System.out.println("来试试看猜几次能猜中吧！");
        System.out.println("==================================");

        //4.无限循环，直到你猜对才跳出
        while (true) {
            System.out.print("请输入你猜的数字：");

            //接受你输入的数字
            int guess = scanner.nextInt();
            attempts++;//每猜一次加1

            //5.判断逻辑（核心交互）
            if (guess < target) {
                System.out.println("太小了，往大一点猜！");
            } else if (guess > target) {
                System.out.println("太大了，往小一点猜！");
            } else {
                //猜对了！
                System.out.println("恭喜你猜对了！答案就是" + target);
                System.out.println("你一共猜了" + attempts + "次。");
                break;//跳出循坏，游戏结束
            }
        }

        //6.关闭资源（好习惯）
        scanner.close();
        System.out.println("游戏结束，欢迎下次再玩！");
    }
}
