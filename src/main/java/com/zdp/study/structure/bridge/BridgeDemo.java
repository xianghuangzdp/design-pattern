package com.zdp.study.structure.bridge;

/**
 * @author zdp
 * @date 2021/4/4
 * @desc 桥接模式demo
 * 组合优于继承。桥接模式可以看做两个层次的抽象，通过桥接模式，你可以将抽象和实现解耦，使他们独立变化
 * 在这个demo中，武器的抽象和附魔的实现都有他们自己的继承层级，当附魔接口发生变化时，不会影响使用武器的客户端。我们可以很容易的将任何武器组合任意的附魔类型，而不是创造一个更深的继承层次
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Sword sword = new Sword(new SoulEatingEnchantment());
        sword.wield();
        sword.swing();
        sword.unwield();

        Hammer hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }
}
