package com.zdp.study.behavioral.visitor;

import com.google.common.collect.Lists;

/**
 * @author zdp
 * @date 2021/6/29
 * @desc 访问者模式demo
 * 访问者模式定义了层级结构的访问机制，新的访问模式可以在不改变节点接口的方式添加
 */
public class VisitorDemo {

    public static void main(String[] args) {
        Commander commander = new Commander(Lists.newArrayList(
                new Sergeant(Lists.newArrayList(new Soldier(Lists.newArrayList()),new Soldier(Lists.newArrayList()))),
                new Sergeant(Lists.newArrayList(new Soldier(Lists.newArrayList()),new Soldier(Lists.newArrayList())))
        ));

        commander.accept(new SoldierVisitor());
        commander.accept(new SergeantVisitor());
        commander.accept(new CommanderVisitor());
    }
}
