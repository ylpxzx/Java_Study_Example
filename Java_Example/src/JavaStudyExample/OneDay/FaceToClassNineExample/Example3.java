package JavaStudyExample.OneDay.FaceToClassNineExample;


class father{
    public static String sex;  // 父类成员变量
    public void method1 () {
        System.out.println("父类的方法1!");
    }
    public void method2 () {
        System.out.println("父类的方法2!");
    }
}

class boy extends father{  // 继承
    public int age;
    @Override
    public void method2() {
        System.out.println("boy重写父类的方法2!");
    }

    public void boyMethod() {
        System.out.println("boy自己的方法！");
    }
}

public class Example3 {
    // TODO 类继承，包括上下转型示例
    public static void main(String[] args) {
        boy boys = new boy();
        boy.sex = "男孩";
        System.out.println("继承而来的字段sex的值为："+boy.sex);
        boys.method1();  // 父类的方法1
        boys.method2();  // boy重写父类的方法2

        // 向上转型: 将子类转型为父类，会丢失子类自定义的方法和变量，只保留重写的父类方法、未重写的父类方法、父类成员变量。通俗点的解释：儿子变成了老爸，没有了只属于儿子独有的东西
        father boys_up = new boy();
        // boys_up.boyMethod(); 错误！无法使用子类自定义的方法，解决方法(向下转型后调用)：((boy) boys_up).boyMethod();
        boys_up.method2();  // 正确，调用重写的父类方法

        // 向下转型：将父类转型为子类。注意：必须是在已经向上转型的基础上进行
        boy selfboys =  (boy)boys_up;
        selfboys.boyMethod();  // 正确，可以正常调用子类自定义的方法了
    }
}
