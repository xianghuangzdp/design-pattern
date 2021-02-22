package com.zdp.study.build.factorymethod;

/**
 * @author zdp
 * @date 2021/2/23 00:37
 * @desc
 */
public enum WeaponType {
    SHORT_SWORD("shortSword"),
    SPEAR("spear"),
    AXE("axe"),
    UNDEFINED("")
    ;

    private final String title;

    WeaponType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
