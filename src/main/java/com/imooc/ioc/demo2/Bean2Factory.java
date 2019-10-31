package com.imooc.ioc.demo2;

public class Bean2Factory {
    public static Bean2 createBean2(){
        System.out.println("bean2 的静态工厂已经执行。。。");
        return new Bean2();
    }
}
