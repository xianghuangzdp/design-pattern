package com.zdp.study.behavioral.state;

/**
 * @author zdp
 * @date 2021/6/18
 * @desc 愤怒状态
 */
public class AngryState implements State {

    private final Mammoth mammoth;

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println(String.format("%s gets angry!",mammoth));
    }

    @Override
    public void observe() {
        System.out.println(String.format("%s is furious!",mammoth));
    }
}
