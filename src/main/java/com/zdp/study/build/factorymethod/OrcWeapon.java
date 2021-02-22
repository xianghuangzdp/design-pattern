package com.zdp.study.build.factorymethod;

/**
 * @author zdp
 * @date 2021/2/23 00:42
 * @desc
 */
public class OrcWeapon extends Weapon {
    public OrcWeapon(WeaponType weaponType) {
        super(weaponType);
    }

    @Override
    public String toString() {
        return "orcWeapon " + weaponType.getTitle();
    }
}
