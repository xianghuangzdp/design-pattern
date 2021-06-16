package com.zdp.study.behavioral.strategy;

/**
 * @author zdp
 * @date 2021/4/11
 * @desc 近战策略
 */
public class MeleeStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("With your Excalibur you sever the dragon's head!");
    }
}
