package com.zdp.study.build.abstractfactory;

import com.zdp.study.build.abstractfactory.factory.KingdomFactory;
import com.zdp.study.build.abstractfactory.factory.KingdomFactoryMarker;

/**
 * @author zdp
 * @date 2021/2/14 00:10
 * @desc
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        KingdomFactory factory = KingdomFactoryMarker.makeFactory(KingdomFactoryMarker.ELF_FACTORY);
        Kingdom kingdom = createKingdom(factory);
        System.out.println(kingdom.toString());

        factory = KingdomFactoryMarker.makeFactory(KingdomFactoryMarker.ORC_FACTORY);
        kingdom = createKingdom(factory);
        System.out.println(kingdom.toString());
    }

    public static Kingdom createKingdom(KingdomFactory factory){
        Kingdom result = new Kingdom();
        result.setKing(factory.createKing());
        result.setCastle(factory.createCastle());
        result.setArmy(factory.createArmy());

        return result;
    }
}
