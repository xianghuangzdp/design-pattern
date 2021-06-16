package com.zdp.study.behavioral.command;

/**
 * @author zdp
 * @date 2021/6/14
 * @desc 改变size的咒语
 */
public class ChangeSizeSpell implements Spell {

    private final Target target;

    private final Size initSize;

    public ChangeSizeSpell(Target target) {
        this.target = target;
        initSize = target.getSize();
    }

    @Override
    public void run() {
        Size targetSize = initSize == Size.NORMAL ? Size.SMALL : Size.NORMAL;
        target.setSize(targetSize);
    }

    @Override
    public void undo() {
        target.setSize(initSize);
    }
}
