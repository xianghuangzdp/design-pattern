package com.zdp.study.structure.decorator;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 带棍棒的巨魔
 */
public class ClubbedTroll implements Troll {

    private final Troll troll;

    public ClubbedTroll(Troll troll) {
        this.troll = troll;
    }

    @Override
    public void attack() {
        troll.attack();
        System.out.println("The troll swing at you with a club");
    }

    @Override
    public Integer getAttackPower() {
        return troll.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        troll.fleeBattle();
    }
}
