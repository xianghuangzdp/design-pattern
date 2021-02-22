package com.zdp.study.build.factorymethod;

/**
 * @author zdp
 * @date 2021/2/23 00:35
 * @desc 铁匠
 */
public interface Blacksmith {

    /**
     * 生产武器
     * @param weaponType
     * @return
     */
    Weapon manufactureWeapon(WeaponType weaponType);
}
