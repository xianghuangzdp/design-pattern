package com.zdp.study.build.singleton;

/**
 * @author zdp
 * @date 2021/2/14 14:40
 * @desc 线程安全的双重锁校验
 */
public class ThreadSafeDoubleCheckLockingIvoryTower {

    private static volatile ThreadSafeDoubleCheckLockingIvoryTower INSTANCE;

    private static boolean flag = true;

    /**
     * 加上标记位，防止被反射初始化
     */
    private ThreadSafeDoubleCheckLockingIvoryTower() {
        if (flag){
            flag = false;
        } else {
            throw new IllegalStateException("Already initialized!");
        }
    }

    public static ThreadSafeDoubleCheckLockingIvoryTower getInstance(){
        // 使用本地变量比使用静态变量快25%

        ThreadSafeDoubleCheckLockingIvoryTower result = INSTANCE;

        //检查是否被初始化，如果初始化，则可以直接返回
        if (result == null){
            // 加锁，防止其他线程进入初始化
            synchronized (ThreadSafeDoubleCheckLockingIvoryTower.class){
                result = INSTANCE;
                // 再次检查是否被初始化
                if (result == null){
                    result = new ThreadSafeDoubleCheckLockingIvoryTower();
                    INSTANCE = result;
                }
            }
        }
        return result;
    }
}
