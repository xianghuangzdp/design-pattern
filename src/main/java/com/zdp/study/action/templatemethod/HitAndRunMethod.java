package com.zdp.study.action.templatemethod;

/**
 * @author zdp
 * @date 2021/4/11
 * @desc 偷袭and逃跑方法
 */
public class HitAndRunMethod extends StealingMethod {

    @Override
    protected String pickTarget() {
        return "old goblin woman";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println(String.format("Approach the %s from behind.",target));
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println("Grab the handbag and run away fast!");
    }
}
