package com.xz.dp.factory.factory;

/**
 * @Description 具体工厂类,公交车工厂，实现ICarFactory接口
 * @date 2019-04-18 22:25
 **/
public class BusFactory implements ICarFactory {
    @Override
    public Car getCar() {
        return new Bus();
    }
}
