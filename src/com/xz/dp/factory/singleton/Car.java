package com.xz.dp.factory.singleton;

/**
 * @Description 单例模式-懒汉模式
 * @date 2019-04-19 10:17
 **/
public class Car {

    /**
     * 懒汉模式
     */
    private Car() {
    }

    public void gotowork(){
        System.out.println("去上班");
    }

    // 构造方法私有化，不允许外部直接创建对象private static修饰
    // 没有直接实例化
    private static Car instance;

    // 提供获取实例方法，public static修饰
    // 有线程不安全问题
    public static Car getIntance() {
        if (instance == null) {
            instance = new Car();
        }
        return instance;
    }

    // 线程安全的方法
    private static ThreadLocal<Car> threadLocal = new ThreadLocal<>();

    public static Car getIntanceThreadSafe() {
        Car car = threadLocal.get();
        if (car == null) {
            car = new Car();
            threadLocal.set(car);
        }
        return car;
    }

}
