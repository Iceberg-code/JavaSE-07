package cn.itcast.day07.demo05;

public class Zi extends Fu {
    //注：成员变量不能覆盖重写，只有方法才可以覆盖重写
    int num = 20;

//    int num1 = 200;   //子类特有成员变量访问时，间接通过成员方法访问成员变量

    @Override   //进行了子类的覆盖重写
    public void showNum() {
//        super.showNum();
        System.out.println(num);
//        System.out.println(num1);
    }

    @Override
    public void method(){
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
