package com.zdp.study.structure.proxy;

/**
 * @author zdp
 * @date 2021/3/21
 * @desc 象牙塔
 */
public class IvoryTower implements WizardTower {

    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard.getName() + "enters the ivory tower");
    }
}
