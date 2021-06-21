package com.zdp.study.behavioral.mediator;

/**
 * @author zdp
 * @date 2021/6/21
 * @desc 中介模式
 * 中介模式定义了一个对象，他封装了一组对象间的交互方法
 * 通常一个程序由大量的对象组成，逻辑和运算穿插在这些类之间，然而随着更多的类被开发进入系统，特别是在重构和维护的时候，类之间的交流会变得非常复杂，
 * 这使得程序的维护变得十分复杂，长此以往，将很难对程序进行修改，任何一个改动都有可能影响一系列的对象
 * 在中介模式中，类之间的通信被封装在中介对象中，类之间不再直接的相互沟通，这会减少类之间的依赖，从而降低耦合
 */
public class MediatorDemo {

    public static void main(String[] args) {
        Party party = new PartyImpl();

        Hobbit hobbit = new Hobbit();
        Wizard wizard = new Wizard();
        Rogue rogue = new Rogue();
        Hunter hunter = new Hunter();

        party.addMember(hobbit);
        party.addMember(wizard);
        party.addMember(rogue);
        party.addMember(hunter);

        hobbit.act(Action.ENEMY);
        wizard.act(Action.TALE);
        rogue.act(Action.GOLD);
        hunter.act(Action.HUNT);
    }
}
