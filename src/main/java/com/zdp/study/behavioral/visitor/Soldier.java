package com.zdp.study.behavioral.visitor;

import java.util.List;

/**
 * @author zdp
 * @date 2021/6/29
 * @desc 士兵
 */
public class Soldier extends Unit {

    public Soldier(List<Unit> units) {
        super(units);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitSoldier(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Soldier";
    }
}
