package com.zdp.study.behavioral.mediator;

/**
 * @author zdp
 * @date 2021/6/21
 * @desc 聚会
 */
public interface Party {

    void addMember(PartyMember member);

    void act(PartyMember actor, Action action);
}
