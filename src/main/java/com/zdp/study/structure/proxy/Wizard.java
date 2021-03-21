package com.zdp.study.structure.proxy;

import lombok.Getter;

/**
 * @author zdp
 * @date 2021/3/21
 * @desc 法师
 */
@Getter
public class Wizard {

    private final String name;

    public Wizard(String name) {
        this.name = name;
    }
}
