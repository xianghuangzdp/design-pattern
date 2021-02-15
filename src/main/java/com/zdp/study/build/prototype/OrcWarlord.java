package com.zdp.study.build.prototype;

import lombok.Getter;

import java.util.Objects;

/**
 * @author zdp
 * @date 2021/2/15 17:29
 * @desc 兽人战士
 */
@Getter
public class OrcWarlord extends Warlord<OrcWarlord> {

    private final String weapon;

    public OrcWarlord(String weapon) {
        this.weapon = weapon;
    }

    public OrcWarlord(OrcWarlord source) {
        super(source);
        this.weapon = source.getWeapon();
    }

    @Override
    public OrcWarlord copy() {
        return new OrcWarlord(this);
    }

    @Override
    public String toString() {
        return "Orcish warlord attacks with " + weapon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }

        OrcWarlord that = (OrcWarlord) o;
        return Objects.equals(weapon, that.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weapon);
    }
}
