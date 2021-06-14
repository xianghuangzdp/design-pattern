package com.zdp.study.structure.flyweight;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 透明药水
 */
public class InvisibilityPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You become invisible. (Potion = " + System.identityHashCode(this) + ")");
    }
}
