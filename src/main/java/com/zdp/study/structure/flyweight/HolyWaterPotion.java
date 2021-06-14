package com.zdp.study.structure.flyweight;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 祝福药水
 */
public class HolyWaterPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You feel blessed. (Potion = " + System.identityHashCode(this) + ")");
    }
}
