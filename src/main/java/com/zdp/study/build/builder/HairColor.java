package com.zdp.study.build.builder;

/**
 * @author zdp
 * @date 2021/2/27 17:09
 * @desc 头发颜色
 */
public enum HairColor {
    WHITE("white"),
    BLOND("blond"),
    RED("red"),
    BROWN("brown"),
    BLACK("black")
    ;
    private String name;

    HairColor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
