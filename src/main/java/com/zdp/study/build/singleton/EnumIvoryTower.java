package com.zdp.study.build.singleton;

/**
 * @author zdp
 * @date 2021/2/14 14:23
 * @desc 枚举类型象牙塔
 */
public enum EnumIvoryTower {
    INSTANCE
    ;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
