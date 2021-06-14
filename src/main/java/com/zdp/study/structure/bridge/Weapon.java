package com.zdp.study.structure.bridge;

/**
 * @author zdp
 * @date 2021/4/4
 * @desc 武器
 */
public interface Weapon {

    /**
     * 装备
     */
    void wield();

    /**
     * 使用
     */
    void swing();

    /**
     * 卸下
     */
    void unwield();

    Enchantment getEnchantment();
}
