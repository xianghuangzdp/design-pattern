package com.zdp.study.behavioral.mediator;

/**
 * @author zdp
 * @date 2021/6/21
 * @desc
 */
public enum Action {
    HUNT("hunted a rabbit","arrives for dinner"),
    TALE("tells a tale","comes to listen"),
    GOLD("found gold","takes his share of gold"),
    ENEMY("spotted enemies","runs for cover"),
    NONE("","")
    ;

    private String title;
    private String description;

    Action(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
