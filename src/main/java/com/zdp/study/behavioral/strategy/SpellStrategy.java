package com.zdp.study.behavioral.strategy;

/**
 * @author zdp
 * @date 2021/4/11
 * @desc 魔法策略
 */
public class SpellStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }
}
