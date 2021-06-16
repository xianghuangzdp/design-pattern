package com.zdp.study.behavioral.templatemethod;

/**
 * @author zdp
 * @date 2021/4/11
 * @desc 模板方法demo
 * 模板方法模式帮助算法框架，算法的子类提供了空白的实现
 */
public class TemplateMethodDemo {

    public static void main(String[] args) {
        HalfingThief thief = new HalfingThief(new HitAndRunMethod());
        thief.steal();
        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
