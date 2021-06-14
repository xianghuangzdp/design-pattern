package com.zdp.study.action.templatemethod;

/**
 * @author zdp
 * @date 2021/4/11
 * @desc 盗贼
 */
public class HalfingThief {

    private StealingMethod method;

    public HalfingThief(StealingMethod method) {
        this.method = method;
    }

    public void changeMethod(StealingMethod newMethod){
        method = newMethod;
    }

    public void steal(){
        method.steal();
    }
}
