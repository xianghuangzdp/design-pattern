package com.zdp.study.build.builder;

/**
 * @author zdp
 * @date 2021/2/27 17:09
 * @desc 头发类型
 */
public enum HairType {
    BALD("bald"),
    SHORT("short"),
    CURLY("curly"),
    LONG_STRAIGHT("longStraight"),
    LONG_CURLY("longCurly"),
    ;

    private final String title;

    HairType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
