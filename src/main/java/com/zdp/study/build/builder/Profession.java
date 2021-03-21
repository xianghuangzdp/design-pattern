package com.zdp.study.build.builder;

/**
 * @author zdp
 * @date 2021/2/27 17:06
 * @desc 职业
 */
public enum Profession {
    WARRIOR("warrior"),
    MAGE("mage"),
    THIEF("thief"),
    PRIEST("priest")
    ;

    private String name;

    Profession(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
