package cn.itcast.day07.demo03;
/*
* 这个子接口当中有几个方法？ 4个
* methodA 来源于接口A
* methodB 来源于接口B
* methodCommon 来源于接口A和接口B
* method 来源于我自己
* */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {

    public abstract void method();

    @Override
    public default void methodDefault() {

    }
}
