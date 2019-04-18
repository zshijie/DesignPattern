package com.xz.dp.factory.simplefactory;

/**
 * @Description 具体车辆-公交车
 * @date 2019-04-18 22:04
 **/
public class Bus implements Car {
    @Override
    public void gotowork() {
        System.out.println("搭公交车去上班");
    }
}
