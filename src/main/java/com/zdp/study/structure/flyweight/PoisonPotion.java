package com.zdp.study.structure.flyweight;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 毒药
 */
public class PoisonPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("Orgh ! This is poisonous. (Potion = " + System.identityHashCode(this) + ")");
    }
}
