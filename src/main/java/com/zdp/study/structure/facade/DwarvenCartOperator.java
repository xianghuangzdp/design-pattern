package com.zdp.study.structure.facade;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 矮人驾驶员
 */
public class DwarvenCartOperator extends DwarvenMineWorker {

    @Override
    public void work() {
        System.out.println(getName() + " moves gold chunks out of the mine");
    }

    @Override
    public String getName() {
        return "Dwarf cart operator";
    }
}
