package com.zdp.study.behavioral.iterator.list;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

/**
 * @author zdp
 * @date 2021/7/1
 * @desc 宝藏集合迭代器
 */
public class TreasureChestIterator {

    public static final int INIT_INDEX = -1;

    public static final int END_INDEX = -2;

    private final TreasureChest treasureChest;

    private final ItemType itemType;

    private int index;

    public TreasureChestIterator(TreasureChest treasureChest, ItemType itemType) {
        this.treasureChest = treasureChest;
        this.itemType = itemType;
        index = INIT_INDEX;
    }

    public Item next(){
        int nextIndex = findNextIndex();
        if (nextIndex <= END_INDEX){
            index = END_INDEX;
            return null;
        } else {
            if (nextIndex + 1 < treasureChest.getItems().size()){
                index = nextIndex + 1;
            } else {
                index = END_INDEX;
            }

            return treasureChest.getItems().get(nextIndex);
        }
    }

    public boolean hasNext(){
        return findNextIndex() >= INIT_INDEX;
    }

    private int findNextIndex(){
        List<Item> items = treasureChest.getItems();

        int tempIndex = index;
        if (tempIndex < INIT_INDEX){
            return index;
        }

        if (tempIndex < 0){
            tempIndex = 0;
        }


        return IntStream.range(tempIndex, items.size()).boxed()
                .filter(i -> itemType == ItemType.ANY || items.get(i).getItemType() == itemType)
                .findFirst().orElse(END_INDEX);
    }
}
