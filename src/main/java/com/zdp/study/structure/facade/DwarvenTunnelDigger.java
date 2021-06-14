package com.zdp.study.structure.facade;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 矮人矿道挖掘者
 */
public class DwarvenTunnelDigger extends DwarvenMineWorker {

    @Override
    public void work() {
        System.out.println(getName() + " creates another promising tunnel.");
    }

    @Override
    public String getName() {
        return "Dwarf tunnel digger";
    }
}
