package Scanner;

import java.util.Scanner;

public class MyProfile {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入你的名字：");
            String name = scanner.nextLine();

            System.out.print("请输入你的年龄：");
            int age = scanner.nextInt();

            // 关键：吃掉换行符
            scanner.nextLine();

            System.out.print("请输入你的城市：");
            String city = scanner.nextLine();

            System.out.println("\n===== 你的档案 =====");
            System.out.println("名字：" + name);
            System.out.println("年龄：" + age);
            System.out.println("城市：" + city);

            scanner.close();
        }
    }


