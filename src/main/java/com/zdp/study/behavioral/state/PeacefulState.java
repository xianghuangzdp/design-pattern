package com.zdp.study.behavioral.state;

/**
 * @author zdp
 * @date 2021/6/18
 * @desc 平静状态
 */
public class PeacefulState implements State {

    private final Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println(String.format("%s calms down",mammoth));
    }

    @Override
    public void observe() {
        System.out.println(String.format("%s is calm and peaceful",mammoth));
    }
}
