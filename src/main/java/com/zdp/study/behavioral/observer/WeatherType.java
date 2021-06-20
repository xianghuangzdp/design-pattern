package com.zdp.study.behavioral.observer;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * @author zdp
 * @date 2021/6/20
 * @desc 天气类型
 */
public enum WeatherType {
    SUNNY("sunny"),
    RAINY("rainy"),
    WINDY("windy"),
    COLD("cold")
    ;

    private final String description;

    WeatherType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static WeatherType randomWeather(){
        List<WeatherType> allWeather = Lists.newArrayList(values());

        Random random = new Random();
        int index = random.nextInt(allWeather.size());

        return allWeather.get(index);
    }
}
