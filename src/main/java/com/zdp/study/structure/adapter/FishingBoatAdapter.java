package com.zdp.study.structure.adapter;

/**
 * @author zdp
 * @date 2021/3/21
 * @desc
 */
public class FishingBoatAdapter implements RowingBoat {

    private final FishingBoat fishingBoat;

    public FishingBoatAdapter() {
        this.fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
