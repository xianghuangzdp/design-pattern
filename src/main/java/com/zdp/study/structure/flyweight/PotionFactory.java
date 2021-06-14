package com.zdp.study.structure.flyweight;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.function.Supplier;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc
 */
public class PotionFactory {

    private final Map<PotionType,Potion> potionMap = Maps.newHashMap();

    private static final Map<PotionType, Supplier<Potion>> potionBuilder = Maps.newHashMap();
    static {
        potionBuilder.put(PotionType.HEALING,()-> new HealingPotion());
        potionBuilder.put(PotionType.INVISIBILITY,()-> new InvisibilityPotion());
        potionBuilder.put(PotionType.STRENGTH,()-> new StrengthPotion());
        potionBuilder.put(PotionType.HOLY_WATER,()-> new HolyWaterPotion());
        potionBuilder.put(PotionType.POISON,()-> new PoisonPotion());
    }

    public Potion createPotion(PotionType potionType){
        if (potionMap.containsKey(potionType) && potionMap.get(potionType) != null){
            return potionMap.get(potionType);
        }

        Potion result = potionBuilder.get(potionType).get();
        potionMap.put(potionType,result);

        return result;
    }
}
