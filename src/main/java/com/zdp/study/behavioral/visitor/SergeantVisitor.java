package com.zdp.study.behavioral.visitor;

/**
 * @author zdp
 * @date 2021/6/29
 * @desc 军士访问者
 */
public class SergeantVisitor implements UnitVisitor {

    @Override
    public void visitSoldier(Soldier soldier) {

    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        System.out.println(String.format("Hello %s",sergeant));
    }

    @Override
    public void visitCommander(Commander commander) {

    }
}
