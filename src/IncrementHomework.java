public class IncrementHomework {
    public static void main(String[] args){
        //场景1: 后缀自增（a++）
        int a = 10;
        int b = a++;
        System.out.println("===后缀自增(a++)===");
        System.out.println("a ="+ a);//
        System.out.println("b ="+ b);//

        //场景2: 前缀自增 (++a)
        int c = 10;
        int d = ++c;
        System.out.println("\n===前缀自增(++a)===");
        System.out.println("c ="+ c);//
        System.out.println("d ="+ d);//

        //场景3: 混合运算中的自增
        int x = 5;
        int y =x++ + ++x;
        System.out.println("\n===混合运算===");
        System.out.println("x ="+ x);//
        System.out.println("y ="+ y);//

        System.out.println("随机数: "+ Math.random());
        System.out.println("3.14四舍五入: "+ Math.round(3.14));
        double powerResult = Math.pow(5,3);
        System.out.println("5的3次方 ="+ powerResult);

    }
}
