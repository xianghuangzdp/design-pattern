package com.zdp.study.structure.flyweight;

import lombok.Getter;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 药水类型
 */
public enum PotionType {
    HEALING("healing"),
    INVISIBILITY("invisibility"),
    STRENGTH("strength"),
    HOLY_WATER("holyWater"),
    POISON("poison")
    ;

    @Getter
    private String type;

    PotionType(String type) {
        this.type = type;
    }
}
