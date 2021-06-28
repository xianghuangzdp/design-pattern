package com.zdp.study.behavioral.visitor;

/**
 * @author zdp
 * @date 2021/6/29
 * @desc 士兵访问者
 */
public class SoldierVisitor implements UnitVisitor {

    @Override
    public void visitSoldier(Soldier soldier) {
        System.out.println(String.format("Greeting %s ",soldier));
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {

    }

    @Override
    public void visitCommander(Commander commander) {

    }
}
