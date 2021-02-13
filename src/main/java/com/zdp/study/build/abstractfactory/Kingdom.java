package com.zdp.study.build.abstractfactory;

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
}
