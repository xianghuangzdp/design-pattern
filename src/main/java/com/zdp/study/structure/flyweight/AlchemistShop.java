package com.zdp.study.structure.flyweight;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc
 */
public class AlchemistShop {

    private final List<Potion> topShelf = Lists.newArrayList();

    private final List<Potion> bottomShelf = Lists.newArrayList();

    public AlchemistShop() {
        PotionFactory factory = new PotionFactory();
        topShelf.add(factory.createPotion(PotionType.INVISIBILITY));
        topShelf.add(factory.createPotion(PotionType.INVISIBILITY));
        topShelf.add(factory.createPotion(PotionType.STRENGTH));
        topShelf.add(factory.createPotion(PotionType.HEALING));
        topShelf.add(factory.createPotion(PotionType.INVISIBILITY));
        topShelf.add(factory.createPotion(PotionType.STRENGTH));
        topShelf.add(factory.createPotion(PotionType.HEALING));
        topShelf.add(factory.createPotion(PotionType.HEALING));

        bottomShelf.add(factory.createPotion(PotionType.POISON));
        bottomShelf.add(factory.createPotion(PotionType.POISON));
        bottomShelf.add(factory.createPotion(PotionType.POISON));
        bottomShelf.add(factory.createPotion(PotionType.HOLY_WATER));
        bottomShelf.add(factory.createPotion(PotionType.HOLY_WATER));
    }

    public List<Potion> getTopShelf(){
        return Arrays.asList(Arrays.copyOf(topShelf.toArray(new Potion[topShelf.size()]),topShelf.size()));
    }

    public List<Potion> getBottomShelf(){
        return Arrays.asList(Arrays.copyOf(bottomShelf.toArray(new Potion[bottomShelf.size()]),bottomShelf.size()));
    }

    public void enumerate(){
        System.out.println("Enumerate top shelf potion");
        topShelf.forEach(Potion::drink);

        System.out.println("Enumerate bottom shelf potion");
        bottomShelf.forEach(Potion::drink);
    }
}
