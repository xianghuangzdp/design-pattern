package com.zdp.study.build.abstractfactory.castle;

/**
 * @author zdp
 * @date 2021/2/13 23:56
 * @desc 精灵城堡
 */
public class ElfCastle implements Castle {
    public static final String DESC = "this is a elf castle";
    @Override
    public String desc() {
        return DESC;
    }
}
