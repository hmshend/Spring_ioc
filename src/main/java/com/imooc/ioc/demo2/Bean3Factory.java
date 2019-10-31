package com.imooc.ioc.demo2;

public class Bean3Factory {
    public Bean3 createBean3(){
        System.out.println("Bean3的工厂已经被执行");
        return new Bean3();
    }
}
