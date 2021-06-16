package com.zdp.study.behavioral.command;

/**
 * @author zdp
 * @date 2021/6/14
 * @desc
 */
public enum  Size {

    SMALL("small"),

    NORMAL("normal")
    ;

    private final String title;

    Size(String title) {
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
