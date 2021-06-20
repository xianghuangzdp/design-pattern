package com.zdp.study.behavioral.observer.generic;

import com.zdp.study.behavioral.observer.WeatherType;

/**
 * @author zdp
 * @date 2021/6/21
 * @desc 霍比特人
 */
public class GHobbits implements Race {

    @Override
    public void update(GWeather subject, WeatherType argument) {
        System.out.println("The hobbits are facing " + argument.getDescription() + " weather now!");
    }
}
