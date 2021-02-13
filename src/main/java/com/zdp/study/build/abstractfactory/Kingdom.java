package com.zdp.study.build.abstractfactory;

import com.zdp.study.build.abstractfactory.army.Army;
import com.zdp.study.build.abstractfactory.castle.Castle;
import com.zdp.study.build.abstractfactory.king.King;
import lombok.Data;

/**
 * @author zdp
 * @date 2021/2/13 23:00
 * @desc 王国
 */
@Data
public class Kingdom {
    private King king;
    private Castle castle;
    private Army army;

    @Override
    public String toString() {
        return "Kingdom {" +
                "king = " + king.desc() +
                ", castle = " + castle.desc() +
                ", army = " + army.desc() +
                '}';
    }
}
