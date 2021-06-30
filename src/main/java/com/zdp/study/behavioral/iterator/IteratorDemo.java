package com.zdp.study.behavioral.iterator;

import com.zdp.study.behavioral.iterator.list.ItemType;
import com.zdp.study.behavioral.iterator.list.TreasureChest;
import com.zdp.study.behavioral.iterator.list.TreasureChestIterator;

/**
 * @author zdp
 * @date 2021/7/1
 * @desc 迭代器模式
 * 迭代器模式用于遍历和访问一个容器的元素，迭代器模式将遍历算法与容器本身解耦
 */
public class IteratorDemo {

    public static final TreasureChest TREASURE_CHEST = new TreasureChest();

    public static void demonstrateTreasureChestIteratorForType(ItemType itemType){
        TreasureChestIterator iterator = TREASURE_CHEST.iterator(itemType);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        demonstrateTreasureChestIteratorForType(ItemType.ANY);
        demonstrateTreasureChestIteratorForType(ItemType.WEAPON);
        demonstrateTreasureChestIteratorForType(ItemType.RING);
        demonstrateTreasureChestIteratorForType(ItemType.POTION);
    }
}
