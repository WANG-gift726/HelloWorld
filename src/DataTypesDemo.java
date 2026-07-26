public class DataTypesDemo {
    public static void main (String[] args){
        //1.整数类型（默认 int）
        int age = 22;
        System.out.println("年龄:" + age);

        //2.小数类型（默认 double）
        double price = 99.9;
        System.out.println("价格:" + price);

        //3. long 和 float (注意后缀 l 和 F);
        long distance = 10000L;
        float weight = 65.1F;
        System.out.println("距离:" + distance);
        System.out.println("体重:" + weight);

        //4.字符 （单引号）
        char grade = 'A';
        System.out.println("等级:" + grade);

        //5.布尔类型 (只有 true/false, 没有 bool)
        boolean isPass = true;
        System.out.println("是否通过:" + isPass);

        //6.字符串 （双引号， String 的 S 大写）
        String name = "WANG";
        System.out.println("姓名:" + name);
    }
}
