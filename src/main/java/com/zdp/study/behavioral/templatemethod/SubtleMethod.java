package com.zdp.study.behavioral.templatemethod;

/**
 * @author zdp
 * @date 2021/4/11
 * @desc 狡猾的方法
 */
public class SubtleMethod extends StealingMethod {

    @Override
    protected String pickTarget() {
        return "shop keeper";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println(String.format("Approach the %s with tear running and hug him.",target));
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println(String.format("While in close contact grab the %s's wallet.",target));
    }
}
