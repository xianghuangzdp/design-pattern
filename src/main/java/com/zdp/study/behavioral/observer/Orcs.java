package com.zdp.study.behavioral.observer;

/**
 * @author zdp
 * @date 2021/6/20
 * @desc 兽人
 */
public class Orcs implements WeatherObserver {

    @Override
    public void update(WeatherType weatherType) {
        System.out.println("The orcs are facing " + weatherType.getDescription() + " weather now!");
    }
}
