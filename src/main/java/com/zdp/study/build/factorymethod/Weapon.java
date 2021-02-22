package com.zdp.study.build.factorymethod;

import lombok.Data;

/**
 * @author zdp
 * @date 2021/2/23 00:35
 * @desc
 */
@Data
public class Weapon {
    protected final WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
