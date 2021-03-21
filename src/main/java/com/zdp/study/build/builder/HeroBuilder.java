package com.zdp.study.build.builder;

import lombok.Data;
import lombok.NonNull;

/**
 * @author zdp
 * @date 2021/3/21
 * @desc 英雄建造器
 */
@Data
public class HeroBuilder {
    private final Profession profession;

    private final String name;

    private HairType hairType;

    private HairColor hairColor;

    private Armor armor;

    private Weapon weapon;

    public HeroBuilder(@NonNull Profession profession, @NonNull String name) {
        this.profession = profession;
        this.name = name;
    }

    public HeroBuilder withHairType(HairType hairType){
        this.hairType = hairType;

        return this;
    }

    public HeroBuilder withHairColor(HairColor hairColor){
        this.hairColor = hairColor;

        return this;
    }

    public HeroBuilder withArmor(Armor armor){
        this.armor = armor;

        return this;
    }

    public HeroBuilder withWeapon(Weapon weapon){
        this.weapon = weapon;

        return this;
    }

    public Hero build(){
        return new Hero(name,profession,hairType,hairColor,armor,weapon);
    }
}
