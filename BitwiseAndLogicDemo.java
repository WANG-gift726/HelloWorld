public class BitwiseAndLogicDemo {
    public static void main(String[] args){
        //1.巩固逻辑运算符
        boolean p = true;
        boolean q = false;
        System.out.println("===逻辑运算符===");
        System.out.println("p && q = " + (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p = " + (!p));

        //2.位运算入门 (重点看左移和右移)
        int num = 8;
        System.out.println("\n===位运算符===");
        System.out.println("num = " + num);
        System.out.println("num << 1 = " + (num << 1));
        System.out.println("num >> 1 = " + (num >> 1));

        //3.位运算符 & 和 |
        int a = 5;//二进制0101
        int b = 3;//二进制0011
        System.out.println("\n===按位与 & 和按位或 |");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));

    }
}
