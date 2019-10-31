package com.imooc.ioc.demo1;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringDemo1 {

    @Test
//  传统开发
    public void demo1(){
        UserService userService = new UserServiceImpl();
        userService.sayHello();
    }

    @Test
//  Spring的方式实现
    public void demo2(){
        // 创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("applicationContext.xml");
        // 通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }

    @Test
    /*
    * 读取磁盘系统中配置文件
    * */
    public void demo3(){
        // 创建工厂
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\spring_ioc\\src\\main\\resources\\applicationContext.xml");
        // 通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }

    @Test
    /*
    * 传统方式的工厂类：BeanFactory
    * */
    public void demo4(){
        // 创建工厂
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        // 通过工厂获得类
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.sayHello();
    }
}
