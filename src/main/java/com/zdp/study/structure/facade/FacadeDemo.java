package com.zdp.study.structure.facade;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 门面模式demo
 * 当一个系统比较复杂，或者系统因为类之间有复杂的依赖关系或源代码不可访问导致无法理解的时候，通常会使用门面模式。
 * 这种模式隐藏了大系统的复杂性，对客户端提供一个简单的接口，它通常是一个包含了客户端需要的成员的包装类，
 * 这个包装类代替客户端通过成员访问系统从而隐藏具体的实现
 */
public class FacadeDemo {

    public static void main(String[] args) {
        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
