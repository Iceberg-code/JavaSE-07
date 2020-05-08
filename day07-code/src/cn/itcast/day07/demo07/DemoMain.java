package cn.itcast.day07.demo07;

public class DemoMain {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标供对象使用
//        Mouse mouse = new Mouse();
        //首先进行向上转型 - 左父右子就是多态
        USB usbMouse = new Mouse(); //多态写法
        //参数是USB类型，传递进去的就是USB鼠标
        computer.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard(); //没有使用多态写法
        //方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard);   //正确写法！！！    也发生了向上转型！！！

        //使用子类对象，匿名对象，也是可以的
//        computer.useDevice(new Keyboard()); //正确写法！！！    也发生了向上转型！！！

        computer.powerOff();

        System.out.println("==================");

        method(10.0);
        method(20); //发生了自动类型转换
        int a = 30; //发生了自动类型转换
        method(a);
    }

    public static void method(double num){
        System.out.println(num);
    }
}
