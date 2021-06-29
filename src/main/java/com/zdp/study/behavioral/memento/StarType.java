package com.zdp.study.behavioral.memento;

/**
 * @author zdp
 * @date 2021/6/30
 * @desc 星球的类型
 */
public enum  StarType {
    SUN("sun"),
    RED_GIANT("red_giant"),
    WHITE_DWARF("white_dwarf"),
    SUPERNOVA("supernova"),
    DEAD("dead")
    ;

    private final String title;

    StarType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
