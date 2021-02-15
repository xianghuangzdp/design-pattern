package com.zdp.study.build.prototype;

import lombok.Getter;

import java.util.Objects;

/**
 * @author zdp
 * @date 2021/2/15 17:25
 * @desc 精灵魔法师
 */
@Getter
public class ElfMage extends Mage<ElfMage> {

    private final String helpType;

    public ElfMage(String helpType) {
        this.helpType = helpType;
    }

    public ElfMage(ElfMage source) {
        super(source);
        this.helpType = source.getHelpType();
    }

    @Override
    public ElfMage copy() {
        return new ElfMage(this);
    }

    @Override
    public String toString() {
        return "Elven mage helps in " + helpType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ElfMage elfMage = (ElfMage) o;
        return Objects.equals(helpType, elfMage.helpType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(helpType);
    }
}
