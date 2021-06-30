package com.zdp.study.behavioral.iterator.list;

/**
 * @author zdp
 * @date 2021/7/1
 * @desc 元素
 */
public class Item {

    private ItemType itemType;

    private final String name;

    public Item(ItemType itemType, String name) {
        this.itemType = itemType;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public final void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
}
