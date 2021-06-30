package com.zdp.study.behavioral.iterator.list;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author zdp
 * @date 2021/7/1
 * @desc 宝藏集合
 */
public class TreasureChest {

    private final List<Item> items;

    public TreasureChest() {
        this.items = Lists.newArrayList(
            new Item(ItemType.POTION, "Potion of courage"),
            new Item(ItemType.RING, "Ring of shadows"),
            new Item(ItemType.POTION, "Potion of wisdom"),
            new Item(ItemType.POTION, "Potion of blood"),
            new Item(ItemType.WEAPON, "Sword of silver +1"),
            new Item(ItemType.POTION, "Potion of rust"),
            new Item(ItemType.POTION, "Potion of healing"),
            new Item(ItemType.RING, "Ring of armor"),
            new Item(ItemType.WEAPON, "Steel halberd"),
            new Item(ItemType.WEAPON, "Dagger of poison")
        );
    }

    public TreasureChestIterator iterator(ItemType itemType){
        return new TreasureChestIterator(this,itemType);
    }

    public List<Item> getItems() {
        return Lists.newArrayList(items);
    }
}
