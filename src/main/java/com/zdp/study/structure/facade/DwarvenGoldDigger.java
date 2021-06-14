package com.zdp.study.structure.facade;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 矮人黄金挖掘者
 */
public class DwarvenGoldDigger extends DwarvenMineWorker {

    @Override
    public void work() {
        System.out.println(getName() + " digs for gold");
    }

    @Override
    public String getName() {
        return "Dwarf gold digger";
    }
}
