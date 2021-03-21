package com.zdp.study.build.builder;

/**
 * @author zdp
 * @date 2021/2/27 17:00
 * @desc 建造者模式
 */
public class BuilderPattern {

    public static void main(String[] args) {
        Hero mage = new HeroBuilder(Profession.MAGE,"Riobard")
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.DAGGER)
                .build();

        System.out.println(mage.toString());

        Hero warrior = new HeroBuilder(Profession.WARRIOR,"Amberjill")
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_CURLY)
                .withArmor(Armor.CHAIN_MAIL)
                .withWeapon(Weapon.SWORD)
                .build();

        System.out.println(warrior.toString());

        Hero thief = new HeroBuilder(Profession.THIEF,"Desmond")
                .withHairType(HairType.BALD)
                .withWeapon(Weapon.BOW)
                .build();

        System.out.println(thief.toString());
    }
}
