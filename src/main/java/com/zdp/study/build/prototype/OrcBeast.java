package com.zdp.study.build.prototype;

import lombok.Getter;

import java.util.Objects;

/**
 * @author zdp
 * @date 2021/2/15 17:23
 * @desc 兽人野兽
 */
@Getter
public class OrcBeast extends Beast<OrcBeast> {

    private final String weapon;

    public OrcBeast(String weapon) {
        this.weapon = weapon;
    }

    public OrcBeast(OrcBeast source) {
        super(source);
        this.weapon = source.getWeapon();
    }

    @Override
    public OrcBeast copy() {
        return new OrcBeast(this);
    }

    @Override
    public String toString() {
        return "Orcish beast attacks with " + weapon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OrcBeast orcBeast = (OrcBeast) o;
        return Objects.equals(weapon, orcBeast.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weapon);
    }
}
