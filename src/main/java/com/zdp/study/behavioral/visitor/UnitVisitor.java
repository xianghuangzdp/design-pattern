package com.zdp.study.behavioral.visitor;

/**
 * @author zdp
 * @date 2021/6/29
 * @desc 集合访问者
 */
public interface UnitVisitor {

    /**
     * 访问士兵
     * @param soldier
     */
    void visitSoldier(Soldier soldier);

    /**
     * 访问军士
     * @param sergeant
     */
    void visitSergeant(Sergeant sergeant);

    /**
     * 访问指挥官
     * @param commander
     */
    void visitCommander(Commander commander);
}
