package com.zdp.study.behavioral.mediator;

/**
 * @author zdp
 * @date 2021/6/21
 * @desc 聚会成员
 */
public interface PartyMember {

    /**
     * 加入聚会
     * @param party
     */
    void joinParty(Party party);

    /**
     * 做聚会行为
     * @param action
     */
    void partyAction(Action action);

    /**
     * 指挥其他人做聚会行为
     * @param action
     */
    void act(Action action);
}
