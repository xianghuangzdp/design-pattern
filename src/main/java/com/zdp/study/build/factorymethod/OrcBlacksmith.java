package com.zdp.study.build.factorymethod;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Map;

/**
 * @author zdp
 * @date 2021/2/23 00:41
 * @desc 兽人铁匠
 */
public class OrcBlacksmith implements Blacksmith {
    private static final Map<WeaponType,OrcWeapon> ORC_ARSENAL = Maps.newHashMap();
    static {
        Arrays.stream(WeaponType.values()).forEach(t -> ORC_ARSENAL.put(t,new OrcWeapon(t)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ORC_ARSENAL.get(weaponType);
    }
}
