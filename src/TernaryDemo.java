public class TernaryDemo {
    public static void main(String[] args){
        //1.找最大值
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println("最大值:" + max);

        //2.判断奇偶
        int num = 7;
        String result = (num % 2 == 0) ? "偶数" : "奇数";
        System.out.println(num + "是:" + result);

        //3.判断一个数是否为正数
        int x = -5;
        String sign = (x > 0) ? "正数" : (x == 0) ? "零" : "负数";
        System.out.println(x + "是:" + sign);

    }
}
