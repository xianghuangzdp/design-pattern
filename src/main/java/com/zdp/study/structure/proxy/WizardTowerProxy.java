package com.zdp.study.structure.proxy;

/**
 * @author zdp
 * @date 2021/3/21
 * @desc 法师塔代理类
 */
public class WizardTowerProxy implements WizardTower {

    public static final Integer MAX_ENTER_NUMBER = 3;

    private Integer currentEnterNumber = 0;

    private final WizardTower wizardTower;

    public WizardTowerProxy(WizardTower wizardTower) {
        this.wizardTower = wizardTower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (currentEnterNumber < MAX_ENTER_NUMBER){
            wizardTower.enter(wizard);
            currentEnterNumber++;
        } else {
            System.out.println(wizard.getName() + " is not allowed to enter! ");
        }
    }
}
