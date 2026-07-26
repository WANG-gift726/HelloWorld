public class Homework {
    public static void main(String[] args){
    int num1 = 0b1010;
    int num2 = 012;
    int num3 = 0x1f;

    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);

    float f = 0.1f;
    double d = 0.1;
    System.out.println(f == d);

    double d1 = 0.1 + 0.2;
    double d2 = 0.3;
    System.out.println(d1 == d2);

    float f1 = 123456789f;
    float f2 = 123456788f;
    System.out.println(f1 == f2);

    char c1 = 'A';
    char c2 = '中';
    char c3 = '\u0061';

    System.out.println(c1);
    System.out.println((int)c1);
    System.out.println(c2);
    System.out.println((int)c2);
    System.out.println(c3);

    System.out.print("姓名\t年龄\t成绩");
    System.out.println("张三\t18\t95");
    System.out.println("Hello\nWorld");

    boolean flag = true;

    //写法1
    if  (flag == true){
        System.out.println("通过1");
    }
    //写法2
    if (flag){
        System.out.println("通过2");
    }

    }
}

