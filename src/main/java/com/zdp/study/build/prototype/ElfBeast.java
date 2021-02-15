package com.zdp.study.build.prototype;

import lombok.Getter;

import java.util.Objects;

/**
 * @author zdp
 * @date 2021/2/15 17:20
 * @desc 精灵野兽
 */
@Getter
public class ElfBeast extends Beast<ElfBeast> {

    private final String helpType;

    public ElfBeast(String helpType) {
        this.helpType = helpType;
    }

    public ElfBeast(ElfBeast source) {
        super(source);
        this.helpType = source.getHelpType();
    }

    @Override
    public ElfBeast copy() {
        return new ElfBeast(this);
    }

    @Override
    public String toString() {
        return "Elven beast helps in " + helpType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        ElfBeast elfBeast = (ElfBeast) o;
        return Objects.equals(helpType, elfBeast.helpType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(helpType);
    }
}
