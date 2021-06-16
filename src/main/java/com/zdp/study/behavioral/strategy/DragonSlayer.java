package com.zdp.study.behavioral.strategy;

/**
 * @author zdp
 * @date 2021/4/11
 * @desc 巨龙猎杀者
 */
public class DragonSlayer {

    private DragonSlayingStrategy strategy;

    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void gotoBattle(){
        strategy.execute();
    }

    public void changeStrategy(DragonSlayingStrategy newStrategy){
        strategy = newStrategy;
    }
}
