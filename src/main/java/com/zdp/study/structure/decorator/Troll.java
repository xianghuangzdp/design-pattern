package com.zdp.study.structure.decorator;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 巨魔
 */
public interface Troll {

    /**
     * 攻击
     */
    void attack();

    /**
     * 获取攻击伤害
     */
    Integer getAttackPower();

    /**
     * 驱散
     */
    void fleeBattle();
}
