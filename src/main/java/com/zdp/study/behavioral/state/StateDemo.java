package com.zdp.study.behavioral.state;

/**
 * @author zdp
 * @date 2021/6/18
 * @desc 状态模式demo
 * 状态模式包含一个定义了自身状态的对象，通过改变对象的状态来改变对象的行为
 * 他是一种比较干净的方式在运行时改变对象的行为，而不用维护一个巨大的规则，并且可以提高系统的可维护性
 */
public class StateDemo {

    public static void main(String[] args) {
        Mammoth mammoth = new Mammoth();

        mammoth.observe();

        mammoth.timePasses();
        mammoth.observe();

        mammoth.timePasses();
        mammoth.observe();
    }
}
