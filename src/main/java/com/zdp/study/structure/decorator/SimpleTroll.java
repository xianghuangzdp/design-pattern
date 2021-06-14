package com.zdp.study.structure.decorator;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 简单巨魔
 */
public class SimpleTroll implements Troll {
    @Override
    public void attack() {
        System.out.println("The troll tried to grab you");
    }

    @Override
    public Integer getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll shrieks in the horror and runs away!");
    }
}
