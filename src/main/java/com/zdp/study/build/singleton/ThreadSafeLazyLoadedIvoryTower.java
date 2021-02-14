package com.zdp.study.build.singleton;

/**
 * @author zdp
 * @date 2021/2/14 14:26
 * @desc 线程安全的延迟加载象牙塔
 */
public class ThreadSafeLazyLoadedIvoryTower {

    /**
     * 使用volatile,防止INSTANCE 对象先进行了引用写入，后进行对象初始化，导致使用方拿到的引用是未初始化的
     */
    private static volatile ThreadSafeLazyLoadedIvoryTower INSTANCE;

    /**
     * 私有化构造方法，防止其他类构造ThreadSafeLazyLoadedIvoryTower对象
     */
    private ThreadSafeLazyLoadedIvoryTower() {
        // 防止通过反射的防止进行初始化
        if (INSTANCE == null){
            INSTANCE = this;
        } else {
            throw new IllegalStateException("Already initialized!");
        }
    }

    /**
     * 延迟加载 直到第一次访问
     * @return
     */
    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance(){
        if (INSTANCE == null){
            synchronized (ThreadSafeLazyLoadedIvoryTower.class){
                if (INSTANCE == null){
                    INSTANCE = new ThreadSafeLazyLoadedIvoryTower();
                }
            }
        }
        return INSTANCE;
    }
}
