package com.zdp.study.structure.flyweight;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 力量药水
 */
public class StrengthPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You feel strong. (Potion = " + System.identityHashCode(this) + ")");
    }
}
