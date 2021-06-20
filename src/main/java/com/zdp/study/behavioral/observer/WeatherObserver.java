package com.zdp.study.behavioral.observer;

/**
 * @author zdp
 * @date 2021/6/20
 * @desc 天气观察者
 */
public interface WeatherObserver {

    /**
     * 天气变更
     * @param weatherType
     */
    void update(WeatherType weatherType);
}
