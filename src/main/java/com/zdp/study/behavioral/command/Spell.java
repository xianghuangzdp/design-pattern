package com.zdp.study.behavioral.command;

/**
 * @author zdp
 * @date 2021/6/14
 * @desc 咒语
 */
public interface Spell {

    /**
     * 施法
     */
    void run();

    /**
     * 撤回
     */
    void undo();
}
