package com.zdp.study.behavioral.mediator;

/**
 * @author zdp
 * @date 2021/6/21
 * @desc 抽象聚会成员
 */
public abstract class AbstractPartyMember implements PartyMember {

    protected Party party;

    @Override
    public void joinParty(Party party) {
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(String.format("%s %s",this,action.getDescription()));
    }

    @Override
    public void act(Action action) {
        if (party != null){
            System.out.println(String.format("%s %s",this,action));
            party.act(this,action);
        }
    }

    @Override
    public abstract String toString();
}
