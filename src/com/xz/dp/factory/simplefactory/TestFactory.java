package com.xz.dp.factory.simplefactory;

/**
 * @Description 简单工厂测试类
 * @date 2019-04-18 22:05
 **/
public class TestFactory {

    public static void main(String[] args) {
        SimpleCarFactory simpleCarFactory = new SimpleCarFactory();

        Car car = simpleCarFactory.chooseCar("bike");
        if(car!=null){
            car.gotowork();
        }else{
            System.out.println("选择的交通工具不存在，请步行");
        }
    }
}
