package com.zdp.study.structure.facade;

import java.util.Arrays;
import java.util.List;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 矮人金矿门面
 */
public class DwarvenGoldmineFacade {

    private List<DwarvenMineWorker> workers = Arrays.asList(
            new DwarvenCartOperator(),
            new DwarvenGoldDigger(),
            new DwarvenTunnelDigger()
    );

    public void startNewDay(){
        workers.forEach(w -> w.action(Arrays.asList(DwarvenMineWorker.WAKE_UP,DwarvenMineWorker.GO_TO_MINE)));
    }

    public void digOutGold(){
        workers.forEach(w -> w.action(DwarvenMineWorker.WORK));
    }

    public void endDay(){
        workers.forEach(w -> w.action(Arrays.asList(DwarvenMineWorker.GO_HOME,DwarvenMineWorker.GO_TO_SLEEP)));
    }
}
