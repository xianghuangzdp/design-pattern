package com.zdp.study.behavioral.observer.generic;

import com.zdp.study.behavioral.observer.WeatherType;

/**
 * @author zdp
 * @date 2021/6/21
 * @desc 通用天气
 */
public class GWeather extends Observable<GWeather,Race, WeatherType> {

    private WeatherType current;

    public GWeather() {
        current = WeatherType.SUNNY;
    }

    public void timePasses(){
        current = WeatherType.randomWeather();
        notifyObservers(current);
    }
}
