package com.zdp.study.behavioral.visitor;

/**
 * @author zdp
 * @date 2021/6/29
 * @desc 指挥官访问者
 */
public class CommanderVisitor implements UnitVisitor {

    @Override
    public void visitSoldier(Soldier soldier) {

    }

    @Override
    public void visitSergeant(Sergeant sergeant) {

    }

    @Override
    public void visitCommander(Commander commander) {
        System.out.println(String.format("Good to see you %s",commander));
    }
}
