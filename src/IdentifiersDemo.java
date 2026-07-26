public class IdentifiersDemo {
    public static void main(String[]args){
        //1.合法的标识符（IDEA不会报错）
        int age = 18;
        String studentName = "WANG";
        double _salary = 5000.0;
        int $count = 10;

        System.out.println(age);
        System.out.println(studentName);

        //2.故意写非法的标识符（把下面这行注释去掉，看IDEA会不会报红）
        //int 123abc = 5; //数字开头报红
        //int class = 10; //class是关键字报红
    }
}
