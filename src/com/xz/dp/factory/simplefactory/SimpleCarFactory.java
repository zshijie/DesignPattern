package com.xz.dp.factory.simplefactory;

/**
 * @Description 简单工厂类
 * @date 2019-04-18 22:05
 **/
public class SimpleCarFactory {

    public Car chooseCar(String carName) {
        switch (carName) {
            case "bike":
                return new Bike();
            case "bus":
                return new Bus();
            default:
                return null;
        }
    }
}
