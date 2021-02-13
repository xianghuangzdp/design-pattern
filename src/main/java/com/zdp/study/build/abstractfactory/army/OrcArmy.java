package com.zdp.study.build.abstractfactory.army;

/**
 * @author zdp
 * @date 2021/2/14 00:01
 * @desc 兽人军队
 */
public class OrcArmy implements Army {
    public static final String DESC = "this is a orc army";

    @Override
    public String desc() {
        return DESC;
    }
}
