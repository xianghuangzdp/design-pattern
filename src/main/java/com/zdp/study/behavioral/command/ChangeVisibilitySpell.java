package com.zdp.study.behavioral.command;

/**
 * @author zdp
 * @date 2021/6/14
 * @desc 改变可见度咒语
 */
public class ChangeVisibilitySpell implements Spell {

    private final Target target;

    private final Visibility initVisibility;

    public ChangeVisibilitySpell(Target target) {
        this.target = target;
        initVisibility = target.getVisibility();
    }

    @Override
    public void run() {
        Visibility targetVisibility = initVisibility == Visibility.VISIBLE ? Visibility.INVISIBLE : Visibility.VISIBLE;
        target.setVisibility(targetVisibility);
    }

    @Override
    public void undo() {
        target.setVisibility(initVisibility);
    }
}
