import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.接收姓名
        System.out.print("请输入姓名: ");
        String name = scanner.nextLine();

        //2.接收年龄（正整数）
        System.out.print("请输入年龄: ");
        int age = scanner.nextInt();
        if (age <= 0) {
            System.out.println("年龄无效，请输入正整数");
            return;
        }
            //3.接收身高（0.5 ~ 2.5）
            System.out.print("请输入身高（米）:");
            double height = scanner.nextDouble();
            if (height < 0.5 || height > 2.5) {
                System.out.println("身高无效，请输入0.5 ~ 2.5之间的数字");
                return;
            }
            scanner.nextLine();
            //4.接收爱好
                System.out.print("请输入爱好 :");
                String hobby = scanner.nextLine();

        // 5. 输出信息
        System.out.println("\n===== 用户信息 =====");
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("身高：" + height + "米");
        System.out.println("爱好：" + hobby);

        scanner.close();
            }
        }

