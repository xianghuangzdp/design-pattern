package com.zdp.study.build.prototype;

/**
 * @author zdp
 * @date 2021/2/15 17:13
 * @desc
 */
public interface Prototype<T> {
    /**
     * 复制
     * @return
     */
    T copy();
}
