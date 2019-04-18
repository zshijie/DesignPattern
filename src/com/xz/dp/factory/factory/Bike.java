package com.xz.dp.factory.factory;

/**
 * @Description 具体车辆-自行车
 * @date 2019-04-18 22:02
 **/
public class Bike implements Car {
    @Override
    public void gotowork() {
        System.out.println("骑自行车去上班");
    }
}
