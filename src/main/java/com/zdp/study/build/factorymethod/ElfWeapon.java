package com.zdp.study.build.factorymethod;

/**
 * @author zdp
 * @date 2021/2/23 00:42
 * @desc 精灵武器
 */
public class ElfWeapon extends Weapon {
    public ElfWeapon(WeaponType weaponType) {
        super(weaponType);
    }

    @Override
    public String toString() {
        return "elfWeapon "  + weaponType.getTitle();
    }
}
