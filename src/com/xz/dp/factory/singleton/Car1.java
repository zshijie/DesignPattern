package com.xz.dp.factory.singleton;

/**
 * @Description 单例模式-饿汉模式-汽车
 * @date 2019-04-19 10:17
 **/
public class Car1 {

    /**
     * 饿汉模式
     */
    private Car1() {

    }

    public void gotowork(){
        System.out.println("去上班");
    }

    // 构造方法私有化，不允许外部直接创建对象private static修饰
    private static Car1 instance = new Car1();

    // 提供获取实例方法，public static修饰
    public static Car1 getIntance() {
        return instance;
    }

}
