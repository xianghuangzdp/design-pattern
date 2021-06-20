package com.zdp.study.behavioral.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author zdp
 * @date 2021/6/20
 * @desc 天气
 */
public class Weather {

    private final List<WeatherObserver> observers;

    private WeatherType currentWeather;

    public Weather() {
        this.observers = Lists.newArrayList();
        this.currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver weatherObserver){
        observers.add(weatherObserver);
    }

    public void removeObserver(WeatherObserver weatherObserver){
        observers.remove(weatherObserver);
    }

    /**
     * 时间流逝，天气发生变化
     */
    public void timePasses(){
        currentWeather = WeatherType.randomWeather();
        notifyObservers();
    }

    public void notifyObservers(){
        observers.forEach(o -> o.update(currentWeather));
    }
}
