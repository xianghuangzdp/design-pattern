package com.zdp.study.behavioral.state;

/**
 * @author zdp
 * @date 2021/6/18
 * @desc 长毛象
 */
public class Mammoth {

    private State state;

    public Mammoth() {
        this.state = new PeacefulState(this);
    }

    /**
     * 时间流逝
     */
    public void timePasses(){
        if (state instanceof AngryState){
            changeState(new PeacefulState(this));
        } else {
            changeState(new AngryState(this));
        }
    }

    private void changeState(State state){
        this.state = state;
        this.state.onEnterState();
    }

    public void observe(){
        this.state.observe();
    }

    @Override
    public String toString() {
        return "mammoth";
    }
}
