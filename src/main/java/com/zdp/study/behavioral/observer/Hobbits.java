package com.zdp.study.behavioral.observer;

/**
 * @author zdp
 * @date 2021/6/20
 * @desc 霍比特人
 */
public class Hobbits implements WeatherObserver {

    @Override
    public void update(WeatherType weatherType) {
        System.out.println("The hobbits are facing " + weatherType.getDescription() + " weather now!");
    }
}
