package com.water.singleton;

/**
 * Created by zhangmiaojie on 2017/1/20.
 *
 * Singleton是一种创建型模式，指某个类采用Singleton模式，则在这个类被创建后，只可能产生一个实例供外部访问，并且提供一个全局的访问点。
 * 核心知识点如下：
 * (1) 将采用单例设计模式的类的构造方法私有化（采用private修饰）。
 * (2) 在其内部产生该类的实例化对象，并将其封装成private static类型。
 * (3) 定义一个静态方法返回该类的实例。
 *
 */

/**
 * 方法一就是传说的中的饿汉模式
 * 优点是：写起来比较简单，而且不存在多线程同步问题，避免了synchronized所造成的性能问题；
 * 缺点是：当类SingletonTest被加载的时候，会初始化static的instance，静态变量被创建并分配内存空间，
 * 从这以后，这个static的instance对象便一直占着这段内存（即便你还没有用到这个实例），当类被卸载时，
 * 静态变量被摧毁，并释放所占有的内存，因此在某些特定条件下会耗费内存。
 */
public class Singleton01 {
    private static Singleton01 instance = new Singleton01();

    private Singleton01() {}

    public static Singleton01 getInstance() {
        return instance;
    }
}
