package com.zdp.study.build.builder;

import lombok.Getter;

/**
 * @author zdp
 * @date 2021/2/27 17:05
 * @desc 英雄
 */
@Getter
public class Hero {
    /**
     * 名字
     */
    private final String name;

    /**
     * 职业
     */
    private final Profession profession;

    /**
     * 头发类型
     */
    private final HairType hairType;

    /**
     * 头发颜色
     */
    private final HairColor hairColor;

    /**
     * 盔甲
     */
    private final Armor armor;

    /**
     * 武器
     */
    private final Weapon weapon;

    public Hero(String name, Profession profession, HairType hairType, HairColor hairColor, Armor armor, Weapon weapon) {
        this.name = name;
        this.profession = profession;
        this.hairType = hairType;
        this.hairColor = hairColor;
        this.armor = armor;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a ")
                .append(profession)
                .append(" named ")
                .append(name);
        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor).append(' ');
            }
            if (hairType != null) {
                sb.append(hairType).append(' ');
            }
            sb.append(hairType != HairType.BALD ? "hair" : "head");
        }
        if (armor != null) {
            sb.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ").append(weapon);
        }
        sb.append('.');
        return sb.toString();
    }
}
