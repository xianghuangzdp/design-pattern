package com.zdp.study.build.singleton;

/**
 * @author zdp
 * @date 2021/2/14 14:56
 * @desc 通过句柄初始化的象牙塔，jdk1.8以上可以用
 */
public class InitializingOnDemandHolderIdiomIvoryTower {

    /**
     * 私有化构造函数，防止其他类初始化
     */
    private InitializingOnDemandHolderIdiomIvoryTower() {
    }

    public static InitializingOnDemandHolderIdiomIvoryTower getInstance(){
        return HelperHolder.INSTANCE;
    }

    private static class HelperHolder {
        private static volatile InitializingOnDemandHolderIdiomIvoryTower INSTANCE = new InitializingOnDemandHolderIdiomIvoryTower();
    }
}
