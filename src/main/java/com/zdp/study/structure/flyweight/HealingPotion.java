package com.zdp.study.structure.flyweight;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc
 */
public class HealingPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You feel healed. (potion = " + System.identityHashCode(this) + ")");
    }
}
