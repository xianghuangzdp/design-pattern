package com.zdp.study.behavioral.templatemethod;

/**
 * @author zdp
 * @date 2021/4/11
 * @desc 偷窃的方法
 */
public abstract class StealingMethod {

    protected abstract String pickTarget();

    protected abstract void confuseTarget(String target);

    protected abstract void stealTheItem(String target);

    public void steal(){
        String target = pickTarget();

        System.out.println(String.format("The target has been chosen as %s.",target));

        confuseTarget(target);
        stealTheItem(target);
    }
}
