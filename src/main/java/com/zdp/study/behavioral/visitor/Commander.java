package com.zdp.study.behavioral.visitor;

import java.util.List;

/**
 * @author zdp
 * @date 2021/6/29
 * @desc 指挥官
 */
public class Commander extends Unit {

    public Commander(List<Unit> units) {
        super(units);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitCommander(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Commander";
    }
}
