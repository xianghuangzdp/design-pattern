package com.zdp.study.structure.facade;

import java.util.List;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 矮人矿工
 */
public abstract class DwarvenMineWorker {

    public static final Action WAKE_UP = (worker) -> worker.wakeUp();

    public static final Action GO_TO_MINE = (worker) -> worker.goToMine();

    public static final Action WORK = (worker) -> worker.work();

    public static final Action GO_HOME = (worker) -> worker.goHome();

    public static final Action GO_TO_SLEEP = (worker) -> worker.goToSleep();

    public void action(Action action){
        action.action(this);
    }

    public void action(List<Action> actionList){
        actionList.forEach(a -> a.action(this));
    }

    public void wakeUp(){
        System.out.println(getName() + " wake up");
    }

    public void goToMine(){
        System.out.println(getName() + " go to mine");
    }

    public void work(){
        System.out.println(getName() + " work");
    }

    public void goHome(){
        System.out.println(getName() + " go home");
    }

    public void goToSleep(){
        System.out.println(getName() + " go to sleep");
    }

    public abstract String getName();
}
