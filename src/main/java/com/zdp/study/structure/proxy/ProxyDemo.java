package com.zdp.study.structure.proxy;

/**
 * @author zdp
 * @date 2021/3/21
 * @desc 代理模式demo
 * 代理模式通常是一个作为其他事物接口的类，比如网络接口、大的内存对象、文件、开销很大或者独一无二的资源等等。
 * 简而言之，代理是一个给客户端调用的对象，屏蔽了背后对真实对象的调用
 * 代理模式提供了一个包装类，你可以在包装类里面做一个其他功能而不用改变原有的代码
 */
public class ProxyDemo {

    public static void main(String[] args) {
        WizardTower tower = new WizardTowerProxy(new IvoryTower());
        tower.enter(new Wizard("Red wizard"));
        tower.enter(new Wizard("White wizard"));
        tower.enter(new Wizard("Black wizard"));
        tower.enter(new Wizard("Green wizard"));
        tower.enter(new Wizard("Brown wizard"));
    }
}
