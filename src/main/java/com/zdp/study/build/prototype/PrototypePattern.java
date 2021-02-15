package com.zdp.study.build.prototype;

import com.zdp.study.build.prototype.impl.HeroFactoryImpl;
import org.springframework.util.Assert;

/**
 * @author zdp
 * @date 2021/2/15 17:13
 * @desc 原型模式
 */
public class PrototypePattern {

    public static void main(String[] args) {

        Beast sourceBeast = new ElfBeast("cooking");
        Mage sourceMage = new ElfMage("cleaning");
        Warlord sourceWarlord = new ElfWarlord("protecting");

        HeroFactory factory = new HeroFactoryImpl(sourceBeast, sourceMage, sourceWarlord);

        Beast beast = factory.createBeast();
        Mage mage = factory.createMage();
        Warlord warlord = factory.createWarlord();

        System.out.println(beast);
        System.out.println(mage);
        System.out.println(warlord);

        Assert.isTrue(sourceBeast.equals(beast));
        Assert.isTrue(sourceMage.equals(mage));
        Assert.isTrue(sourceWarlord.equals(warlord));

        sourceBeast = new OrcBeast("axe");
        sourceMage = new OrcMage("sword");
        sourceWarlord = new OrcWarlord("laser");

        factory = new HeroFactoryImpl(sourceBeast, sourceMage, sourceWarlord);

        beast = factory.createBeast();
        mage = factory.createMage();
        warlord = factory.createWarlord();

        System.out.println(beast);
        System.out.println(mage);
        System.out.println(warlord);

        Assert.isTrue(sourceBeast.equals(beast));
        Assert.isTrue(sourceMage.equals(mage));
        Assert.isTrue(sourceWarlord.equals(warlord));
    }
}
