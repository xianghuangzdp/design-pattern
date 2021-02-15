package com.zdp.study.build.prototype;

import lombok.Getter;

import java.util.Objects;

/**
 * @author zdp
 * @date 2021/2/15 17:28
 * @desc 精灵战士
 */
@Getter
public class ElfWarlord extends Warlord<ElfWarlord> {

    private final String helpType;

    public ElfWarlord(String helpType) {
        this.helpType = helpType;
    }

    public ElfWarlord(ElfWarlord source) {
        super(source);
        this.helpType = source.getHelpType();
    }

    @Override
    public ElfWarlord copy() {
        return new ElfWarlord(this);
    }

    @Override
    public String toString() {
        return "Elven warlord helps in " + helpType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ElfWarlord that = (ElfWarlord) o;
        return Objects.equals(helpType, that.helpType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(helpType);
    }
}
