package com.zdp.study.behavioral.strategy;

/**
 * @author zdp
 * @date 2021/4/11
 * @desc 远程射击策略
 */
public class ProjectileStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("You shoot the dragon with magical crossbow and it falls dead on the ground!");
    }
}
