public class TypeConversionDemo {
    public static void main(String[] args ){
        //自动转换：int → double\
        int num1 = 10;
        double num2 = num1;
        System.out.println("自动转换:" + num2);//输出10.0

        //强制转换:double → int (精度丢失)
        double price = 99.9;
        int pricelnt = (int) price;
        System.out.println("强制转换（精度丢失）:" + pricelnt);//输出99

        //强制转换溢出: int 最大值 + 1
        int max =2147483647;
        int overflow = max + 1;
        System.out.println("溢出:" + overflow);//输出-2147483648

        //强制转换: long → int (可能溢出)
        long big = 10000_0000_00L;
        int small = (int)big;
        System.out.println("long 转 int 溢出:" + small);
    }
}
