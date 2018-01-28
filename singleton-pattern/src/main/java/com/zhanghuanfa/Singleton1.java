package com.zhanghuanfa;

import java.io.Serializable;

/**
 * 懒汉式，线程不安全
 * 1、是否lazy初始化：是
 * 2、是否多线程安全：否
 * 描述：
 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 * 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * @author zhanghuanfa
 * @date 2018-01-28 16:01
 */
public class Singleton1 implements Serializable {
    private static final long serialVersionUID = 2008395728526698527L;

    private static Singleton1 instance;

    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Inside Singleton1::showMessage method");
    }
}
