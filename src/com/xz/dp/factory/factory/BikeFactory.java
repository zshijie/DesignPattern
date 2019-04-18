package com.xz.dp.factory.factory;

/**
 * @Description 具体工厂类,自行车工厂，实现ICarFactory接口
 * @date 2019-04-18 22:23
 **/
public class BikeFactory implements ICarFactory {
    @Override
    public Car getCar() {
        return new Bike();
    }
}
