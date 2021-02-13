package com.zdp.study.build.abstractfactory.king;

/**
 * @author zdp
 * @date 2021/2/13 23:59
 * @desc 兽人国王
 */
public class OrcKing implements King {
    public static final String DESC = "this is a orc king";

    @Override
    public String desc() {
        return DESC;
    }
}
