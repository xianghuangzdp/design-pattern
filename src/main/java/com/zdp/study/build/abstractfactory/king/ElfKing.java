package com.zdp.study.build.abstractfactory.king;

/**
 * @author zdp
 * @date 2021/2/13 23:55
 * @desc 精灵国王
 */
public class ElfKing implements King {
    public static final String DESC = "this is a elf king";
    @Override
    public String desc() {
        return DESC;
    }
}
