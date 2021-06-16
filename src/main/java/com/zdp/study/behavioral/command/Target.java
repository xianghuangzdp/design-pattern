package com.zdp.study.behavioral.command;

import lombok.Data;

/**
 * @author zdp
 * @date 2021/6/14
 * @desc 咒语执行目标
 */
@Data
public class Target {

    protected Visibility visibility;

    protected Size size;

    public void printStatus(){
        System.out.println("visibility = " + visibility + " size = " + size);
    }
}
