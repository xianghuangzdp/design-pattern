package com.zdp.study.build.prototype;

import lombok.Getter;

import java.util.Objects;

/**
 * @author zdp
 * @date 2021/2/15 17:27
 * @desc 兽人魔法师
 */
@Getter
public class OrcMage extends Mage<OrcMage> {

    private final String weapon;

    public OrcMage(String weapon) {
        this.weapon = weapon;
    }

    public OrcMage(OrcMage source) {
        super(source);
        this.weapon = source.getWeapon();
    }

    @Override
    public OrcMage copy() {
        return new OrcMage(this);
    }

    @Override
    public String toString() {
        return "Orcish mage attacks with " + weapon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OrcMage orcMage = (OrcMage) o;
        return Objects.equals(weapon, orcMage.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weapon);
    }
}
