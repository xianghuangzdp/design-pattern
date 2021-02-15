package com.zdp.study.build.prototype;

/**
 * @author zdp
 * @date 2021/2/15 17:31
 * @desc 英雄建造工厂
 */
public interface HeroFactory {

    /**
     * 创建野兽
     * @return
     */
    Beast createBeast();

    /**
     * 创建魔法师
     * @return
     */
    Mage createMage();

    /**
     * 创建战士
     * @return
     */
    Warlord createWarlord();
}
