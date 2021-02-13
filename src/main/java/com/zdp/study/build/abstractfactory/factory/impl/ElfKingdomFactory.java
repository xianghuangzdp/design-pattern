package com.zdp.study.build.abstractfactory.factory.impl;

import com.zdp.study.build.abstractfactory.army.Army;
import com.zdp.study.build.abstractfactory.army.ElfArmy;
import com.zdp.study.build.abstractfactory.castle.Castle;
import com.zdp.study.build.abstractfactory.castle.ElfCastle;
import com.zdp.study.build.abstractfactory.factory.KingdomFactory;
import com.zdp.study.build.abstractfactory.king.ElfKing;
import com.zdp.study.build.abstractfactory.king.King;

/**
 * @author zdp
 * @date 2021/2/13 23:54
 * @desc 精灵王国工厂
 */
public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
