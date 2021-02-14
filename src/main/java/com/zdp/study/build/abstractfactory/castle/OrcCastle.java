package com.zdp.study.build.abstractfactory.castle;

/**
 * @author zdp
 * @date 2021/2/14 00:00
 * @desc 兽人城堡
 */
public class OrcCastle implements Castle {
    public static final String DESC = "this is a orc castle";

    @Override
    public String desc() {
        return DESC;
    }
}
