package com.zdp.study.build.prototype.impl;

import com.zdp.study.build.prototype.Beast;
import com.zdp.study.build.prototype.HeroFactory;
import com.zdp.study.build.prototype.Mage;
import com.zdp.study.build.prototype.Warlord;
import lombok.NonNull;

/**
 * @author zdp
 * @date 2021/2/15 17:34
 * @desc 英雄建造工厂实现
 */
public class HeroFactoryImpl implements HeroFactory {

    private Beast beast;

    private Mage mage;

    private Warlord warlord;

    public HeroFactoryImpl(@NonNull Beast beast, @NonNull Mage mage, @NonNull Warlord warlord) {
        this.beast = beast;
        this.mage = mage;
        this.warlord = warlord;
    }

    @Override
    public Beast createBeast() {
        return (Beast)beast.copy();
    }

    @Override
    public Mage createMage() {
        return (Mage)mage.copy();
    }

    @Override
    public Warlord createWarlord() {
        return (Warlord)warlord.copy();
    }
}
