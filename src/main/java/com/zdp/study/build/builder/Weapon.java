package com.zdp.study.build.builder;

/**
 * @author zdp
 * @date 2021/2/27 17:10
 * @desc 武器
 */
public enum Weapon {
    DAGGER("dagger"),
    SWORD("sword"),
    AXE("axe"),
    WARHAMMER("warHammer"),
    BOW("bow")
    ;

    private final String name;

    Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
