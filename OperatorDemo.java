public class OperatorDemo {
    public static void main(String[] args){
        //1.算术运算符: 整数除法会截断小数
        int a = 10;
        int b = 3;
        System.out.println("====算术运算符====");
        System.out.println("a+b="+ (a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));

        //2.赋值运算符
        int c = 5;
        System.out.println("\n====赋值运算符====");
        System.out.println("c初始值="+ c );
        c += 3;
        System.out.println("c +=3 → "+ c );
        c -= 2;
        System.out.println("c -=2 → "+ c );
        c *= 2;
        System.out.println("c *=2 → "+ c );

        //3.关系运算符
        int x = 10;
        int y = 20;
        System.out.println("\n====关系运算符====");
        System.out.println("x == y"+ (x == y));
        System.out.println("x != y"+ (x != y));
        System.out.println("x > y"+ (x > y));
        System.out.println("x < y"+ (x < y));
        System.out.println("x >= y"+ (x >= y));
        System.out.println("x <= y"+ (x <= y));

        //4.逻辑运算符
        boolean p = true;
        boolean q = false;
        System.out.println("\n====逻辑运算符====");
        System.out.println("p && q ="+ (p && q));
        System.out.println("p || q ="+ (p || q));
        System.out.println("!p ="+ (!p));

        //5.整数除法 vs 浮点数除法
        System.out.println("\n====整数除法 vs 浮点数除法====");
        System.out.println("10/3 = "+(10/3));
        System.out.println("10/3.0 ="+(10/3.0));
        System.out.println("(double)10/3 ="+((double)10/3));



    }
}
