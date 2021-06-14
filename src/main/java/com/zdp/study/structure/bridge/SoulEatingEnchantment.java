package com.zdp.study.structure.bridge;

/**
 * @author zdp
 * @date 2021/4/4
 * @desc 灵魂吞噬附魔
 */
public class SoulEatingEnchantment implements Enchantment {

    private Boolean activate = false;

    @Override
    public void onActivate() {
        activate = true;
        System.out.println("The item spread bloodlust.");
    }

    @Override
    public void apply() {
        if (activate){
            System.out.println("The item eating soul of enemies.");
        } else {
            System.out.println("The item is deactivate.");
        }
    }

    @Override
    public void onDeactivate() {
        activate = false;
        System.out.println("Bloodlust slowly disappears.");
    }
}
