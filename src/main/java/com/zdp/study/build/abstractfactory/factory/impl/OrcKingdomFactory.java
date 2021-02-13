package com.zdp.study.build.abstractfactory.factory.impl;

import com.zdp.study.build.abstractfactory.Kingdom;
import com.zdp.study.build.abstractfactory.army.Army;
import com.zdp.study.build.abstractfactory.army.OrcArmy;
import com.zdp.study.build.abstractfactory.castle.Castle;
import com.zdp.study.build.abstractfactory.castle.OrcCastle;
import com.zdp.study.build.abstractfactory.factory.KingdomFactory;
import com.zdp.study.build.abstractfactory.king.King;
import com.zdp.study.build.abstractfactory.king.OrcKing;

/**
 * @author zdp
 * @date 2021/2/13 23:58
 * @desc 兽人王国工厂
 */
public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
