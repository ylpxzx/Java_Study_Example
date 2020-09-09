package JavaStudyExample.OneDay.FaceToClassNineExample;

interface myInterface  //定义一个接口
{
    void method1();

}
abstract class abstractClass//定义一个抽象类
{

    public abstract void method2(); //加abstract
}
class shixianlei extends abstractClass implements myInterface //继承抽象类，实现接口。
{
    public String st;       //定义自己的字段
    public void method1()   //实现接口，注意访问修饰符加public
    {
        System.out.println("接口方法已加public实现");
    }

    public void method2()//实现抽象方法
    {
        System.out.println("抽象类方法已实现");
    }

}
public class Example7 {
    // TODO 抽象类与接口混合编程例子
    public static void main(String[] args)
    {
        shixianlei sxl = new shixianlei();
        sxl.st = "实现类的字段";
        System.out.println(sxl.st);
        sxl.method1();//实现的接口方法调用
        sxl.method2();//实现的抽象类的方法调用

    }
}