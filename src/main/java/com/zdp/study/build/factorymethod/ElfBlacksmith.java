package com.zdp.study.build.factorymethod;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Map;

/**
 * @author zdp
 * @date 2021/2/23 00:40
 * @desc 精灵铁匠
 */
public class ElfBlacksmith implements Blacksmith {

    private static final Map<WeaponType,ElfWeapon> ELF_ARSENAL = Maps.newHashMap();
    static {
        Arrays.stream(WeaponType.values()).forEach(t -> ELF_ARSENAL.put(t,new ElfWeapon(t)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ELF_ARSENAL.get(weaponType);
    }
}
