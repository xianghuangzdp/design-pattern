package com.zdp.study.build.abstractfactory.army;

/**
 * @author zdp
 * @date 2021/2/13 23:56
 * @desc 精灵军队
 */
public class ElfArmy implements Army {
    public static final String DESC = "this is a elf army";

    @Override
    public String desc() {
        return DESC;
    }
}
