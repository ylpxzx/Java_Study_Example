package JavaStudyExample.OneDay.FaceToClassNineExample;

public class Example2 {
    // TODO 静态与非静态变量及方法的使用
    public int x;
    public static int y;
    void method(){
        x = 1;
        y = 1;
        System.out.println("实例方法访问：x=" + x + " y=" + y);
    }
    static void smethod() {
        // x = 3; 错误，静态方法不能操作非静态成员
        y= 3;  //正确，静态方法可以访问静态成员
        System.out.println("静态方法访问：y="+y);
    }

    public static void main(String[] args) {
        Example2 pro3 = new Example2();
        pro3.method();  // 非静态方法通过实例来调用
        Example2.smethod();  // 静态方法通过类名来调用
    }
}
