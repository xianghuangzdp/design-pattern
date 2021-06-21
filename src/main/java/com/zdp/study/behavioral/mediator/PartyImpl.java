package com.zdp.study.behavioral.mediator;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Objects;

/**
 * @author zdp
 * @date 2021/6/21
 * @desc
 */
public class PartyImpl implements Party {

    private final List<PartyMember> members;

    public PartyImpl() {
        members = Lists.newArrayList();
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinParty(this);
    }

    @Override
    public void act(PartyMember actor, Action action) {
        members.stream().filter(m -> !Objects.equals(m,actor)).forEach(m -> m.partyAction(action));
    }
}
