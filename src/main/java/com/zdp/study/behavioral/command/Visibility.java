package com.zdp.study.behavioral.command;

/**
 * @author zdp
 * @date 2021/6/14
 * @desc 可见度
 */
public enum  Visibility {
    VISIBLE("visible"),
    INVISIBLE("invisible")
    ;

    private final String title;

    Visibility(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
