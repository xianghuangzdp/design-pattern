package com.zdp.study.build.abstractfactory.factory;

import com.zdp.study.build.abstractfactory.army.Army;
import com.zdp.study.build.abstractfactory.castle.Castle;
import com.zdp.study.build.abstractfactory.king.King;

/**
 * @author zdp
 * @date 2021/2/13 23:52
 * @desc
 */
public interface KingdomFactory {
    /**
     * 创建国王
     * @return
     */
    King createKing();

    /**
     * 创建城堡
     * @return
     */
    Castle createCastle();

    /**
     * 创建军队
     * @return
     */
    Army createArmy();
}
