package com.zdp.study.structure.adapter;

/**
 * @author zdp
 * @date 2021/3/21
 * @desc 适配器模式demo
 * 适配器模式可以帮助两个不适配的接口工作，他实现适配的对象的接口，并且持有被适配的对象，通过调用被适配对象的方法实现适配对象的方法
 */
public class AdapterDemo {

    public static void main(String[] args) {
        /**
         * captain 本来只可以操纵RowingBoat，通过适配器，也可以操纵fishingBoat
         */
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
