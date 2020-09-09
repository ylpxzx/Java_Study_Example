package JavaStudyExample.OneDay.FaceToClassNineExample;


interface cool
{
    void aircondition();
}

class cinema implements cool
{
    public void aircondition()
    {
        System.out.println("电影院开空调");
    }
}
class car implements cool
{
    public void aircondition()
    {
        System.out.println("轿车开空调");
    }
}


public class Example8 {
    // TODO 接口回调：
    // 即把实现接口的类的实例的引用赋值给接口变量后，
    // 该接口变量就可以回调类重写的接口方法。
    // 由接口产生的多态就是指不同的类在实现同一接口时可能具有不同的实现形式，
    // 那么接口变量在回调接口方法时就有多种形态。
    public static void main(String[] args) {
        cool a;//先定义一个接口变量
        cinema zhongying=new cinema();
        car tesla=new car();
        a=zhongying;
        a.aircondition();
        a=tesla;
        a.aircondition();

    }

}


// TODO 另一种方法是用一个客户端类实现，将接口变量作为参数,有点类似于上转型对象
//interface cool
//{
//    void aircondition();
//}
//
//class cinema implements cool
//{
//    public void aircondition()
//    {
//        System.out.println("电影院开空调");
//    }
//}
//class car implements cool
//{
//    public void aircondition()
//    {
//        System.out.println("轿车开空调");
//    }
//}
//
//class client
//{
//    void show(cool a)
//    {
//        a.aircondition();
//    }
//}
//
//class Example6_4 {
//
//    public static void main(String[] args) {
//        client m=new client();
//        m.show(new cinema());
//        m.show(new car());
//
//    }
//
//}