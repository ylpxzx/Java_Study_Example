package JavaStudyExample.OneDay.FaceToClassNineExample;

// 应该注意的是：继承抽象类的类，要求抽象类中的抽象方法被实例化
abstract class personClass //抽象类
{
    public String sex;//变量。
    public abstract void method(); //抽象方法。
}
class man extends personClass //以抽象类为模块的类
{
    public void method()//抽象方法的实例化
    {
        System.out.println("继承抽象类的方法被实现化了");
    }
}
public class Example5 {
    // TODO 抽象类及其实现示例
    public static void main(String[] args)
    {
        man boys = new man();//产生一个对象
        boys.sex = "male";//给对象一个初值
        System.out.println(boys.sex);
        boys.method();//调用man类中的方法
    }
}