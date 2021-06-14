package com.zdp.study.structure.bridge;

/**
 * @author zdp
 * @date 2021/4/4
 * @desc 剑
 */
public class Sword implements Weapon {

    public final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("The sword is wielded.");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("The sword is swinged.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("The sword is unwielded.");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
