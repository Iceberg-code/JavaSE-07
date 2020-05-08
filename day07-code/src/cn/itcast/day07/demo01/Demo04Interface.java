package cn.itcast.day07.demo01;

public class Demo04Interface {
    public static void main(String[] args) {
        MyInterfacePrivateB.methodStatic1();        //接口能直接点出来！！！
        MyInterfacePrivateB.methodStatic2();

        //错误写法
//        MyInterfacePrivateB.methodStaticCommon;
    }
}
