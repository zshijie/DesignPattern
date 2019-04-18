package com.xz.dp.factory.factory;

/**
 * @Description 工厂测试类
 * @date 2019-04-18 22:05
 **/
public class TestFactory {

    public static void main(String[] args) {
        ICarFactory carFactory;
        carFactory = new BikeFactory();
        Car car1 = carFactory.getCar();
        if (car1 != null) {
            car1.gotowork();
        } else {
            System.out.println("选择的交通工具不存在，请步行");
        }

        carFactory = new BusFactory();
        Car car2 = carFactory.getCar();
        if (car2 != null) {
            car2.gotowork();
        } else {
            System.out.println("选择的交通工具不存在，请步行");
        }
    }
}
