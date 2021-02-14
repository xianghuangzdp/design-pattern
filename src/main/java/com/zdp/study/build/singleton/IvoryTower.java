package com.zdp.study.build.singleton;

/**
 * @author zdp
 * @date 2021/2/14 14:20
 * @desc 象牙塔
 */
public class IvoryTower {

    /**
     * 私有化构造函数，保障其他地方无法构造IvoryTower对象
     */
    private IvoryTower() {
    }

    private static final IvoryTower INSTANCE = new IvoryTower();

    /**
     * 被使用方调用获取IvoryTower对象
     * @return
     */
    public static IvoryTower getInstance(){
        return INSTANCE;
    }
}
