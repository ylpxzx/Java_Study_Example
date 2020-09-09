package JavaStudyExample.OneDay.FaceToClassNineExample;

public class Example6 implements IinterFace{
    // TODO 接口及其实现
    public void method() {  // 接口的方法在此必须被重写，注意访问修饰符为public
        System.out.println("接口实现成功！！！");
    }

    public static void main(String[] args) {
        Example6 prog6 = new Example6();
        //prog7.i=10;      不能修改ｉ的值，为final类型
        prog6.method();
    }
}

interface IinterFace{  //定义一个接口
    int i = 10;  // 定义的变量为fianal类型；
    void method();  // 声明接口方法，但不能有方法体{}
}