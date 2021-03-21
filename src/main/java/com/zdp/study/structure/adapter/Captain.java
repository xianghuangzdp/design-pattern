package com.zdp.study.structure.adapter;

/**
 * @author zdp
 * @date 2021/3/21
 * @desc 队长
 */
public class Captain {

    private final RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row(){
        rowingBoat.row();
    }
}
