package com.zdp.study.build.singleton;

import org.springframework.util.Assert;

/**
 * @author zdp
 * @date 2021/2/14 14:19
 * @desc 单例模式
 */
public class SingletonPattern {

    public static void main(String[] args) {

        // 简单单例模式
        IvoryTower ivoryTower1 = IvoryTower.getInstance();
        IvoryTower ivoryTower2 = IvoryTower.getInstance();
        System.out.println("ivoryTower1 = " + ivoryTower1);
        System.out.println("ivoryTower2 = " + ivoryTower2);
        Assert.isTrue(ivoryTower1 == ivoryTower2);

        // 枚举单例模式
        EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
        EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
        System.out.println("enumIvoryTower1 = " + enumIvoryTower1);
        System.out.println("enumIvoryTower2 = " + enumIvoryTower2);
        Assert.isTrue(enumIvoryTower1 == enumIvoryTower1);

        // 延迟加载单例模式
        ThreadSafeLazyLoadedIvoryTower lazyLoadedIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        ThreadSafeLazyLoadedIvoryTower lazyLoadedIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        System.out.println("lazyLoadedIvoryTower1 = " + lazyLoadedIvoryTower1);
        System.out.println("lazyLoadedIvoryTower2 = " + lazyLoadedIvoryTower2);
        Assert.isTrue(lazyLoadedIvoryTower1 == lazyLoadedIvoryTower2);

        // 双重校验延迟加载单例模式
        ThreadSafeDoubleCheckLockingIvoryTower doubleCheckLockingIvoryTower1 = ThreadSafeDoubleCheckLockingIvoryTower.getInstance();
        ThreadSafeDoubleCheckLockingIvoryTower doubleCheckLockingIvoryTower2 = ThreadSafeDoubleCheckLockingIvoryTower.getInstance();
        System.out.println("doubleCheckLockingIvoryTower1 = " + doubleCheckLockingIvoryTower1);
        System.out.println("doubleCheckLockingIvoryTower2 = " + doubleCheckLockingIvoryTower2);
        Assert.isTrue(doubleCheckLockingIvoryTower1 == doubleCheckLockingIvoryTower2);

        // 句柄初始化单例模式
        InitializingOnDemandHolderIdiomIvoryTower holderIdiomIvoryTower1 = InitializingOnDemandHolderIdiomIvoryTower.getInstance();
        InitializingOnDemandHolderIdiomIvoryTower holderIdiomIvoryTower2 = InitializingOnDemandHolderIdiomIvoryTower.getInstance();
        System.out.println("holderIdiomIvoryTower1 = " + holderIdiomIvoryTower1);
        System.out.println("holderIdiomIvoryTower2 = " + holderIdiomIvoryTower2);
        Assert.isTrue(holderIdiomIvoryTower1 == holderIdiomIvoryTower2);
    }
}
