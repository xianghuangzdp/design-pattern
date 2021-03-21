package com.zdp.study.build.builder;

/**
 * @author zdp
 * @date 2021/2/27 17:10
 * @desc 盔甲
 */
public enum  Armor {

    CLOTHES("clothes"),
    LEATHER("leather"),
    CHAIN_MAIL("chainMail"),
    PLATE_MAIL("plateMail")
    ;

    private final String title;

    private Armor(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
