package com.zdp.study.structure.bridge;

/**
 * @author zdp
 * @date 2021/4/4
 * @desc 附魔
 */
public interface Enchantment {

    /**
     * 生效
     */
    void onActivate();

    /**
     * 使用
     */
    void apply();

    /**
     * 失效
     */
    void onDeactivate();
}
