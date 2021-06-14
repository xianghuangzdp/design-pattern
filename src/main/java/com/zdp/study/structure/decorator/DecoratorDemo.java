package com.zdp.study.structure.decorator;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 装饰者模式demo
 * 装饰者模式是一种相对子类来说更加灵活的选择，装饰类和目标类实现同样的接口，通过组合，可以在运行时动态的改变目标类的行为
 * 在本例中，使用{@link ClubbedTroll} 装饰{@link SimpleTroll} 类，SimpleTroll执行攻击然后撤回，经过装饰后，新增了一次攻击行为
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        SimpleTroll troll = new SimpleTroll();
        troll.attack();;
        System.out.println(troll.getAttackPower());
        troll.fleeBattle();

        ClubbedTroll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        System.out.println(clubbedTroll.getAttackPower());
        clubbedTroll.fleeBattle();
    }
}
