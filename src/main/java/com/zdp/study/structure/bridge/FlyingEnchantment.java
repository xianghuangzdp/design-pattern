package com.zdp.study.structure.bridge;

/**
 * @author zdp
 * @date 2021/4/4
 * @desc 飞翔附魔
 */
public class FlyingEnchantment implements Enchantment {

    private Boolean activate = false;

    @Override
    public void onActivate() {
        activate = true;
        System.out.println("The item begins to grow faintly.");
    }

    @Override
    public void apply() {
        if (activate){
            System.out.println("The item flies and strikes enemies finally returning to owner's hand.");
        } else {
            System.out.println("The item is deactivate.");
        }
    }

    @Override
    public void onDeactivate() {
        activate = false;
        System.out.println("The item's grow fades.");
    }
}
