// ======================================================================
// 1️⃣ 【类开始】 public class VariableDemo
//    作用：整个程序的外壳，所有代码都装在这个“盒子”里。
//    “类”就是“设计图纸”，它定义了有什么数据和能做什么事。
// ======================================================================
public class VariableDemo {

    // ======================================================================
    // 2️⃣ 【类变量（静态变量）】定义在“类里面、方法外面”的位置
    //    属于类本身，所有对象共享同一份。用 static 修饰。
    // ======================================================================
    static String schoolName = "泉州一中";   // 类变量

    // ======================================================================
    // 3️⃣ 【实例变量（成员变量）】也定义在“类里面、方法外面”
    //    属于对象，每个对象都有自己的副本。没有 static。
    // ======================================================================
    String studentName;          // 实例变量（默认 null）
    int studentAge;              // 实例变量（默认 0）

    // ======================================================================
    // 4️⃣ 【方法1】public static void main(String[] args)
    //    这是程序的“入口方法”，程序从这里开始执行。
    //    方法就是一段可以被调用的代码块，负责完成某个具体任务。
    //    它定义在类里面，但它是“行为”而不是“数据”。
    // ======================================================================
    public static void main(String[] args) {

        // ======================================================================
        // 5️⃣ 【局部变量】定义在“方法内部”的变量。
        //    只在当前方法（main）里有效，方法执行完就消失。
        //    必须手动赋值（初始化）才能用。
        // ======================================================================
        int localScore = 95;      // 局部变量
        String localName = "张三"; // 局部变量

        // 在 main 方法内可以正常访问局部变量
        System.out.println("=== 在 main 方法内 ===");
        System.out.println("局部变量 localScore：" + localScore);
        System.out.println("局部变量 localName：" + localName);

        // 访问类变量（静态变量）直接用 类名.变量名
        System.out.println("类变量 schoolName：" + VariableDemo.schoolName);

        // 访问实例变量必须先创建对象
        VariableDemo stu = new VariableDemo();  // 创建对象
        stu.studentName = "李四";
        stu.studentAge = 20;
        System.out.println("实例变量 studentName：" + stu.studentName);
        System.out.println("实例变量 studentAge：" + stu.studentAge);

        // 注意：这里无法访问下面 testMethod 里的局部变量 localTestVar
        // System.out.println(localTestVar); // 会报错！因为它在另一个方法里
    }
    // ======================================================================
    // 【main方法结束】
    // ======================================================================

    // ======================================================================
    // 6️⃣ 【方法2】public void testMethod()
    //    这是一个普通方法（非静态），它属于对象。
    //    要调用它必须先创建对象，然后 对象名.方法名()。
    // ======================================================================
    public void testMethod() {

        // 这是 testMethod 自己的局部变量，只在它内部有效
        String localTestVar = "我是testMethod里的局部变量";

        System.out.println("=== 在 testMethod 方法内 ===");
        System.out.println("局部变量 localTestVar：" + localTestVar);

        // 类变量可以直接访问（因为它是静态的，全局共用）
        System.out.println("类变量 schoolName：" + VariableDemo.schoolName);

        // 实例变量也可以直接访问（因为 testMethod 是非静态的，属于当前对象）
        System.out.println("实例变量 studentName：" + studentName);
        System.out.println("实例变量 studentAge：" + studentAge);

        // 注意：这里无法访问 main 方法里的 localScore
        // System.out.println(localScore); // 会报错！
    }
    // ======================================================================
    // 【testMethod方法结束】
    // ======================================================================

    // ======================================================================
    // 7️⃣ 【方法3】public static void staticMethod()
    //    这是一个静态方法（用 static 修饰），它属于类本身。
    //    可以直接用 类名.方法名() 调用，不需要创建对象。
    // ======================================================================
    public static void staticMethod() {

        // 静态方法可以直接访问类变量（因为它们都属于类）
        System.out.println("=== 在静态方法内 ===");
        System.out.println("类变量 schoolName：" + schoolName);  // ✅ 可以

        // 静态方法不能直接访问实例变量（因为还没有对象）
        // System.out.println(studentName); // ❌ 会报错！

        // 要访问实例变量，必须通过对象
        VariableDemo obj = new VariableDemo();
        obj.studentName = "王五";
        System.out.println("实例变量（通过对象）：" + obj.studentName);

        // 静态方法不能直接访问其他方法的局部变量
        // System.out.println(localScore); // ❌ 会报错！
    }
}// ======================================================================
// 【staticMethod方法结束】
