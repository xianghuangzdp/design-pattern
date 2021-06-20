package com.zdp.study.behavioral.observer;

import com.zdp.study.behavioral.observer.generic.GHobbits;
import com.zdp.study.behavioral.observer.generic.GOrcs;
import com.zdp.study.behavioral.observer.generic.GWeather;

/**
 * @author zdp
 * @date 2021/6/20
 * @desc 观察者模式
 * 观察者模式由一个被观察对象，以及他的一些列观察者组成，当被观察者的状态发生变化时，他会自动的通过调用观察者的一个方法来通知观察者
 * 观察者模式主要使用在分布式处理系统中，在mvc设计模式中也大量使用观察者模式。
 */
public class ObserverDemo {

    public static void main(String[] args) {
        Weather weather = new Weather();

        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        GWeather gWeather = new GWeather();
        gWeather.addObserver(new GOrcs());
        gWeather.addObserver(new GHobbits());

        gWeather.timePasses();
        gWeather.timePasses();
        gWeather.timePasses();
        gWeather.timePasses();
    }
}
