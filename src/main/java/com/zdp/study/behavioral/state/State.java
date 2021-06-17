package com.zdp.study.behavioral.state;

/**
 * @author zdp
 * @date 2021/6/18
 * @desc 状态
 */
public interface State {

    void onEnterState();

    void observe();
}
