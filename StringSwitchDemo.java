package Scanner;

import java.util.Scanner;

public class StringSwitchDemo {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入星期几（如 周一）:");
        String day = scanner.nextLine();

        switch(day){
            case "周一":
                System.out.println("Mon");
                break;
            case "周二":
                System.out.println("Tue");
                break;
            case "周三":
                System.out.println("Wed");
                break;
            case "周四":
                System.out.println("Thu");
                break;
            case "周五":
                System.out.println("Fri");
                break;
            case "周六":
                System.out.println("Sat");
                break;
            case "周天":
                System.out.println("Sun");
                break;
            default:
                System.out.println("输入无效");
                break;
        }

        scanner.close();
    }
}
