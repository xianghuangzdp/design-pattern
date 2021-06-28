package com.zdp.study.behavioral.visitor;

import java.util.List;

/**
 * @author zdp
 * @date 2021/6/29
 * @desc 军士
 */
public class Sergeant extends Unit {

    public Sergeant(List<Unit> units) {
        super(units);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitSergeant(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Sergeant";
    }
}
