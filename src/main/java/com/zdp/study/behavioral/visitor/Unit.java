package com.zdp.study.behavioral.visitor;

import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

/**
 * @author zdp
 * @date 2021/6/29
 * @desc 集合
 */
public class Unit {
    private final List<Unit> units;

    public Unit(List<Unit> units) {
        if (CollectionUtils.isEmpty(units)){
            this.units = Lists.newArrayList();
        } else {
            this.units = units;
        }
    }

    public void accept(UnitVisitor visitor){
        units.forEach(unit -> unit.accept(visitor));
    }
}
