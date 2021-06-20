package com.zdp.study.behavioral.observer.generic;

import com.zdp.study.behavioral.observer.WeatherType;

/**
 * @author zdp
 * @date 2021/6/21
 * @desc 兽人
 */
public class GOrcs implements Race {

    @Override
    public void update(GWeather subject, WeatherType argument) {
        System.out.println("The orcs are facing " + argument.getDescription() + " weather now!");
    }
}
