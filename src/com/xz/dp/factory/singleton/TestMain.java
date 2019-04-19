package com.xz.dp.factory.singleton;

/**
 * @Description 单例模式测试类
 * @date 2019-04-19 10:19
 **/
public class TestMain {

    public static void main(String[] args) {

        Car car = Car.getIntance();
        car.gotowork();
    }
}
